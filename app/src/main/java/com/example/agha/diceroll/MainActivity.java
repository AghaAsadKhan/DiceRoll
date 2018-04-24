package com.example.agha.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btRoll = findViewById(R.id.id_RollButton);
        final ImageView leftDice =  findViewById(R.id.id_LeftDice);
        final ImageView rightDice = findViewById(R.id.id_RightDice);
        final int[] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        btRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(diceArray[randomNumber]);
                Random randomNumberGenerator2 = new Random();
                randomNumber = randomNumberGenerator2.nextInt(6);
                rightDice.setImageResource(diceArray[randomNumber]);


            }
        });


    }
}
