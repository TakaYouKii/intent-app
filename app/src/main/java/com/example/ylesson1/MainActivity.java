package com.example.ylesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, surname, age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);
    }

    public void ForthBtn(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("name", name.getText().toString());
        i.putExtra("surname", surname.getText().toString());
        i.putExtra("age", age.getText().toString());
        startActivity(i);
        finish();
    }
}