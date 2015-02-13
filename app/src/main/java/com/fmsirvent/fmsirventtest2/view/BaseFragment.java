package com.fmsirvent.fmsirventtest2.view;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;

import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.LifecycleCallback;
import de.keyboardsurfer.android.widget.crouton.Style;

/**
 * Created by narf on 12/02/15.
 */
public abstract class BaseFragment extends Fragment implements BaseError {

    public static final int OAUTH_UPDATE = 1;
    public static final int CREATE_ELEMENT = 2;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == OAUTH_UPDATE) {
            loadData();
        } else if (requestCode == CREATE_ELEMENT
                && resultCode == Activity.RESULT_OK) {
            loadData();
        }
    }

    @Override
    public void notifyError(ErrorType errorType) {
        switch (errorType) {
            case TOKEN_FAIL:
                startActivityForResult(LoginActivity.createIntent(getActivity()), OAUTH_UPDATE);
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
                        getActivity().finish();
                        break;
                    case RELOAD:
                        loadData();
                        break;
                }
            }
        });
        crouton.show();
    }
}
