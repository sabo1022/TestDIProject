package com.example.testdiproject.view;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.testdiproject.R;
import com.example.testdiproject.controller.ActivityController;
import com.google.inject.Inject;

@ContentView(R.layout.activity_secound)
public class SecondActivity extends RoboActivity implements OnClickListener {

	@InjectView(R.id.backToActivityBtn)
	private Button backToActivityBtn;
	
	@Inject
	private ActivityController act;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		backToActivityBtn.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(backToActivityBtn == v){
			act.sendActivity(this,"toMain");
		}
	}

}
