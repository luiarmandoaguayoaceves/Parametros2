package com.example.parametros2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
    }

    //metodo para pasar a la siguiente activity
    public void Enviar(View view){
        Intent enviar = new Intent(this, MainActivity2.class);
        //que se lleve el nombre "dato"
        enviar.putExtra("dato", et1.getText().toString());
        startActivity(enviar);
    }
}