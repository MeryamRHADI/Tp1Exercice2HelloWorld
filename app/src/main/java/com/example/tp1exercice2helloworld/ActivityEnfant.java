package com.example.tp1exercice2helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEnfant extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfant);
        Intent intent = getIntent();



           EditText nomEdit = (EditText) findViewById(R.id.editTextNomRet);
            EditText prenomEdit = (EditText) findViewById(R.id.editTextPrenomRet);
            EditText ageEdit = (EditText) findViewById(R.id.editTextAgeRet);
            EditText competenceEdit = (EditText) findViewById(R.id.editTextCompRet);
            EditText telEdit = (EditText) findViewById(R.id.editTextTelRet);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nom = extras.getString("nom");
            String prenom = extras.getString("prenom");
            String age = extras.getString("age");
            String competence = extras.getString("competence");
            String tel = extras.getString("tel");

            nomEdit.setText(nom);
            prenomEdit.setText(prenom);
            ageEdit.setText(age);
            competenceEdit.setText(competence);
            telEdit.setText(tel);

        }

        }





   // }
}
