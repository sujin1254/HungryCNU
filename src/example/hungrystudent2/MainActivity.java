package example.hungrystudent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageButton b1 = (ImageButton) findViewById(R.id.btn_pizza);
		b1.setEnabled(true);

		ImageButton b2 = (ImageButton) findViewById(R.id.btn_chicken);
		b2.setEnabled(true);

		ImageButton b3 = (ImageButton) findViewById(R.id.btn_korean);
		b3.setEnabled(true);

		ImageButton b4 = (ImageButton) findViewById(R.id.btn_chinese);
		b4.setEnabled(true);

		ImageButton b5 = (ImageButton) findViewById(R.id.btn_japanese);
		b5.setEnabled(true);

		ImageButton b6 = (ImageButton) findViewById(R.id.btn_snack);
		b6.setEnabled(true);

		ImageButton b7 = (ImageButton) findViewById(R.id.btn_fastfood);
		b7.setEnabled(true);

		ImageButton b8 = (ImageButton) findViewById(R.id.btn_pigfeet);
		b8.setEnabled(true);
		
		ImageButton b9 = (ImageButton) findViewById(R.id.btn_question);
		b9.setEnabled(true);
		
		ImageButton b10 = (ImageButton) findViewById(R.id.btn_developer);
		b10.setEnabled(true);

		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperPizza.class);
				startActivity(intent);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperChicken.class);
				startActivity(intent);
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperKorean.class);
				startActivity(intent);
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperChina.class);
				startActivity(intent);
			}
		});
		b5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperJapan.class);
				startActivity(intent);
			}
		});
		b6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperSnack.class);
				startActivity(intent);
			}
		});
		b7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperFastFood.class);
				startActivity(intent);
			}
		});
		b8.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SuperPigFeet.class);
				startActivity(intent);
			}
		});
		b9.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
				startActivity(intent);
			}
		});
		
		b10.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, DeveloperActivity.class);
				startActivity(intent);
			}
		});

	}

}