package com.ezuikit.open;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ezvizuikit.open.EZUIKit;
import com.ezvizuikit.open.EZUIPlayer;
import com.videogo.exception.BaseException;
import com.videogo.openapi.EZConstants;
import com.videogo.openapi.EZOpenSDK;
import com.videogo.openapi.EZConstants.EZPTZAction;
import com.videogo.openapi.EZConstants.EZPTZCommand;
import com.videogo.util.LogUtil;
 

public class EzvizActivity extends Activity{

   //  private  Application application;
    
    private Button mButtonPlay;
    private String mAppKey;
    private String mAccessToken;   
    private String mUrl;
    private boolean isGlobal = false;
    private Main play;

    
 

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE |
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        super.onCreate(savedInstanceState);
         setContentView(getId("activity_main","layout"));
         // init();
     }


    
    private int getIdTypeLayout(String name){
        return getId(name,"layout");
    }
    private int getIdTypeId(String name){
        return getId(name,"id");
    }
    private int getId(String idName, String type){
        return getResources().getIdentifier(idName, type,getPackageName());
    }
    
  //   public void init(){
    	
  //   	  mAppKey ="54049c5bb8f3467fb096e3b3615eed81";
  //         mAccessToken ="at.3zx6o9qc7ievw7mv7x9tuovy0kij31j7-6becovfz2v-0mlt35q-9dgskcglx";
  //         mUrl ="ezopen://AES:jtgVRdj_HiaBXRi2Z5mnGw@open.ys7.com/588101953/1.hd.live";
       
  //        Application application = (Application) getApplication();
  //        // application = new EzvizApplication();
  //        EZUIKit.initWithAppKey(application, mAppKey);
  //        EZUIKit.setAccessToken(mAccessToken);
  // }

   //  public void init(){
      
   //        mAppKey ="54049c5bb8f3467fb096e3b3615eed81";
   //        mAccessToken ="at.3zx6o9qc7ievw7mv7x9tuovy0kij31j7-6becovfz2v-0mlt35q-9dgskcglx";
         
   //      EZUIKit.initWithAppKey(application, mAppKey);
   //      EZUIKit.setAccessToken(mAccessToken);
       
   // }


 
    public void play(View view){
        Toast.makeText(getApplicationContext(), "nihao", 1).show();
    }
  
   
   public void up(View view){
         play=new Main();
       play.main("nihao", 1);
   }
   public void down(View view){
         play=new Main();
       play.main("nihao", 2);
   }
 
 
    @Override
    protected void onDestroy() {
        super.onDestroy();
         
        System.exit(0);
    }
}
