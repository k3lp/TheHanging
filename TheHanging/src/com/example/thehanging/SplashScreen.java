package com.example.thehanging;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashScreen extends Activity {
    
    private Thread mSplashThread;    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //layout
        setContentView(R.layout.splash);
        final SplashScreen sPlashScreen = this;   
        mSplashThread =  new Thread(){
            @Override
            public void run(){
                try {
                    synchronized(this){
                        //timer splashscreen
                        wait(5000);
                    }
                }
                catch(InterruptedException ex){                    
                }

                finish();
                
                //ga naar mainactivity
                Intent intent = new Intent();
                intent.setClass(sPlashScreen, MainActivity.class);
                startActivity(intent);                 
            }
        };
        
        mSplashThread.start();        
    }
        
    //voor als je de splash eerder wilt stoppen (ontouch)
    @Override
    public boolean onTouchEvent(MotionEvent evt)
    {
        if(evt.getAction() == MotionEvent.ACTION_DOWN)
        {
            synchronized(mSplashThread){
                mSplashThread.notifyAll();
            }
        }
        return true;
    }    
} 