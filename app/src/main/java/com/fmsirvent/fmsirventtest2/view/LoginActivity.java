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

    public static final String ACCESS_TOKEN = "access_token";
    public static final String TOKEN_TYPE = "token_type";
    public static final String EXPIRES_IN = "expires_in";
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
        String clientID = getString(R.string.oauth2_client_id);
        String redirectUri = getString(R.string.oauth2_redirect_uri);
        String url = String.format(getString(R.string.oauth2_service_url), clientID, redirectUri);
        oauth2Webview.loadUrl(url);
        oauth2Webview.setVisibility(View.VISIBLE);
    }

    private void configureViews() {
        setContentView(R.layout.activity_oauth);
        ButterKnife.inject(this);

        oauth2Webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                if (url.startsWith(getString(R.string.oauth2_redirect_uri))) {
                    Uri uri = Uri.parse(url.replace("#","?"));
                    String access_token = uri.getQueryParameter(ACCESS_TOKEN);
                    String token_type = uri.getQueryParameter(TOKEN_TYPE);
                    String expires_in = uri.getQueryParameter(EXPIRES_IN);

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
