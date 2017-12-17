package com.example.student.pum_lab_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button przycisk_zmien = findViewById(R.id.przycisk_zmien);
        Button przycisk_lista = findViewById(R.id.przycisk_lista);


          }

    public void clik_zmien_miejsce(View view)
    {
        TextView miasto = findViewById(R.id.miasto);
        EditText podaj_nazwe = findViewById(R.id.podaj_nazwe);
        miasto.setText(podaj_nazwe.getText().toString());

    }

    public  void  clik_lista( View view)
    {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("miasto", R.id.miasto);
        Bundle bundle = new Bundle();
        bundle.putString("miasto", String.valueOf(R.id.podaj_nazwe));
        intent.putExtras(bundle);


        startActivity(intent);
    }






}
