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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.loongjoy.cook.R;
import com.loongjoy.cook.utils.Logger;


/**
 * @author long_xia@loongjoy.com
 * @version 创建时间：2016年1月20日 下午12:51:20 
 * 
 */
/**
 * @author long_xia@loongjoy.com
 *
 */
public class MyFragment extends Fragment implements OnClickListener {

	private TextView profitSettingTextView;
	private TextView languageSettingTextView;
	private TextView passwordTextView;
	private TextView loginoutTextView;

	private TextView languageTextView;

	private Activity activity;
	private Logger logger = Logger.getInstance();

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
		View v = inflater.inflate(R.layout.fragment_my, null);
		initTopBar(v);
		/*activity = getActivity();
		PreferenceUtil.init(activity);
		String l = PreferenceUtil.getString("language", "zh");
		profitSettingTextView = (TextView) v.findViewById(R.id.profitSettingTextView);
		languageSettingTextView = (TextView) v.findViewById(R.id.languageSettingTextView);
		passwordTextView = (TextView) v.findViewById(R.id.passwordSettingTextView);
		loginoutTextView = (TextView) v.findViewById(R.id.loginoutTextView);
		languageTextView = (TextView) v.findViewById(R.id.languageTextView);
		languageTextView.setText(l.equals("zh") ? getResources().getString(R.string.language_zh) : getResources()
				.getString(R.string.language_en));
		profitSettingTextView.setOnClickListener(this);
		languageSettingTextView.setOnClickListener(this);
		passwordTextView.setOnClickListener(this);
		loginoutTextView.setOnClickListener(this);*/

		return v;
	}

	private void initTopBar(View v) {
		Button topBarLeftBtn = (Button) v.findViewById(R.id.topBarLeftBtn);
		topBarLeftBtn.setBackgroundResource(R.drawable.btn_back);
		TextView topBarTitleView = (TextView) v.findViewById(R.id.topBarTitleView);
		topBarTitleView.setText(getResources().getString(R.string.my));
		Button topBarRightBtn = (Button) v.findViewById(R.id.topBarRightBtn);
		topBarRightBtn.setVisibility(View.GONE);
		topBarLeftBtn.setVisibility(View.GONE);
	}


	@Override
	public void onClick(View v) {

	}
}
