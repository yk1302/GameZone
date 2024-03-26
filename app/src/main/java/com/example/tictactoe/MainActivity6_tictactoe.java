package com.example.tictactoe;

import static com.example.tictactoe.MainActivity.player1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6_tictactoe extends AppCompatActivity {
EditText editTextTextPersonName,name2;
Button button,button1,button2,button3,button4,button5,button6,button7,button9,button8;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
String winPlayer;
    public static final String Winner ="com.example.tictactoe.extra.id";

int flag=0;
    String id1;

   public String id2="";
    int counter=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity6_tictactoe);
        button=findViewById(R.id.button);
        name2=findViewById(R.id.name2);
        Intent in=getIntent();
        id1=in.getStringExtra(player1);
        init();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

id2=name2.getText().toString();
                Toast.makeText(MainActivity6_tictactoe.this, "PLAYER1="+id1.toUpperCase()+" You Get Chance To Move First ", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity6_tictactoe.this, "PLAYER2="+id2.toUpperCase()+" You Have Second Move ", Toast.LENGTH_SHORT).show();

            }

        });

        new Handler().postDelayed(new Runnable() {


            @Override

            public void run() {
                Toast.makeText(MainActivity6_tictactoe.this, ""+id1.toUpperCase()+" your move...", Toast.LENGTH_SHORT).show();
            }
        },10000);

    }

    private void init(){
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);


    }

    public void check(View view){
        Button BtnCurrent=(Button)view;
        //setting 0 or X
        if(BtnCurrent.getText().toString().equals("")){
        counter++;
       if(flag==0){
           Toast.makeText(this, " NEXT "+id2.toUpperCase()+" your move...", Toast.LENGTH_SHORT).show();
           BtnCurrent.setText("0");
           flag=1;
       }
       else{
           Toast.makeText(this, " NEXT "+id1.toUpperCase()+" your move...", Toast.LENGTH_SHORT).show();
           BtnCurrent.setText("X");
           flag=0;
       }
//check for win condition
if(counter>4) {
    b1 = button1.getText().toString();
    b2 = button2.getText().toString();
    b3 = button3.getText().toString();
    b4 = button4.getText().toString();
    b5 = button5.getText().toString();
    b6 = button6.getText().toString();
    b7 = button7.getText().toString();
    b8 = button8.getText().toString();
    b9 = button9.getText().toString();

    //condition
    if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
        //1 button1,2 and 3 (row1) check

      if (b1 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
        //2 button4,5 and 6 (row2)check
        if (b4 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();

        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
        //3 button7,8 and 9 (row3)check
        if (b7 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
        //4 button1,4 and 7 (col1)check
        if (b1 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();

        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
        //5 button2,5 and 8 (col2)check
        if (b2 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();

        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
        //6 button3,6 and 9 (col3)check
        if (b3 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
        //7 button1,5 and 9 (diagonal1)check
        if (b1 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
        //8 button3,5 and 7 (diagonal2)check
        if (b3 == "0") {
            winPlayer = id1;
        } else {
            winPlayer = id2;
        }
        Toast.makeText(this, "COMPUTING RESULT AND DECLARING WINNER SOON ", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(MainActivity6_tictactoe.this,MainActivity6_tictactoe_result.class);
        in.putExtra(Winner,winPlayer);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(in);
            }
        },5000);
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    }
    else if(counter==9){
        Toast.makeText(this, "GAME IS DRAWN.....!!!!!\nRESTARTING GAME....", Toast.LENGTH_SHORT).show();
        button1.setText("");   button2.setText("");   button3.setText("");   button4.setText("");   button5.setText("");    button6.setText("");   button7.setText("");
        button8.setText("");    button9.setText("");
    }

}





}
    }
}