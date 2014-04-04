package com.example.component_android;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class component_android extends LinearLayout implements OnClickListener {

	public static DatePicker fecha;
	public static Button enviar;
	
	public static DateHandler datehandler;

	//constructor
	public component_android(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}
	
	//los atributos que le paso del xml (constructor)
	public component_android(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public void init() {
		//inflar componente en el layout
		LayoutInflater inflater = (LayoutInflater) getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.component_android, this);

		fecha = (DatePicker) findViewById(R.id.datePicker1);
		enviar = (Button) findViewById(R.id.button1);
		enviar.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Log.i("component","clicked");
		// TODO Auto-generated method stub
		if (v.getId() == R.id.button1) {
			getFecha();
		}
	}

	public static void setHandler(DateHandler newdatehandler){
		datehandler = newdatehandler;		
	}
	
	public static void getFecha() {
		int newday = fecha.getDayOfMonth();
		int newmonth = fecha.getMonth()+1;
		int newyear = fecha.getYear();
		Log.i("component","day: " +newday);
		Date date = new Date(newday, newmonth, newyear);
		datehandler.dateResponse(date);
	}
	
	
}
