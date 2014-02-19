package com.android.labs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PorcentajeActivity extends Activity{
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        Bundle b = this.getIntent().getExtras();                  
        String data = b.getString("name");
        
        TextView tvPorcentaje = (TextView)findViewById(R.id.EPorcentaje);
                
       try
       {
        	double propina = Float.parseFloat(tvPorcentaje.getText().toString());
        	TextView tvNombre = (TextView)findViewById(R.id.txtHello);
        	tvNombre.setText("La Propina es: " +propina);
       }
       catch(Exception e)
       {
        	TextView tvNombre = (TextView)findViewById(R.id.txtHello);
        	tvNombre.setText("Se debe introducir solo numeros");
      };

    }
}
