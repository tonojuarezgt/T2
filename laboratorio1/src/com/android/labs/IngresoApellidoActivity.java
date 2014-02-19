package com.android.labs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class IngresoApellidoActivity extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        Bundle b = this.getIntent().getExtras();                  
        String data = b.getString("name");
        
        TextView tvApellido = (TextView)findViewById(R.id.txtHello);
        tvApellido.setText("El Apellido es: " + data);

    }
}
