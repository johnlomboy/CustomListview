package com.lomby.customlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView listView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// new data for Weather
		final Weather weather_data[] = new Weather[] {
				new Weather(R.drawable.cloud, "Cloudy"),
				new Weather(R.drawable.rain, "Showers"),
				new Weather(R.drawable.snow, "Snow"),
				new Weather(R.drawable.thunder, "Storm"),
				new Weather(R.drawable.sun, "Sunny") };

		// passing of data and layout
		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView = (ListView) findViewById(R.id.listview);
		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_row, null);

		// implement header
		listView.addHeaderView(header);

		// set adapter
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {

				Intent i = new Intent(MainActivity.this, WeatherActivity.class);

				i.putExtra("keyTitle", weather_data[position - 1].getTitle());
				i.putExtra("keyPosition", weather_data[position - 1].getIcon());

				startActivity(i);

			}
		});

	}
}
