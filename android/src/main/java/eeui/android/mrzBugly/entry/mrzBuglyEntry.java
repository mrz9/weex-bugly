/*
 * @Author: Dayao
 * @Date: 2020-03-04 11:30:05
 * @LastEditTime: 2020-03-06 12:03:19
 * @Description: 
 */
package eeui.android.mrzBugly.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eeui.framework.extend.annotation.ModuleEntry;
import app.eeui.framework.extend.bean.WebCallBean;
import eeui.android.mrzBugly.module.mrzBuglyWebModule;
import eeui.android.mrzBugly.module.mrzBuglyAppModule;

import com.tencent.bugly.crashreport.CrashReport;

import com.alibaba.fastjson.JSONObject;
import app.eeui.framework.extend.module.eeuiBase;
import app.eeui.framework.extend.module.eeuiJson;

@ModuleEntry
public class mrzBuglyEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //1、注册weex模块
        try {
            JSONObject buglyConfig = eeuiJson.parseObject(eeuiBase.config.getObject("bugly").get("android"));
            String appKey = eeuiJson.getString(buglyConfig, "appKey");

            if (appKey != null && appKey.length() != 0) {
                CrashReport.initCrashReport(content, appKey, BuildConfig.DEBUG);
            }
            WXSDKEngine.registerModule("mrzBugly", mrzBuglyAppModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }

        //2、注册web模块（web-view模块可通过requireModuleJs调用，调用详见：https://eeui.app/component/web-view.html）
        // WebCallBean.addClassData("mrzBugly", mrzBuglyWebModule.class);
    }
}
