package com.example.tictactoe;

import static com.example.tictactoe.MainActivity6_tictactoe.Winner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6_tictactoe_result extends AppCompatActivity {
TextView textView5;
Button button11,button10;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity6_tictactoe_result);
        textView5=findViewById(R.id.textView5);
        button10=findViewById(R.id.button10);
        button11=findViewById(R.id.button11);
        Intent in=getIntent();
       String winName ;
       winName=in.getStringExtra(Winner);
       textView5.setText("CONGRATULATIONS PLAYER "+ winName.toUpperCase()+" YOU ARE WINNER....!!!!!");
       button10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent in=new Intent(MainActivity6_tictactoe_result.this,MainActivity6_tictactoe.class);
               startActivity(in);
//               yes restart
           }
       });
       button11.setOnClickListener(new View.OnClickListener() {
           @Override
//           no
           public void onClick(View v) {
               Intent in=new Intent(MainActivity6_tictactoe_result.this,MainActivity.class);
               startActivity(in);
           }
       });
    }
}