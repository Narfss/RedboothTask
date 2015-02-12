package com.fmsirvent.fmsirventtest2.view;

import android.app.Fragment;
import android.content.Intent;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

/**
 * Created by narf on 12/02/15.
 */
public abstract class BaseFragment extends Fragment implements BaseError {

    private static final int OAUTH_UPDATE = 1;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == OAUTH_UPDATE) {
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

    abstract void loadData();
}
