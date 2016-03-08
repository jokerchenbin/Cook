package com.loongjoy.cook.activity;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.loongjoy.cook.R;
import com.loongjoy.cook.adapter.AbFragmentPagerAdapter;
import com.loongjoy.cook.fragment.HomeFragment;
import com.loongjoy.cook.fragment.MyFragment;
import com.loongjoy.cook.fragment.OrderFragment;
import com.loongjoy.cook.interfaces.MainOrderFragmentListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Fragment> fragmentlist = new ArrayList<Fragment>();
    private static final int REFRESH_COMPLETE = 0X110;
    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private RadioButton mainHomeRadioBtn;
    private RadioButton mainOrderRadioBtn;
    private RadioButton mainMyRadioBtn;
    private HomeFragment homeFragment;
    private MyFragment myFragment;
    private OrderFragment orderFragment;
    private MainOrderFragmentListener mainOrderFragmentListener;

    private LinearLayout mainBottomLayout;
    private Button mainBottomBtn;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试提交
        initViews();
    }


    private void initViews() {
        // TODO Auto-generated method stub
        viewPager = (ViewPager) findViewById(R.id.mainViewpager);
        radioGroup = (RadioGroup) findViewById(R.id.mainRadioGroup);
        mainHomeRadioBtn = (RadioButton) findViewById(R.id.tabHomeRadioBtn);
        mainMyRadioBtn = (RadioButton) findViewById(R.id.tabMyRadioBtn);
        mainOrderRadioBtn = (RadioButton) findViewById(R.id.tabOrderRadioBtn);
        homeFragment = new HomeFragment();
        myFragment = new MyFragment();
        orderFragment = new OrderFragment();

        fragmentlist.add(homeFragment);
        fragmentlist.add(orderFragment);
        fragmentlist.add(myFragment);

        AbFragmentPagerAdapter adapter = new AbFragmentPagerAdapter(getSupportFragmentManager(), fragmentlist);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                // TODO Auto-generated method stub
                switch (arg0) {
                    case 0:
                        if (mainBottomLayout.getVisibility() == View.VISIBLE) {
                            onOrderTouch(false);
                            mainOrderFragmentListener.onMove();
                        }
                        radioGroup.check(R.id.tabHomeRadioBtn);
                        break;
                    case 1:
                        radioGroup.check(R.id.tabOrderRadioBtn);
                        break;
                    case 2:
                        if (mainBottomLayout.getVisibility() == View.VISIBLE) {
                            onOrderTouch(false);
                            mainOrderFragmentListener.onMove();
                        }
                        radioGroup.check(R.id.tabMyRadioBtn);
                        break;

                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
        mainHomeRadioBtn.setOnClickListener(this);
        mainMyRadioBtn.setOnClickListener(this);
        mainOrderRadioBtn.setOnClickListener(this);

        mainBottomBtn = (Button) findViewById(R.id.mainBottonBtn);
        mainBottomBtn.setOnClickListener(this);
        mainBottomLayout = (LinearLayout) findViewById(R.id.mainBottomLayout);

    }


    public void onOrderTouch(boolean show) {
        final Animation animationUpIn = AnimationUtils.loadAnimation(activity, R.anim.pop_up_in);
        Animation animationUpOut = AnimationUtils.loadAnimation(activity, R.anim.pop_up_out);
        if (show) {
            radioGroup.startAnimation(animationUpOut);
            animationUpOut.setAnimationListener(new Animation.AnimationListener() {

                @Override
                public void onAnimationStart(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    // TODO Auto-generated method stub
                    radioGroup.setVisibility(View.GONE);
                    mainBottomLayout.setVisibility(View.VISIBLE);
                    mainBottomLayout.startAnimation(animationUpIn);
                }
            });
        } else {
            mainBottomLayout.startAnimation(animationUpOut);
            animationUpOut.setAnimationListener(new Animation.AnimationListener() {

                @Override
                public void onAnimationStart(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    // TODO Auto-generated method stub
                    mainBottomLayout.setVisibility(View.GONE);
                    radioGroup.setVisibility(View.VISIBLE);
                    radioGroup.startAnimation(animationUpIn);
                }
            });
        }
    }


    @Override
    public void onClick(View v) {

    }
}
