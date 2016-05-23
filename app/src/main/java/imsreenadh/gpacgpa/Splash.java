package imsreenadh.gpacgpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        final int SPLASH_TIME_OUT = 3500;
        /** create a thread to show splash up to splash time */
        Thread welcomeThread = new Thread() {

            int wait = 0;

            @Override
            public void run() {
                try {
                    super.run();
/**
 * use while to get the splash time. Use sleep() to increase
 * the wait variable for every 100L.
 */
                    while (wait < SPLASH_TIME_OUT) {
                        sleep(100);
                        wait += 100;
                    }
                } catch (Exception e) {
                    System.out.println("EXc=" + e);
                } finally {
/**
 * Called after splash times up. Do some action after splash
 * times up. Here we moved to another main activity class
 */
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
