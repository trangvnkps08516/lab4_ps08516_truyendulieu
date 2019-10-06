package com.ps08516.lab4_bai4_truyendulieu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_PHONE = "PHONE";
    public static final String KEY_NAME = "NAME";
    public static final String KEY_BUNDLE = "BUNDLE";
    private EditText edtPhone,edtName;
    private Button btnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        edtPhone = (EditText) findViewById(R.id.edt_phone);
        edtName = (EditText) findViewById(R.id.edt_Name);
        btnSendData = (Button)findViewById(R.id.btn_send_data);
        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);


                Bundle bundle = new Bundle();
                bundle.putString(KEY_PHONE,edtPhone.getText().toString());
                bundle.putString(KEY_NAME,edtName.getText().toString());
                intent.putExtra(KEY_BUNDLE,bundle);


                startActivity(intent);
            }
        });
    }
}
