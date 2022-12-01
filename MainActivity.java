package com.example.meinlied;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = this.findViewById(R.id.btn);
        b.setOnClickListener(this);
    }
    public void onClick(View v){
        EditText op1=this.findViewById(R.id.edita);
        EditText op2=this.findViewById(R.id.editb);
        String a=op1.getText().toString();
        String b=op2.getText().toString();
        int s= Integer.parseInt(a)+Integer.parseInt(b);
        EditText somme=this.findViewById(R.id.edits);
        somme.setText(String.valueOf(s));
    }}
