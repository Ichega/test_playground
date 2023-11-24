package ru.yatsevyuk.r.r.company.test_playground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void firstlesson (View view) {
        Intent intent = new Intent(MainActivity.this, Test2Activity.class);
        startActivity(intent);
    }
}