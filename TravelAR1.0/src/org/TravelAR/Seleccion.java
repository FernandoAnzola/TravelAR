package org.TravelAR;


import org.mixare.MixView;
import org.mixare.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Seleccion extends Activity {

		private Button seleclogin;
		private Button selecinvitado;
		
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seleccion);
		seleclogin=(Button)findViewById(R.id.seleclogin);
		seleclogin.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				seleclogin();
				
			}
		});
		
		selecinvitado= (Button)findViewById(R.id.selecinvitado);
		selecinvitado.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				selecinvitado();
			}
		});
		
	}
	
	public void seleclogin() {
		 Intent mainIntent = new Intent().setClass(
		         Seleccion.this,Login.class);
		         startActivity(mainIntent);
				
	}
	
	public void selecinvitado() {
		// TODO Auto-generated method stub
		Intent mainIntent = new Intent().setClass(Seleccion.this,MixView.class);
		         startActivity(mainIntent);
				

	}
	
}
