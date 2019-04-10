package com.example.datingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Sr4 extends AppCompatActivity {

    int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr4);
        final TextView countTxt=(TextView)findViewById(R.id.countTxt);
        ImageView imaV=(ImageView)findViewById(R.id.imageView2);
        imaV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                countTxt.setText(cnt+"");
            }
        });
    }
}
