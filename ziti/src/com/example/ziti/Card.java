package com.example.ziti;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;

public class Card extends FrameLayout {
	public TextView lable;
	private String Text;
	

	public Card(Context context) {
		super(context);
		lable= new TextView(getContext());
		lable.setTextSize(50);
		lable.setGravity(Gravity.CENTER);
		Drawable tvDrawable = getResources().getDrawable(R.drawable.danbiankegai200); 
		lable.setBackground(tvDrawable);
		
		LayoutParams lp =new LayoutParams(-1,-1); 
		lp.setMargins(10, 10, 0, 0);
		addView(lable,lp);
		System.out.println("Card addView");
		setText("");
		
		// TODO 自动生成的构造函数存根
	}

	public String getText() {
		return Text;
	}
	public void setText(String tc) {
		this.Text=tc;
		System.out.println(" Card setText"+tc);
		if(tc==""){
			System.out.println("Card if setText tong"+tc);
			lable.setText("");
			System.out.println("Card if setText guo"+tc);
		}else{
			System.out.println("Card else setText tong"+tc);
			lable.setText(""+tc);
			System.out.println("Card else setText guo"+tc);
		}
	}
}
