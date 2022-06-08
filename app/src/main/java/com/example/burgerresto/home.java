package com.example.burgerresto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
        setContentView(R.layout.home);
    }

    public void profile(View view) {
        Intent i = new Intent(this, splashscreen.class);
        startActivity(i);
    }
    public void cart(View view) {
        Intent i = new Intent(this, splashscreen.class);
        startActivity(i);
    }
    public void burger(View view) {
        Intent i = new Intent(this, burgerlist.class);
        startActivity(i);
    }
    public void drink(View view) {
        Intent i = new Intent(this, drinklist.class);
        startActivity(i);
    }

    public void addcb(View view) {
        Intent i = new Intent(this, splashscreen.class);
        startActivity(i);
    }
    public void adddcb(View view) {
        Intent i = new Intent(this, splashscreen.class);
        startActivity(i);
    }
}
