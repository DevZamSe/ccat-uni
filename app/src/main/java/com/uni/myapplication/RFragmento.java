package com.uni.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

public class RFragmento extends AppCompatActivity {

    FrameLayout contenedor, contenedor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_fragmento);

        contenedor = findViewById(R.id.contenedor);
        FragmentTransaction a = getSupportFragmentManager().beginTransaction();
        a.replace(R.id.contenedor, new fragment());
        a.commit();

        contenedor2 = findViewById(R.id.contenedor2);
        FragmentTransaction b = getSupportFragmentManager().beginTransaction();
        b.replace(R.id.contenedor2, new ContentFrame());
        b.commit();

    }
}
