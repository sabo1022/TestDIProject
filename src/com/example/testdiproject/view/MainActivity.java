package com.example.testdiproject.view;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.testdiproject.R;
import com.example.testdiproject.controller.ActivityController;
import com.example.testdiproject.model.MainActivityHelper;
import com.google.inject.Inject;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity implements OnClickListener {

	@InjectView(R.id.textView1)
	private TextView tv;
	
	@InjectView(R.id.changeTextBtn)
	private Button changeTextBtn;
	
	@InjectView(R.id.toSecondBtn)
	private Button toSecondBtn;
	
	@Inject
    private MainActivityHelper mActivityHelper;
	
	@Inject
	private ActivityController act;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		changeTextBtn.setOnClickListener(this);
		toSecondBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if(changeTextBtn == view){
			tv.setText(mActivityHelper.Hello());
		}
		
		if(toSecondBtn == view){
			act.sendActivity(this,"toSecond");
		}
	}

}
