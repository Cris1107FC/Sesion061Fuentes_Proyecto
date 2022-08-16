package com.example.sesion061fuentes_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animation extends AppCompatActivity {
    public Button btnAnimacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        btnAnimacion = findViewById(R.id.btnEntrar);
        btnAnimacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Animation.class);
                startActivityForResult(intent,0);
            }
        });
    }
}