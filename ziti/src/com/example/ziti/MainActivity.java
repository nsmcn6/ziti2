package com.example.ziti;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private Button btn_Go;
	private Xianshi xianshi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_Go=(Button) findViewById(R.id.btn_ture);
		xianshi = (Xianshi) findViewById(R.id.XianshiView);

		Xianshi.etzt = (EditText) findViewById(R.id.TVshuru);
		
		btn_Go.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				xianshi.Go();
				
			}
		});
		}
}

