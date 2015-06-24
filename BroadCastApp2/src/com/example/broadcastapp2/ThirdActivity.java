package com.example.broadcastapp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class ThirdActivity extends MainActivity {
	Button btn1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setButtonText("Launch Third Activity");
		
		btn1 = (Button) findViewById(R.id.button1);
	  
		btn1.setText("Launch Third activity"); 
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(ThirdActivity.this, ForthActivity.class);
				startActivity(in);
			}
		}); 
	}

}
