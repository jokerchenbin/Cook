/**
 * 
 */
package com.loongjoy.cook.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.loongjoy.cook.R;


/** 
 * @author long_xia@loongjoy.com
 * @version 创建时间：2016年1月20日 下午4:11:29 
 * 
 */
/**
 * @author long_xia@loongjoy.com
 *
 */
public class OrderFragment extends Fragment implements OnTouchListener,  OnClickListener {

	private LinearLayout content1Layout, content2Layout;
	private RelativeLayout orderLayout;
	
	private Button orderDateBtn;//日期搜索
	private Button orderSearchBtn;//输入框搜索

	private int oldY = 0;//点击值
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.Fragment#onResume()
	 */
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_order, null);
		initTopBar(v);

		return v;
	}



	private void initTopBar(View v) {
		Button topBarLeftBtn = (Button) v.findViewById(R.id.topBarLeftBtn);
		topBarLeftBtn.setBackgroundResource(R.drawable.btn_back);
		TextView topBarTitleView = (TextView) v.findViewById(R.id.topBarTitleView);
		topBarTitleView.setText(getResources().getString(R.string.order));
		Button topBarRightBtn = (Button) v.findViewById(R.id.topBarRightBtn);
		topBarRightBtn.setVisibility(View.GONE);
		topBarLeftBtn.setVisibility(View.GONE);
	}


	@Override
	public void onClick(View v) {

	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		return false;
	}
}
