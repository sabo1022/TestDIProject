package com.example.testdiproject.controller;

import android.app.Activity;
import android.content.Context;

import com.google.inject.Inject;

public abstract class AbstractBaseController {
	@Inject
    private Context mContext;
	

    protected Activity getActivity() {
        return (Activity) mContext;
    }

    protected Context getContext() {
        return mContext;
    }
    
    abstract void sendActivity(Activity activity, String actionName);
}
