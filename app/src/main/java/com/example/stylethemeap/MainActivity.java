package com.example.stylethemeap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    TextView reversedName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameET);
        reversedName = findViewById(R.id.nameBackwards);
    }

    public void switchPages(View v) {
        Intent intent = new Intent(MainActivity.this, OtherActivity.class);
        startActivity(intent);
    }

    public void setReversedName(View view){
        String reversed = "";
        for (int i = name.getText().length() - 1; i >= 0; i--) {
            reversed += name.getText().charAt(i);
        }

        reversedName.setText(reversed);
    }
}