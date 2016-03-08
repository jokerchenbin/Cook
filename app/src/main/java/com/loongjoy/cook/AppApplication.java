/**
 * 
 */
package com.loongjoy.cook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.loongjoy.cook.utils.FunctionUtils;


/**
 * @author long_xia@loongjoy.com
 *
 */
public class AppApplication extends Application {

	/** 所以的Activity */
	public List<Activity> activities = new ArrayList<Activity>();

	@Override
	public void onCreate() {
		super.onCreate();
		//initImageLoader(getApplicationContext());
		initCommonData();
		initUpdateJsonData();
		//initmVolleyQueue();
		File file = new File("/sdcard/shanglv");
		file.mkdir();
	}

/*	public static void initImageLoader(Context context) {
		// 自定义缓存路径
		File cacheDir = StorageUtils.getOwnCacheDirectory(context, "loongjoyImage/Cache");
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
				.memoryCacheExtraOptions(480, 800)
				// max width, max height内存缓存文件的最大长宽
				.threadPoolSize(3)
				// 线程池内加载的数量
				.threadPriority(Thread.NORM_PRIORITY - 2)// default 设置当前线程的优先级
				.denyCacheImageMultipleSizesInMemory().diskCacheFileNameGenerator(new Md5FileNameGenerator()) // 将url转换成MD5保存
				.memoryCache(new UsingFreqLimitedMemoryCache(2 * 1024 * 1024)).memoryCacheSize(2 * 1024 * 1024) // 缓存的最大值
				.diskCacheSize(50 * 1024 * 1024) // sd卡(本地)缓存的最大值
				.tasksProcessingOrder(QueueProcessingType.LIFO)
				// 锟斤拷原锟饺碉拷discCache -> diskCache
				.diskCache(new UnlimitedDiskCache(cacheDir))// default 可以自定义缓存路径
				.imageDownloader(new BaseImageDownloader(context, 5 * 1000, 30 * 1000))
				// connectTimeout(5s),readTimeout(30 s)
				.writeDebugLogs() // Remove for release app
				.build();
		ImageLoader.getInstance().init(config);
	}*/

	/**
	 * 获取设备信息
	 */
	public void initCommonData() {
		AppConfig.udId = FunctionUtils.getUdId(this);
		AppConfig.version = FunctionUtils.getAppVersion(this);
		AppConfig.apiVersion = FunctionUtils.getapiVersion(this);
		AppConfig.device = FunctionUtils.getDevice();
		AppConfig.os = FunctionUtils.getOs();
	}

	/**
	 * get all the activity
	 *
	 * @return List<Activity>
	 */
	public List<Activity> getActivities() {
		return activities;
	}

	/**
	 * 
	 * @param activity
	 *            add single activity in the activities
	 */
	public void addActivity(Activity activity) {
		activities.add(activity);
	}

	/**
	 * 初始化asset的配置文件
	 */
	public void initUpdateJsonData() {

		if (AppConfig.prefs == null) {
			AppConfig.prfsName = "shanglvConfig.xml";
			AppConfig.prefs = getSharedPreferences(AppConfig.prfsName, MODE_MULTI_PROCESS);
		}
		if (AppConfig.jPushfs == null) {
			AppConfig.jPushfsName = "shanglvConfig1.xml";
			AppConfig.jPushfs = getSharedPreferences(AppConfig.jPushfsName, MODE_MULTI_PROCESS);
		}
	}

	/*public void initmVolleyQueue() {
		AppConfig.mVolleyQueue = Volley.newRequestQueue(this);
		AppConfig.mVolleyQueue.start();
	}*/

}
