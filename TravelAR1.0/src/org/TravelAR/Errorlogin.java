package org.TravelAR;

import java.util.Timer;
import java.util.TimerTask;

import org.mixare.R;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Errorlogin extends Activity{
	private static final long DELAY = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		 setContentView(R.layout.nologin);
		 
	        TimerTask task = new TimerTask() {
	            @Override
	            public void run() {
	 
	                // Start the next activity
	                Intent mainIntent = new Intent().setClass( Errorlogin.this,Login.class);
	                startActivity(mainIntent);
	 
	                // Close the activity so the user won't able to go back this
	                // activity pressing Back button
	                finish();
	            }
	        };
	 
	        // Simulate a long loading process on application startup.
	        Timer timer = new Timer();
	        timer.schedule(task, DELAY);
	    }
		
		
	}
	


