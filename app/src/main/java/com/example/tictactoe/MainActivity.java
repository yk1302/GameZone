package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button2;
    private Button button3;
    private Button button4;
    private Button button13;
    EditText editTextTextPersonName2;
    public static final String player1="com.example.tictactoe.extra.id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button13=findViewById(R.id.button13);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name1=editTextTextPersonName2.getText().toString();

        Toast.makeText(MainActivity.this, "Opening Tic Tac Toe game ", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity.this, MainActivity6_tictactoe.class);
        in.putExtra(player1,name1);
        startActivity(in);

    }
});

button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name1=editTextTextPersonName2.getText().toString();
        Toast.makeText(MainActivity.this, "Opening Guess The Number game", Toast.LENGTH_SHORT).show();
        Intent in1=new Intent(MainActivity.this,MainActivity4.class);
        in1.putExtra(player1,name1);
        startActivity(in1);

    }
});
button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name1=editTextTextPersonName2.getText().toString();

        Toast.makeText(MainActivity.this, "Opening Stone, Paper And Scissor Game", Toast.LENGTH_SHORT).show();
        Intent in2=new Intent(MainActivity.this,MainActivity5.class);
         in2.putExtra(player1,name1);
        startActivity(in2);
    }
});
button13.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name1=editTextTextPersonName2.getText().toString();

        Toast.makeText(MainActivity.this, "Opening Snake, Water And Gun Game", Toast.LENGTH_SHORT).show();
        Intent in2=new Intent(MainActivity.this,MainActivity7.class);
        in2.putExtra(player1,name1);
        startActivity(in2);
    }
});

    }
}