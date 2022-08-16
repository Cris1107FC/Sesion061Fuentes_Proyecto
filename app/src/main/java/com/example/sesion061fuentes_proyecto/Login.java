package com.example.sesion061fuentes_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia metodo onCREATE
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView userName=findViewById(R.id.edtUsuario);
        TextView userPassword=findViewById(R.id.edtPassword);
        Button btnEntrar=findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("admin")&& userPassword.getText().toString().equals("Uin123")){
                    Intent intent = new Intent(view.getContext(),MainActivity.class);
                    startActivityForResult(intent,0);
                }else{//para condicion falsa
                    Toast.makeText(Login.this,"Error\nUsuario y/o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }


        });
    }

}