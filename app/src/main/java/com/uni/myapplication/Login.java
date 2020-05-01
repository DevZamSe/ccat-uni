package com.uni.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText a;
    EditText editText2;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        a = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        c = findViewById(R.id.button);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.getText().toString();
                editText2.getText().toString();

                Log.e("usuario", a.getText().toString());
                Log.e("contraseña", editText2.getText().toString());

                if(a.getText().toString().equals("nilo") && !editText2.getText().toString().isEmpty()){
//                    Log.e("exito","exito");
                    Intent i = new Intent(Login.this, Dawer.class);
                    startActivity(i);
                } else {
                    Toast.makeText(Login.this, "error", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
