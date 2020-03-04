package eeui.android.bugly.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eeui.framework.extend.annotation.ModuleEntry;
import eeui.android.bugly.module.AppbuglyModule;

import com.tencent.bugly.crashreport.CrashReport;

import com.alibaba.fastjson.JSONObject;
import app.eeui.framework.extend.module.eeuiBase;
import app.eeui.framework.extend.module.eeuiJson;
@ModuleEntry
public class buglyEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //1、注册weex模块
        try {
            JSONObject bugly = eeuiJson.parseObject(eeuiBase.config.getObject("bugly").get("android"));
            
            if (eeuiJson.getBoolean(bugly, "enabled")) {
                CrashReport.initCrashReport(content, eeuiJson.getString(bugly, "appKey"), false);
            }

            WXSDKEngine.registerModule("bugly", AppbuglyModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }

        //2、注册web模块（web-view模块可通过requireModuleJs调用，调用详见：https://eeui.app/component/web-view.html）
        // WebCallBean.addClassData("bugly", WebbuglyModule.class);
    }

}
