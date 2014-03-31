package com.lomby.customlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherActivity extends Activity {

	private String title;
	private int position;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weather_activity);

		ImageView img = (ImageView) findViewById(R.id.imgIcon1);
		TextView tv = (TextView) findViewById(R.id.txtTitle1);

		Intent getIntent = getIntent();
		title = getIntent.getStringExtra("keyTitle");
		position = getIntent.getExtras().getInt("keyPosition");

		tv.setText(title);
		img.setBackgroundResource(position);

	}

}
