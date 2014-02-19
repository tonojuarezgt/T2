package com.example.mallk;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayList<String> tiendas = new ArrayList<String>();
		
		tiendas.add("Tienda 1");
		tiendas.add("tienda 2");
		tiendas.add("Foto");
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tiendas);
		
		ListView list = (ListView)findViewById(R.id.listView);
		list.setAdapter(adapter);
		list.setTextFilterEnabled(true);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
			if(arg2!=0 && arg2 !=1){
				intent = new Intent(getApplicationContext(),ImgActivity.class);
				startActivity(intent);
			}else{
				intent = new Intent(getApplicationContext(),StoreDetActivity.class);
				intent.putExtra(StoreDetActivity.CADENA1, arg2);
				startActivity(intent);
			}
			}});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	
	

}
