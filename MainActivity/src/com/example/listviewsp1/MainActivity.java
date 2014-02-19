package com.example.listviewsp1;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		ArrayList<String> nombres = new ArrayList<String>(); 
		nombres.add("juan");
		nombres.add("pedro");
		nombres.add("maria");
		nombres.add("juan1");
		nombres.add("pedro1");
		nombres.add("maria1");
		nombres.add("juan2");
		nombres.add("pedro2");
		nombres.add("maria2");
		nombres.add("juan3");
		nombres.add("pedro3");
		nombres.add("maria3");
		
	      MyAdapter listItemAdapter = new MyAdapter(this,R.layout.activity2,nombres);

	      ListView lv = (ListView)this.findViewById(R.id.MiLista);
	      lv.setAdapter(listItemAdapter);
		
	      Button btn = (Button)findViewById(R.id.btnDialog);
		  btn.setOnClickListener(new OnClickListener() {	
				@Override
				public void onClick(View v) {
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
			 
						// set title
						alertDialogBuilder.setTitle("Your Title");
			 
						// set dialog message
						alertDialogBuilder
							.setMessage("Click yes to exit!")
							.setCancelable(false)
							.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									// if this button is clicked, close
									// current activity
									MainActivity.this.finish();
								}
							  })
							.setNegativeButton("No",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									// if this button is clicked, just close
									// the dialog box and do nothing
									dialog.cancel();
								}
							});
			 
							// create alert dialog
							AlertDialog alertDialog = alertDialogBuilder.create();
			 
							// show it
							alertDialog.show();
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	class MyAdapter extends ArrayAdapter{

		Context c;
		int textV;
		ArrayList<String> l;
		public MyAdapter(Context context, int textViewResourceId,
				ArrayList<String> list) {
			
			
			super(context, textViewResourceId, list);
			// TODO Auto-generated constructor stub		
			
			this.c=context;
			this.textV=textViewResourceId;
			this.l = list;
		}
		
	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	    	
	    	View v;
	    	if(convertView==null)
	    	{		
	    		LayoutInflater inflator = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    		v  = inflator.inflate(textV, null, true);
	    	}else
	    	{
	    		v = convertView;
	    		
	    	}
		    TextView t= (TextView)v.findViewById(R.id.txtContent);
		    t.setText(l.get(position));
	    	return v;
		}
	}
	
}
