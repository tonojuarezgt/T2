package com.android.labs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MayusculaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        Bundle b = this.getIntent().getExtras();                  
        String data = b.getString("name");
        
        String Mayus = data.toUpperCase();
        String curChar = "";
        
        for (int j = 0; j < Mayus.length() ; j += 1 )
        {
        	curChar = (curChar + Mayus.charAt(j) + " ");
        }
        
        TextView tv = (TextView)findViewById(R.id.txtHello);
        tv.setText( curChar );

    }
}
