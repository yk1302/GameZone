package com.example.tictactoe;

import static com.example.tictactoe.MainActivity.player1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import java.util.*;
public class MainActivity5 extends AppCompatActivity {
ImageButton imageButton,imageButton2,imageButton3;
TextView textView10;        String user="";  String comp; String name;
int random;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView10=findViewById(R.id.textView10);
        imageButton=findViewById(R.id.imageButton);
        imageButton2=findViewById(R.id.imageButton2);
        imageButton3=findViewById(R.id.imageButton3);

        Random ran=new Random();
        random=ran.nextInt(3);
        if(random==0){comp="rock";}
        else if(random==1){comp="paper";}
        else {comp="scissor";}
 Intent in=getIntent();

        name=in.getStringExtra(player1);

       //Toast.makeText(this, "Computer choice= "+comp, Toast.LENGTH_SHORT).show();

    imageButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            user = "rock";
            Toast.makeText(MainActivity5.this, name.toUpperCase()+" choice= " + user, Toast.LENGTH_SHORT).show();
        }
    });
    imageButton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            user = "paper";
            Toast.makeText(MainActivity5.this, name.toUpperCase()+" choice= " + user, Toast.LENGTH_SHORT).show();
        }
    });
    imageButton3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            user = "scissor";
            Toast.makeText(MainActivity5.this, name.toUpperCase()+" choice= " + user, Toast.LENGTH_SHORT).show();
        }
    });
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Toast.makeText(MainActivity5.this, "COMPUTING RESULT AND DECLARING WINNER SOON...", Toast.LENGTH_SHORT).show();

        }
    },8000);
        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {
                if(user.equals(comp)){
                    textView10.setText("   GAME DRAWN...............  ");
                }

                else if((user.equals("rock") && comp.equals("scissor")) || (user.equals("scissor")&&comp.equals("paper")) || (user.equals("paper")&& comp.equals("rock"))){
                    textView10.setText("CONGRATULATIONS.......  "+name.toUpperCase()+" YOU ARE WINNER OF THIS GAME.....!!!!!!");
                }
                else if((user.equals("scissor") && comp.equals("rock")) || (user.equals("paper")&&comp.equals("scissor")) || (user.equals("rock")&& comp.equals("paper"))){
                    textView10.setText("SORRY..... "+name.toUpperCase()+" YOU LOSE THE GAME!!!!!");
                }

            }

        },12000);

    }
}