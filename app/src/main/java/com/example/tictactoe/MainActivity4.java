package com.example.tictactoe;
//guess number
import static com.example.tictactoe.MainActivity.player1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
EditText editTextNumber;
Button button12;
TextView textView8;
int guess;         int count=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Random ran=new Random();
        guess=ran.nextInt(100);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView8=findViewById(R.id.textView8);
        button12=findViewById(R.id.button12);
        Intent in=getIntent();
     String name1=   in.getStringExtra(player1);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(editTextNumber.getText().toString());
                count++;
                if(num>guess){textView8.setText("Number Enter By You Is Greater.\nPlease Insert Some Small Number...  ");}
                else if(num<guess){textView8.setText("Number Enter By You Is Smaller.\nPlease Insert Some Large Number...  ");}
                else if(num==guess){textView8.setText("CONGRATULATIONS...!!! "+name1.toUpperCase()+" Number Enter By You Is CORRECT Number\nYou Guess Number Correctly In "+count+" Number Of Guesses.....");}

            }
        });
    }
}