package com.ezuikit.open;


import android.content.Context;
import android.content.Intent;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ezvizuikit.open.EZUIKit;
import com.videogo.openapi.EZOpenSDK;

import com.ezvizuikit.open.EZUIKit;
import com.ezvizuikit.open.EZUIPlayer;
import com.videogo.exception.BaseException;

import com.videogo.openapi.EZConstants.EZPTZCommand;
import com.videogo.openapi.EZConstants.EZPTZAction;
import com.videogo.openapi.EZConstants;
import android.app.Application;
import com.videogo.openapi.EzvizAPI;
import org.apache.cordova.*;
import android.widget.Toast;




 
public class EzvizVideo extends CordovaPlugin {
     
      private  Application application;
      private EZOpenSDK sdk;
      private String mAppKey;
      private String mAccessToken; 
      private String pp;
      private String deviceid;
 
    private Context context;
    private static final int HIKVISION_ACTIVIT_CODE = 0;
    @Override
    protected void pluginInitialize() {
        super.pluginInitialize();
        context = cordova.getActivity();
       this.initSDK();
    }

   public CallbackContext callbackContext;
    

     @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
          this.callbackContext = callbackContext;
       
          deviceid="588101953";
        if (action.equals("start")){

            
            return true;
         }else if("up".equals(action)){
              this.coolMethod(deviceid,1);
              return true;
         }else if("bottom".equals(action)){
              this.coolMethod(deviceid,2);
              return true;
         }else if("left".equals(action)){
              this.coolMethod(deviceid,3);
              return true;
         }else if("right".equals(action)){
             this.coolMethod(deviceid,4);
             return true;
         }else if("up_stop".equals(action)){
              this.coolMethod(deviceid,5);
              return true;
         }else if("bottom_stop".equals(action)){
              this.coolMethod(deviceid,6);
              return true;
         }else if("left_stop".equals(action)){
              this.coolMethod(deviceid,7);
              return true;
         }else if("right_stop".equals(action)){
              this.coolMethod(deviceid,8);
              return true;
         }


     return true;
    }
 
    private void initSDK() {
    
       application=this.cordova.getActivity().getApplication();
       mAppKey ="54049c5bb8f3467fb096e3b3615eed81";
       mAccessToken ="at.1p1vxyrocnvshdbb6vs8pncuc2v0qkcj-8kxdicbq3t-13q11io-xnne1ufcs";  
       EZOpenSDK.initLib(application,mAppKey, "");
       EZUIKit.setAccessToken(mAccessToken);
   }

 

    private void coolMethod(String deviceid,int i ) {
           
        switch (i) {       
             case 1:
               try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid , 1, EZPTZCommand.EZPTZCommandUp,EZPTZAction.EZPTZActionSTART, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                 }
                
                break;
            case 2:
               try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandDown,EZPTZAction.EZPTZActionSTART, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
                
                break;
            case 3:
            try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandLeft,EZPTZAction.EZPTZActionSTART, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
                
                 break;
            case 4:
              try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandRight,EZPTZAction.EZPTZActionSTART, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
               
                break;
            case 5:
             try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandUp,EZPTZAction.EZPTZActionSTOP, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
                
                break;
            case 6:
             try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandDown,EZPTZAction.EZPTZActionSTOP, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
                 
                break;
            case 7:
             try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandLeft,EZPTZAction.EZPTZActionSTOP, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
                 break;
            case 8:
             try {
                 EZOpenSDK.getInstance().controlPTZ(deviceid  , 1, EZPTZCommand.EZPTZCommandRight,EZPTZAction.EZPTZActionSTOP, 1);
                } catch (BaseException e) {
                    e.printStackTrace();
                }
               
                break;
            default:
                break;
                    }
       }
 }

 