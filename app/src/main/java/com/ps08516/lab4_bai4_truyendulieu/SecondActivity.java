package com.ps08516.lab4_bai4_truyendulieu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvPhone,tvName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView(){
        tvPhone = (TextView) findViewById(R.id.tv_phone);
        tvName = (TextView) findViewById(R.id.tv_name);
        Intent data = SecondActivity.this.getIntent();
        if(data == null){
            return;
        }
        Bundle bundle = data.getBundleExtra(MainActivity.KEY_BUNDLE);
        tvPhone.setText(bundle.getString(MainActivity.KEY_PHONE));
        tvName.setText(bundle.getString(MainActivity.KEY_NAME));

    }
}
