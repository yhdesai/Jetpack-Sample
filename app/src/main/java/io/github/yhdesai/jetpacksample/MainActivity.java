package io.github.yhdesai.jetpacksample;

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

    public void Foundation(View view) {
        Intent intentName = new Intent(MainActivity.this, jFoundation.class);
        startActivity(intentName);;
    }

    public void Architecture(View view) {
        Intent intentName = new Intent(MainActivity.this, jArchitecture.class);
        startActivity(intentName);
    }

    public void Behavior(View view) {
        Intent intentName = new Intent(MainActivity.this, jBehaviour.class);
        startActivity(intentName);
    }

    public void UI(View view) {
        Intent intentName = new Intent(MainActivity.this, jUi.class);
        startActivity(intentName);
    }
}
