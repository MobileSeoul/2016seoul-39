package doob.com.myuare;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

public class Error extends Activity
{

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

		 setContentView(R.layout.activity_error);

	    }


	public boolean checkNetwokState() {
		ConnectivityManager manager =
				(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo mobile = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
		NetworkInfo wifi = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		NetworkInfo lte_4g = manager.getNetworkInfo(ConnectivityManager.TYPE_WIMAX);
		boolean blte_4g = false;
		if(lte_4g != null)
			blte_4g = lte_4g.isConnected();
		if (mobile.isConnected() || wifi.isConnected() || blte_4g)
			return true;
		else {
			AlertDialog.Builder dlg = new AlertDialog.Builder(Error.this);
			dlg.setTitle("네트워크 오류");
			dlg.setMessage("네트워크 상태를 확인해 주십시요.");
			Intent intentSubActivity = new Intent(Error.this, MainActivity.class);
			startActivity(intentSubActivity);
			finish();
			dlg.setCancelable(false);
			dlg.show();
			return false;
		}
	}
	}
