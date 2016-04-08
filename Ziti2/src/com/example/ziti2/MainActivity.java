package com.example.ziti2;

import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private Button btn_Go;
	private Xianshi xianshi; 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_Go= (Button)findViewById(R.id.btn_ture);
		xianshi= (Xianshi)findViewById(R.id.XianshiView);
		btn_Go.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				System.out.println("xianshi.Go();");
				xianshi.Go();
				System.out.println("xianshi.Go();");
			}
		});
	}

}	
