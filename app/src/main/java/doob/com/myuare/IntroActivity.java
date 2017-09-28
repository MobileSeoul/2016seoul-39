package doob.com.myuare;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends Activity
{

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

		 setContentView(R.layout.activity_intro);


		 Handler hd = new Handler();
		 hd.postDelayed(new Runnable() {
			 @Override
			 public void run() {
				 Intent intent = new Intent(getApplicationContext(), Main.class);
				 startActivity(intent);
				 finish();
			 }
		 }, 2000);
	 
//	      Handler handler = new Handler() {
//	          public void handleMessage(android.os.Message msg) {
//	              finish();
//	          }
//	      };
//	      handler.sendEmptyMessageDelayed(0, 3000);       
	    }
	}
