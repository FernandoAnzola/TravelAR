package org.TravelAR;


import org.mixare.MixView;
import org.mixare.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
/*PANTALLA DE BIENVENIDA*/
public class HomeLogin extends Activity {
	String user;
	TextView txt_usr, logoff;
	private Button continuar;
	
	
	 public void onCreate(Bundle savedInstanceState) {
		 
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.itinerario);
            
	        txt_usr= (TextView) findViewById(R.id.usr_name);
            logoff= (TextView) findViewById(R.id.logoff);          
            
            Bundle extras = getIntent().getExtras();
            //Obtenemos datos enviados en el intent.
            if (extras != null) {
         	   user  = extras.getString("user");//usuario
            }else{
         	   user="error";
         	   }
            
            txt_usr.setText(user);//cambiamos texto al nombre del usuario logueado
   		   	             
	        logoff.setOnClickListener(new View.OnClickListener(){
	         	
	         	public void onClick(View view){
    	        //'cerrar  sesion' nos regresa a la ventana anterior.      
	         		finish(); 
	         									}
	         	});	     
	        
	        continuar=(Button)findViewById(R.id.continuar);
			continuar.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
				
					Intent mainIntent = new Intent().setClass(HomeLogin.this,MixView.class);
			         startActivity(mainIntent);
				
				}
			});
	        
	        
	 }
	 
//Definimos que para cuando se presione la tecla BACK no volvamos para atras  	 
	 @Override
	 public boolean onKeyDown(int keyCode, KeyEvent event)  {
	     if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	         // no hacemos nada.
	         return true;
	     }

	     return super.onKeyDown(keyCode, event);
	 }
	
	
}
