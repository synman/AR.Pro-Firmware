package com.shellware.ARPro.Firmware;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firmware extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button marketButton = (Button) findViewById(R.id.button1);
        
        marketButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
	     	   	try {
//					Intent getFw = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.shellware.AR.Pro.Fire"));
					Intent getFw = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.shellware.AR.Pro"));
					startActivity(getFw);
				} catch (Exception e) {
					// do nothing
				}
	        }
        });
    }
}