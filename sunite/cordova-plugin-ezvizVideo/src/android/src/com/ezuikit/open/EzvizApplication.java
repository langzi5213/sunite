
package com.ezuikit.open;
import android.app.Application;

import com.videogo.openapi.EZOpenSDK;
import com.ezvizuikit.open.EZUIKit;

/**
 * 自定义应用
 *
 * @author xiaxingsuo
 */
public class EzvizApplication extends Application {

    /**
     * 开发者申请的AppKey填充
     */
    public static String AppKey = "54049c5bb8f3467fb096e3b3615eed81";
    public static String mAccessToken ="at.3zx6o9qc7ievw7mv7x9tuovy0kij31j7-6becovfz2v-0mlt35q-9dgskcglx";

    public static EZOpenSDK getOpenSDK() {
        return EZOpenSDK.getInstance();
    }


    @Override
    public void onCreate() {
        initSDK();
    }

    private void initSDK() {
         {
            
         EZOpenSDK.showSDKLog(true);
         EZOpenSDK.enableP2P(true);
         EZOpenSDK.initLib(this, AppKey, "");

          EZUIKit.initWithAppKey(this, AppKey);
          EZUIKit.setAccessToken(mAccessToken);
        }
    }
}
