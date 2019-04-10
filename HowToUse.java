package com.example.datingapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

public class HowToUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);

        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        int displayHeight = metrics.heightPixels;
        int displayWidth = metrics.widthPixels;
        float scaledDensity = metrics.scaledDensity;

        float percentageToMoveViewDown = (float) 20.0;
        float viewY_float = (float) ((displayHeight / 100.0) * percentageToMoveViewDown);
        int viewY_int = Math.round(viewY_float);

        RelativeLayout.LayoutParams view_Layout_params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        view_Layout_params.topMargin = viewY_int;
        View view = new View(this);
        view.setLayoutParams(view_Layout_params);
    }

    public void clicked(View view) {
        Intent intent=new  Intent(view.getContext(),ImageAlbum.class);
        view.getContext().startActivity(intent);
    }
}
