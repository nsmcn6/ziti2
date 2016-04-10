package com.example.ziti;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.GridLayout;


public class Xianshi extends GridLayout {
	
public Xianshi(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initXianShi();
		// TODO �Զ����ɵĹ��캯�����
	}
public Xianshi(Context context, AttributeSet attrs) {
		super(context, attrs);
		initXianShi();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Xianshi(Context context) {
		super(context);
		initXianShi();
		// TODO �Զ����ɵĹ��캯�����
	}
	private int li=5;
	private Card[][] cardsMap=new Card[li][li];
	static String txt;
	private int srlength=0;
	private int hang=li;
	static EditText etzt;
	
/*	public Xianshi(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
*/
	
/*��ں���*/
	protected void initXianShi() {
		setColumnCount(li);
		setBackgroundColor(0xffbbada0);
		
		//0xff��͸��
		
		// TODO �Զ����ɵķ������
	}
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO �Զ����ɵķ������
		super.onSizeChanged(w, h, oldw, oldh);
		int cardWidth=(Math.min(w, h))/li;//�õ�ÿһ��С��Ƭ�Ŀ�� -10:��϶
		addCards(cardWidth, cardWidth);
	}
	
	private void addCards(int cardWidth,int cardHeight){
		Card c;
		System.out.println("addCards hang:"+hang+" li:"+li);
		for (int y = 1; y <= hang; y++) {
			for (int x = 1; x <= li; x++) {
				c= new Card(getContext());
				addView(c,cardWidth,cardWidth);
				cardsMap[x-1][y-1]=c;
			}
		}
	}
	
	void Go() {
		txt = etzt.getText().toString();
		System.out.println(txt);
		srlength=txt.length();
		
		hang=srlength/li;
//		����������������м�һ
		if(srlength%li!=0){
			hang=hang+1;
		}
		System.out.println("Xianshi.java>Go> srlength:"+srlength+" hang:"+hang+" li:"+li);
		// ������Ԫ�ؽ�������
//		for (int x = 0; x < li; x++) {
//			System.out.println("Go for x:"+x);
//			for (int y = 0; y < li; y++) {
//				System.out.println("Go for y:"+y);
//				cardsMap[x][y].setText(n+"");//����ʲô������
//				System.out.println("Go for yset:"+y);
//			}
//		}
//		�������ִ�а�Ҫ���������
		addText();
	}
	private void addText() {
		char[] tc=txt.toCharArray();
		
		for (int y = 1; y <=hang; y++) {
			
			if(y==hang){
				li=hang%srlength;
			}
			for (int x =1; x <= li; x++) {
				if(x+y>=2){//������һ��һ�вŸ�������
					System.out.println("addText��>tc[x+y]:"+tc[x+y-2]+" hang:"+hang+" li:"+li);
					cardsMap[x-1][y-1].setText(tc[x+y-2]+"");
//					cardsMap�Ǵ��㿪ʼ�����
					//�ⲽ�������⣺�����һ��Ҫ���ַ���������ַ���
				}
			}
		}
	}
	//��̬������
	//����������ӿ�Ƭ
}
