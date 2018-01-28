package com.ezuikit.open;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.ezvizuikit.open.EZUIKit;
import com.ezvizuikit.open.EZUIPlayer;
import com.videogo.exception.BaseException;

import com.videogo.openapi.EZConstants.EZPTZCommand;
import com.videogo.openapi.EZConstants.EZPTZAction;
import com.videogo.openapi.EZConstants;
import io.cordova.hellocordova.EzvizApplication;

import com.videogo.openapi.EZOpenSDK;


public class Main {

  private EZOpenSDK app;

     
    public String main(String message ,int i) {
        switch (i) {
            
        
             case 1:
                ptzOption(EZPTZCommand.EZPTZCommandUp, EZPTZAction.EZPTZActionSTART);
                break;
            case 2:
                 ptzOption(EZPTZCommand.EZPTZCommandDown, EZPTZAction.EZPTZActionSTART);
             //    return "2调用成功了";
                break;
            case 3:
                ptzOption(EZPTZCommand.EZPTZCommandLeft, EZPTZAction.EZPTZActionSTART);
                 break;
            case 4:
                ptzOption(EZPTZCommand.EZPTZCommandRight, EZPTZAction.EZPTZActionSTART);
                break;
            case 5:
                ptzOption(EZPTZCommand.EZPTZCommandUp, EZPTZAction.EZPTZActionSTOP);
                break;
            case 6:
                 ptzOption(EZPTZCommand.EZPTZCommandDown, EZPTZAction.EZPTZActionSTOP);
                break;
            case 7:
                ptzOption(EZPTZCommand.EZPTZCommandLeft, EZPTZAction.EZPTZActionSTOP);
                break;
            case 8:
                ptzOption(EZPTZCommand.EZPTZCommandRight, EZPTZAction.EZPTZActionSTOP);
                break;
            default:
                break;
                    }

        return "调用成功了"+i;
    }




    private void ptzOption(final EZPTZCommand command, final EZPTZAction action) {
        
       new Thread(new Runnable() {
        @Override
        public void run() {
            boolean ptz_result = false;
            try {
                ptz_result = app.getInstance().controlPTZ( "588101953"  , 1, command,
                        action, EZConstants.PTZ_SPEED_DEFAULT);
            } catch (BaseException e) {
                e.printStackTrace();
            }
        }
      }).start();
    }

   
    
} 
