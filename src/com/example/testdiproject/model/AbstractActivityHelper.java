package com.example.testdiproject.model;

import android.app.Activity;
import android.content.Context;

import com.google.inject.Inject;

public class AbstractActivityHelper {

	@Inject
    private Context mContext;
	

    protected Activity getActivity() {
        return (Activity) mContext;
    }

    protected Context getContext() {
        return mContext;
    }

}
