package com.example.mallk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ImgActivity extends FragmentActivity {

	ArrayAdapter<String> adaptador;
	ArrayList<Photo> tiendas;
	ListView listaComentarios;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_img);
		listaComentarios = (ListView)findViewById(R.id.ListViewFotoComentario);

		adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listaComentarios.setAdapter(adaptador);
        getDatos();
		ArrayList<Comment> comentarios = tiendas.get(tiendas.size()-1).getCommentList();
        for(int i=0;i<comentarios.size(); i++){
        	
            adaptador.add(comentarios.get(i).toString());
        }
        adaptador.notifyDataSetChanged();
 
	
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
        Type tipoTiendas = new TypeToken<List<Photo>>(){}.getType();
        tiendas = gson.fromJson(miCadenaJson, tipoTiendas);   
       
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}
	

}
