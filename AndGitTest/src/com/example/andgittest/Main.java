package com.example.andgittest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("음음");
	}
}
