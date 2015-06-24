package com.example.broadcastapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends MainActivity {
	MyReceiver mr ;
	Button btn1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setButtonText("Launch second Activity");
		mr = new MyReceiver();
		LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(mr, new IntentFilter(ForthActivity.ABC_ACTION) );
		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(SecondActivity.this, ThirdActivity.class);
				startActivity(in);
			}
		});
	}
	public class MyReceiver extends BroadcastReceiver{
		public void onReceive(Context context, Intent intent) {
			if (intent.getAction().equals(ForthActivity.ABC_ACTION)){
				Log.i("abc", ForthActivity.ABC_ACTION + " received");
				String result = intent.getStringExtra(ForthActivity.STRING_EXTRA_KEY);
				Log.i("abc", "the extra information passed from 2nd activity to first is: " + result);
			}
		
		}
	} 
	protected void onDestroy() {
		LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(mr);
		super.onDestroy();
	}
}