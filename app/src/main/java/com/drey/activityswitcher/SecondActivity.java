package com.drey.activityswitcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
public void onClickClose(View view){
    Intent returnIntent = new Intent();
    returnIntent.putExtra(MainActivity.REQUEST_RESULT,42);
    setResult(RESULT_OK, returnIntent);
    finish();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView) findViewById(
                R.id.textViewText);
        if (getIntent()!=null && getIntent().hasExtra(Intent.EXTRA_TEXT));
    }
}
