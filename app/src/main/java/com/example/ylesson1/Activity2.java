package com.example.ylesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView name, surname, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);

        Intent i = getIntent();

        if (i != null){
            name.setText(i.getStringExtra("name"));
            surname.setText(i.getStringExtra("surname"));
            age.setText(i.getStringExtra("age"));
        }

    }


    public void BackBtn(View view) {
        Intent i = new Intent(Activity2.this, MainActivity.class);


        startActivity(i);
        finish();
    }
}