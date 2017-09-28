package doob.com.myuare;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Main extends Activity
{

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

		 setContentView(R.layout.main);
		 Button btn1 = (Button)findViewById(R.id.ib1);
		 btn1.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
				 Intent in = new Intent(getBaseContext(), BabyActivity.class);
				 startActivity(in);
				 finish();
			 }
		 });
		 Button btn2 = (Button)findViewById(R.id.ib2);
		 btn2.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
				 Intent in = new Intent(getBaseContext(),ColActivity.class);
				 startActivity(in);
				 finish();
			 }
		 });
		 Button btn3 = (Button)findViewById(R.id.ib3);
		 btn3.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
				 Intent in = new Intent(getBaseContext(),CaltureActivity.class);
				 startActivity(in);finish();
			 }
		 });
		 Button btn4 = (Button)findViewById(R.id.ib4);
		 btn4.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
				 Intent in = new Intent(getBaseContext(),LocalActivity.class);
				 startActivity(in);finish();
			 }
		 });
		 Button btn5= (Button)findViewById(R.id.ib5);
		 btn5.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
				 Intent in = new Intent(getBaseContext(), ParentActivity.class);
				 startActivity(in);finish();
			 }
		 });
		 Button btn6= (Button)findViewById(R.id.ib6);
		 btn6.setOnClickListener(new View.OnClickListener() {
			 @Override
			 public void onClick(View v) {
				 Intent in = new Intent(getBaseContext(), PowerLink.class);
				 startActivity(in);finish();
			 }
		 });
	    }
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {


			new AlertDialog.Builder(this)
					.setTitle("종료")
					.setMessage("어플을 종료 하시겠어요?")
					.setPositiveButton("예", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int whichButton) {
							finish();
						}
					})
					.setNegativeButton("아니요", null).show();


		return super.onKeyDown(keyCode, event);
	}

	}
