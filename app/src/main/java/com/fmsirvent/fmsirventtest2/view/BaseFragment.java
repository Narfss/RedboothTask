package com.fmsirvent.fmsirventtest2.view;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import butterknife.InjectView;
import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.LifecycleCallback;
import de.keyboardsurfer.android.widget.crouton.Style;

/**
 * Created by narf on 12/02/15.
 */
public abstract class BaseFragment extends Fragment implements BaseError {

    public static final int OAUTH_UPDATE = 1;
    public static final int EDIT_EVENT = 2;

    @InjectView(R.id.background_loading)
    protected FrameLayout backgroundLoading;

    @InjectView(R.id.background_alert)
    protected FrameLayout backgroundAlert;
    @InjectView(R.id.background_image)
    protected ImageView backgroundImage;
    @InjectView(R.id.background_message)
    protected TextView backgroundMessage;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == OAUTH_UPDATE) {
            loadData();
        } else if (requestCode == EDIT_EVENT
                && resultCode == Activity.RESULT_OK) {
            loadData();
        }
    }

    @Override
    public void notifyError(ErrorType errorType, String message) {
        switch (errorType) {
            case CONNECTION:
                displayMessage(errorType, getString(R.string.connection_error));
                break;
            case UNPROCESSABLE_ENTITY:
                displayMessage(errorType, message);
                break;
            case TOKEN_FAIL:
                startActivityForResult(LoginActivity.createIntent(getActivity()), OAUTH_UPDATE);
                break;
            case UNDEFINED_ERROR:
            default:
                displayMessage(errorType, message);
                break;
        }
    }

    protected abstract void loadData();

    public void notifySuccess(String message, final ActionSuccess actionSuccess) {
        final Crouton crouton = Crouton.makeText(getActivity(), message, Style.CONFIRM);
        crouton.setLifecycleCallback(new LifecycleCallback() {
            @Override
            public void onDisplayed() {

            }

            @Override
            public void onRemoved() {
                switch (actionSuccess) {
                    case FINISH:
                        getActivity().setResult(Activity.RESULT_OK, new Intent());
                        getActivity().onBackPressed();
                        break;
                    case RELOAD:
                        loadData();
                        break;
                }
            }
        });
        crouton.show();
    }

    public void enableLoading(boolean enable){
        backgroundLoading.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        backgroundAlert.setVisibility(View.GONE);
        backgroundLoading.setVisibility((enable) ? View.VISIBLE : View.GONE);
    }

    public void displayMessage(ErrorType errorType, String message) {
        enableLoading(false);
        backgroundAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backgroundLoading.setVisibility(View.GONE);
                backgroundAlert.setVisibility(View.GONE);
                loadData();
            }
        });

        backgroundLoading.setVisibility(View.GONE);
        backgroundAlert.setVisibility(View.VISIBLE);
        switch (errorType) {
            case CONNECTION:
                backgroundImage.setImageResource(R.mipmap.ic_connection_error);
                break;
            case TOKEN_FAIL:
            case UNDEFINED_ERROR:
            default:
                backgroundImage.setImageResource(R.mipmap.ic_undefined_error);
                break;
        }
        backgroundMessage.setText(((message != null) ? message : getString(R.string.connection_error)) + getString(R.string.press_to_continue));

    }
}
