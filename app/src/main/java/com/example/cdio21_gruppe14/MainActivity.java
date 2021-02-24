package com.example.cdio21_gruppe14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView1;
    private TextView textView2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.navn);
        textView2 = findViewById(R.id.subNavn);
        imageView = findViewById(R.id.klondike);

        button = findViewById(R.id.begyndKnap);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == button) {
            Intent kabale = new Intent(this,KabaleActivity.class);
            startActivity(kabale);
        }
    }
}