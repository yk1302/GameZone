package com.example.tictactoe;

import static com.example.tictactoe.MainActivity.player1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    ImageButton imageButton4,imageButton5,imageButton6;
    TextView textView25;        String user1="";  String comp1; String name;
    int random;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textView25=findViewById(R.id.textView25);
        imageButton4=findViewById(R.id.imageButton4);
        imageButton5=findViewById(R.id.imageButton5);
        imageButton6=findViewById(R.id.imageButton6);
        Random ran=new Random();
        random=ran.nextInt(3);
        if(random==0){comp1="snake";}
        else if(random==1){comp1="water";}
        else {comp1="gun";}
        Intent in=getIntent();
        name=in.getStringExtra(player1);

        //Toast.makeText(this, "Computer choice= "+comp1, Toast.LENGTH_SHORT).show();
imageButton4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        user1 = "snake";
        Toast.makeText(MainActivity7.this, name.toUpperCase()+" choice= " + user1, Toast.LENGTH_SHORT).show();
    }
});
imageButton5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        user1 = "water";
        Toast.makeText(MainActivity7.this, name.toUpperCase()+" choice= " + user1, Toast.LENGTH_SHORT).show();
    }
});
imageButton6.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        user1 = "gun";
        Toast.makeText(MainActivity7.this, name.toUpperCase()+" choice= " + user1, Toast.LENGTH_SHORT).show();
    }
});

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity7.this, "COMPUTING RESULT AND DECLARING WINNER SOON...", Toast.LENGTH_SHORT).show();

            }
        },8000);

        new Handler().postDelayed(new Runnable() {

            @SuppressLint("SetTextI18n")
            @Override

            public void run() {
                if(user1.equals(comp1)){
                    textView25.setText("   GAME DRAWN...............  ");
                }

                else if((user1.equals("snake") && comp1.equals("water")) || (user1.equals("water")&&comp1.equals("gun")) || (user1.equals("gun")&& comp1.equals("snake"))){
                    textView25.setText("CONGRATULATIONS.......  "+name.toUpperCase()+" YOU ARE WINNER OF THIS GAME.....!!!!!!");
                }
                else if((user1.equals("water") && comp1.equals("snake")) || (user1.equals("gun")&&comp1.equals("water")) || (user1.equals("snake")&& comp1.equals("gun"))){
                    textView25.setText("SORRY..... "+name.toUpperCase()+" YOU LOSE THE GAME!!!!!");
                }

            }

        },12000);

    }
}