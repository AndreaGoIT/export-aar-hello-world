package com.example.hellocsharp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hello_from_csharp.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to launch the imported activity on the button click
        final Button _TestButton = findViewById(R.id.test_button);
        _TestButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HelloActivity.class);
            startActivity(intent);
        });

        // without lambda  expressions (introduced in Java 8)
//        final Button _TestButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, HelloActivity.class);
//                startActivity(intent);
//            }
//        });
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        // to load as first activity the imported one from aar library
//        Intent intent = new Intent(this, HelloActivity.class);
//        startActivity(intent);
//    }
}
