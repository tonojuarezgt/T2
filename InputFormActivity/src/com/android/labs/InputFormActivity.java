package com.android.labs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class InputFormActivity extends Activity implements OnClickListener 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.inputformscreen);
		
		Button btn = (Button)findViewById(R.id.btnSubmitName);
	    btn.setOnClickListener(new OnClickListener()
	    {
	    	@Override
	    	public void onClick(View v) 
	    	{
	    		// TODO Auto-generated method stub
	    		EditText text = (EditText)findViewById(R.id.edtTextName);
				Intent i = new Intent(getApplicationContext(), 
	          HelloActivity.class);
				i.putExtra("name", text.getText().toString());
				startActivity(i);
	    	}
	     });
	    	
	    Button btn1 = (Button)findViewById(R.id.mayuscula);
		btn1.setOnClickListener(new OnClickListener()
		{
		   	@Override
		  	public void onClick(View v) 
		   	{
		   		// TODO Auto-generated method stub
		    		EditText text = (EditText)findViewById(R.id.edtTextName);
					Intent i = new Intent(getApplicationContext(), 
		          MayusculaActivity.class);
					i.putExtra("name", text.getText().toString());
					startActivity(i);
		    }
	    	
    	});

		Button btn2 = (Button)findViewById(R.id.IntroNombre);
		btn2.setOnClickListener(new OnClickListener()
		{
		   	@Override
		  	public void onClick(View v) 
		   	{
		   		// TODO Auto-generated method stub
		    		EditText text = (EditText)findViewById(R.id.Nombre);
					Intent i = new Intent(getApplicationContext(), 
		          IngresoNombreActivity.class);
					i.putExtra("name", text.getText().toString());
					startActivity(i);
		    }
	    	
    	});

		Button btn3 = (Button)findViewById(R.id.IntroApellido);
		btn3.setOnClickListener(new OnClickListener()
		{
		   	@Override
		  	public void onClick(View v) 
		   	{
		   		// TODO Auto-generated method stub
		    		EditText text = (EditText)findViewById(R.id.Apellido);
					Intent i = new Intent(getApplicationContext(), 
		          IngresoApellidoActivity.class);
					i.putExtra("name", text.getText().toString());
					startActivity(i);
		    }
	    	
    	
	    });

		Button btn4 = (Button)findViewById(R.id.BPorcentaje);
		btn4.setOnClickListener(new OnClickListener()
		{
		   	@Override
		  	public void onClick(View v) 
		   	{
		   		// TODO Auto-generated method stub
		    		TextView text = (TextView)findViewById(R.id.EPorcentaje);
					Intent i = new Intent(getApplicationContext(), 
		          PorcentajeActivity.class);
					i.putExtra("name", text.getText().toString());
					startActivity(i);
		    }
	    	
    	
	    });

		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
