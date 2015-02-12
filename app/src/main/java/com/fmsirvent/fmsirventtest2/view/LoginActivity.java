package com.fmsirvent.fmsirventtest2.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginView;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginViewBoundary;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by narf on 12/02/15.
 */
public class LoginActivity extends ActionBarActivity implements LoginView {

    LoginViewBoundary loginViewBoundary;

    @InjectView(R.id.oauth2_webview)
    WebView oauth2Webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureViews();

        configureBusiness();

        openurl();
    }

    private void configureBusiness() {
        loginViewBoundary = LoginViewBoundary.newInstance(this);
    }

    private void openurl() {
        String clientID = "61e53f179fa7849edb35f0a70f15199ae52bdab1b53e247f5bad24e00b7527bc";
        String redirectUri = "http%3A%2F%2Ffmsirvent.com";
        String url = "https://redbooth.com/oauth2/authorize?client_id="+ clientID +"&response_type=token&redirect_uri="+ redirectUri;
        oauth2Webview.loadUrl(url);
        oauth2Webview.setVisibility(View.VISIBLE);
    }

    private void configureViews() {
        setContentView(R.layout.activity_oauth);
        ButterKnife.inject(this);

        oauth2Webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                if (url.startsWith("http://fmsirvent.com")) {
                    Uri uri = Uri.parse(url.replace("#","?"));
                    String access_token = uri.getQueryParameter("access_token");
                    String token_type = uri.getQueryParameter("token_type");
                    String expires_in = uri.getQueryParameter("expires_in");

                    oauth2Webview.setVisibility(View.GONE);
                    loginViewBoundary.saveToken(access_token, token_type, expires_in);
                    finish();
                } else {
                    view.loadUrl(url);
                }

                return false;
            }
        });
    }

    public static Intent createIntent(Context context) {
        return new Intent(context,LoginActivity.class);
    }
}
