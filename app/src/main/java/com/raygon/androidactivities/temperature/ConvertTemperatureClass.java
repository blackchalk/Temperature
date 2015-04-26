package com.raygon.androidactivities.temperature;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ConvertTemperatureClass extends Activity {

    private EditText inputVal=null;
    private TextView outputVal=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_temperature_class);
        inputVal=(EditText) findViewById(R.id.inputVal);
        outputVal=(TextView)findViewById(R.id.outputVal);
    }
    public float convertIt(){
        Float f;
        f=Float.parseFloat(inputVal.getText().toString());
        return((f-32)*5/9);

    }
    public void showCelcius(View v){
        Float c;
        c=convertIt();
        outputVal.setText(c+" degree C");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_convert_temperature_class, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
