package com.loongjoy.cook;

import org.apache.http.client.HttpClient;

import android.content.Context;
import android.content.SharedPreferences;


public class AppConfig {
	public static boolean isDebug = true;// 日志Debug
	public static boolean isHttpDebug = true;// 加密Debug
	public static Context context;
	public static int pageSize = 20;
	public static int gridPageSize = 15;
	public static int AllPageSize = 50;
	public static int homeGridSize = 9;
	public static int colorId = 0;
	public static String longitude = "1.0";// 经度
	public static String latitude = "1.0"; // 纬度
	public static String appId;
	public static String udId;
	public static String version;
	public static String apiVersion;
	public static int versionCode = 0;
	public static String device;
	public static String os;
	public static int screenWidth;
	public static int screenHeight;
	public static boolean hasNewVersion = false;
	public static String name;
	public static String url;
	public static String updateNote;
	public static String limitNum = "140";
	public static String hearNum = "20";
	public static String PIC = "jinjinM";
	//public static RequestQueue mVolleyQueue;

	public static final int DEFAULT_TAG = 2;
	public static final int DEFAULT_TAG2 = 10;
	public static final int DEFAULT_RESULT = 10001;
	public static final int DEFAULT_CAMERA_RESULT = 20001;
	public static final int DEFAULT_CROP_RESULT = 20002;
	public static final int DEFAULT_MAP_RESULT = 10002;
	public static final int DEFAULT_PIC_RESULT = 10003;
	public static final int DEFAULT_CITY_RESULT = 10004;
	public static final int DEFAULT_EDIT_RESULT = 10005;
	public static final int DEFAULT_REQUEST = 10001;
	public static final String DEFAULT_TAG_NAME = "tag";
	public static final String DEFAULT_LOG_NAME = "myLog";

	public static SharedPreferences prefs = null;
	public static SharedPreferences jPushfs = null;
	public static String prfsName = null;
	public static String jPushfsName = null;
	public static HttpClient httpAsyncClient; // httpAsyncClient
	public static long currThreadId; // currThreadId
	public static int unCheckedCount;

	public static String URL = "http://shanglv.doboyu.com/";
	// public static String URL = "http://192.168.1.127:8080/";
	public static String LOGIN = URL + "api/user/login";
	public static String UPDATEUSERINFO = URL + "api/user/updateuserinfo";//修改密码
	
	
	public static String GETMERCHANTCOUPONLIST = URL + "api/user/getmerchantcouponlist";//获取商家团购券列表
	
	
	
	
	
	
	
	
	
	

}