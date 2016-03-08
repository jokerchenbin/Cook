/**
 * 
 */
package com.loongjoy.cook.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.loongjoy.cook.R;
import com.loongjoy.cook.utils.Logger;


/** 
 * @author long_xia@loongjoy.com
 * @version 创建时间：2016年1月20日 上午11:51:37 
 * 
 */
/**
 * @author long_xia@loongjoy.com
 *
 */
public class HomeFragment extends Fragment {

	private Activity activity;
	private Logger logger = Logger.getInstance();
	private int userId;

	private GridView functionGridView;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater,
	 * android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.fragment_home, null);

		return v;
	}

	private void initTopBar(View v) {
		Button topBarLeftBtn = (Button) v.findViewById(R.id.topBarLeftBtn);
		topBarLeftBtn.setBackgroundResource(R.drawable.btn_back);
		TextView topBarTitleView = (TextView) v.findViewById(R.id.topBarTitleView);
		topBarTitleView.setText("韩国烤肉");
		Button topBarRightBtn = (Button) v.findViewById(R.id.topBarRightBtn);
		topBarRightBtn.setVisibility(View.GONE);
		topBarLeftBtn.setVisibility(View.GONE);
	}
}
