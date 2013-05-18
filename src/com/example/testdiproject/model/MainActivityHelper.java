package com.example.testdiproject.model;

import roboguice.inject.ContextSingleton;

@ContextSingleton
public class MainActivityHelper extends AbstractActivityHelper {
	public String Hello(){
		return "Hello DI";		
	}
}
