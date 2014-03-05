package com.example.mallk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StoreDetActivity extends FragmentActivity {
	
	Intent intent = null;
	//TextView textView;
	TextView txvNombre;
	TextView txvDireccion;
	TextView txvTelefono;
	TextView txvHorario;
	TextView txvWebsite;
	TextView txvEmail;
	String cadena2="";
	ArrayAdapter<String> adaptador;
	ArrayList<Store> tiendas;
	ListView listaComentarios;
	
	int indice = 0;
	public static final int CONSTANTE1 = 0;
	public static final String CADENA1 = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
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
		listaComentarios = (ListView)findViewById(R.id.ListaComentarios);

		if (indice == 0) {
			indice =0;
			
		} else {
			indice =1;
			
		}
		
		
		Button btnLlamar = (Button) findViewById(R.id.button1);
		
		
		adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listaComentarios.setAdapter(adaptador);
        getDatos();
		ArrayList<Comment> comentarios = tiendas.get(indice).getComentarios();
        for(int i=0;i<comentarios.size(); i++){
        	
            adaptador.add(comentarios.get(i).toString());
        }
        adaptador.notifyDataSetChanged();
        txvNombre.setText(tiendas.get(indice).getNombre().toString());
		Linkify.addLinks(txvNombre, Linkify.ALL);
		txvDireccion.setText(tiendas.get(indice).getDireccion().toString());
		Linkify.addLinks(txvDireccion, Linkify.ALL);
		txvTelefono.setText(tiendas.get(indice).getTelefono().toString());
		
		Linkify.addLinks(txvTelefono, Linkify.ALL);
		txvHorario.setText(tiendas.get(indice).getHorario().toString());
		Linkify.addLinks(txvHorario, Linkify.ALL);
		txvWebsite.setText(tiendas.get(indice).getWebsite().toString());
		Linkify.addLinks(txvWebsite, Linkify.ALL);
		txvEmail.setText(tiendas.get(indice).getEmail().toString());
		Linkify.addLinks(txvEmail, Linkify.ALL);
		
		btnLlamar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel: "+tiendas.get(indice).getTelefono().toString()));
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
	
	
	public void getDatos(){
        StringBuffer StringB = new StringBuffer();
        BufferedReader BufferR = null;
        try {
        	BufferR = new BufferedReader(new InputStreamReader(getAssets().open(
                    "Tiendas.json")));
            String Temporal;
            while ((Temporal = BufferR.readLine()) != null)
            	StringB.append(Temporal);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
            	BufferR.close(); // stop reading
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String miCadenaJson = StringB.toString();
        Gson gson = new Gson();
        Type tipoTiendas = new TypeToken<List<Store>>(){}.getType();
        tiendas = gson.fromJson(miCadenaJson, tipoTiendas);   
       
    }
	

}
