package com.example.mallk;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class StoreDetActivity extends Activity {
	
	Intent intent = null;
	//TextView textView;
	TextView txvNombre;
	TextView txvDireccion;
	TextView txvTelefono;
	TextView txvHorario;
	TextView txvWebsite;
	TextView txvEmail;
	String cadena2="";
	
		
	public static final int CONSTANTE1 = 0;
	public static final String CADENA1 = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		int indice = 0;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store_det);
		intent = getIntent();
		indice = intent.getIntExtra(CADENA1, CONSTANTE1);
		txvNombre = (TextView)findViewById(R.id.textView1);
		txvDireccion = (TextView)findViewById(R.id.textView2);
		txvTelefono = (TextView)findViewById(R.id.textView3);
		txvHorario = (TextView)findViewById(R.id.textView4);
		txvWebsite = (TextView)findViewById(R.id.textView5);
		txvEmail = (TextView)findViewById(R.id.textView6);

		if (indice == 0) {
			txvNombre.setText("Tienda 1");
			Linkify.addLinks(txvNombre, Linkify.ALL);
			txvDireccion.setText("18 Street, 1520 Miami, Fl");
			Linkify.addLinks(txvDireccion, Linkify.ALL);
			txvTelefono.setText("55551235");
			cadena2 = "55551235";
			Linkify.addLinks(txvTelefono, Linkify.ALL);
			txvHorario.setText("Horario de 8:00 a 17:00 Hrs");
			Linkify.addLinks(txvHorario, Linkify.ALL);
			txvWebsite.setText("www.tienda1.com.gt");
			Linkify.addLinks(txvWebsite, Linkify.ALL);
			txvEmail.setText("contacto@tienda1.com.gt");
			Linkify.addLinks(txvEmail, Linkify.ALL);
		} else {
			txvNombre.setText("Tienda 2");
			Linkify.addLinks(txvNombre, Linkify.ALL);
			txvDireccion.setText("3 Avenue, 1234 Stanford, CA");
			Linkify.addLinks(txvDireccion, Linkify.ALL);
			txvTelefono.setText("55551234");
			cadena2 = "55551234";
			Linkify.addLinks(txvTelefono, Linkify.ALL);
			txvHorario.setText("Horario de 8:00 a 17:00 Hrs");
			Linkify.addLinks(txvHorario, Linkify.ALL);
			txvWebsite.setText("www.tienda1.com.gt");
			Linkify.addLinks(txvWebsite, Linkify.ALL);
			txvEmail.setText("contacto@tienda1.com.gt");
			Linkify.addLinks(txvEmail, Linkify.ALL);
		}
		
		Button btnLlamar = (Button) findViewById(R.id.button1);
		btnLlamar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel: "+cadena2));
				startActivity(intent);
		}		
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.store_det, menu);
		return true;
		
	}
	
	

}
