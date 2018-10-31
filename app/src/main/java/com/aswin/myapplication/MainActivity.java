package com.aswin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bgimg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bgimg = (ImageView) findViewById(R.id.bgimg);
        btn = (Button) findViewById(R.id.btn);
//animation

        bgimg.animate().scaleX(2).scaleY(2).setDuration(5000).start();


//buttonclick

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,Signup.class);
                startActivity(a);
            }
        });

    }
}
