package com.example.testdiproject.controller;

import roboguice.inject.ContextSingleton;
import android.app.Activity;
import android.content.Intent;

@ContextSingleton
public class ActivityController extends AbstractBaseController {

	@Override
	public void sendActivity(Activity activity, String actionName) {
		Intent intent = null;

		if (actionName.equals("toSecond")) {
			intent = new Intent(activity,
					com.example.testdiproject.view.SecondActivity.class);
			activity.finish();
		}

		if (actionName.equals("toMain")) {
			intent = new Intent(activity,
					com.example.testdiproject.view.MainActivity.class);
			activity.finish();
		}

		getContext().startActivity(intent);

	}

}
