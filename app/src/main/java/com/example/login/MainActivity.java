package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText user;
    private EditText pass;
    private Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        ingresar = findViewById(R.id.ingresar);
    }


    public void ingresar(View view){
       String user="valeriee";
       String pass="rValerie123*";

        if ((user=="valeriee")&&(pass=="rValerie123*")){
            Intent ingresar = new Intent(this, MainActivity2.class);
            startActivity(ingresar);
        }else
             if (user!="valeriee"){
            System.out.println("Usuario ingresado inválido");
        }
             else if (pass!="rValerie123*"){
                 System.out.println("Contraseña ingresada inválida");
    }
}
}