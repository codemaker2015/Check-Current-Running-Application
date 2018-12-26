package com.example.checkcurrentrunningapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		 
		// Start broadcast receiver may be StartupReceiver not started on BOOT_COMPLETED
		// Check AndroidManifest.xml file
		initialize();
	}

	private void initialize() {
		
		// Start receiver with the name StartupReceiver_Manual_Start
		// Check AndroidManifest.xml file
		getBaseContext().getApplicationContext().sendBroadcast(
				new Intent("StartupReceiver_Manual_Start"));
	}
	
}
