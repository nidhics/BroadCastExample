package com.example.broadcastapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;


public class ForthActivity extends MainActivity{

	public static final String ABC_ACTION= "my_action";
	public static final String STRING_EXTRA_KEY = "my-key";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setButtonText("End of all activity");
		
		Intent abcIntent = new Intent();
		abcIntent.setAction(ABC_ACTION);
		abcIntent.putExtra(STRING_EXTRA_KEY, "ccccccccc");
		
		LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(abcIntent);
		
	
	}

}
