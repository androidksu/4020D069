package com.example.a01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	EditText TIM, TIM1;
	Button TIM2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TIM = (EditText)findViewById(R.id.editText1);
         TIM1 = (EditText)findViewById(R.id.editText2);
         TIM2 = (Button)findViewById(R.id.button1);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void Calc(View view){
    	double TI =Double.parseDouble(TIM.getText().toString())/100;
    	double TM1 =Double.parseDouble(TIM1.getText().toString());
    	double IM2 =TM1 /(TI*TI);
    	TextView text=(TextView)findViewById(R.id.textView2);
    	 text.setText(String.valueOf(IM2));
    	//String height=TIM.getText().toString();
    }
}
