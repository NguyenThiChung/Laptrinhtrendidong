package com.example.baitap_giuaky.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baitap_giuaky.R;

public class DetailActivity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        TextView textView = findViewById(R.id.textView4);
        ImageView imageView = findViewById(R.id.imageView7);
        TextView textView_1 = findViewById(R.id.textView5);
        TextView textView_2 = findViewById(R.id.textView6);
        TextView textView_3 = findViewById(R.id.textView7);
        TextView textView_4 = findViewById(R.id.textView8);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}