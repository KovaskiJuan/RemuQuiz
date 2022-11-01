package com.example.remuquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout fixa = findViewById( R.id.fixaLayout);
        final LinearLayout variavel = findViewById( R.id.variavelLayout);
        final LinearLayout benef = findViewById( R.id.benefitsLayout);
        final LinearLayout explosion = findViewById( R.id.explosionLayout);

        final Button startBtn = findViewById( R.id.startQuizButton);



        fixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Remuneração Fixa";

                fixa.setBackgroundResource(R.drawable.round_back_white_stroke10);

                variavel.setBackgroundResource(R.drawable.round_back_white10);

                benef.setBackgroundResource(R.drawable.round_back_white10);

                explosion.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        variavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Remuneração Variável";

                variavel.setBackgroundResource(R.drawable.round_back_white_stroke10);

                fixa.setBackgroundResource(R.drawable.round_back_white10);

                benef.setBackgroundResource(R.drawable.round_back_white10);

                explosion.setBackgroundResource(R.drawable.round_back_white10);

            }
        });


        benef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Benefícios";

                benef.setBackgroundResource(R.drawable.round_back_white_stroke10);

                variavel.setBackgroundResource(R.drawable.round_back_white10);

                fixa.setBackgroundResource(R.drawable.round_back_white10);

                explosion.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        explosion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Quebra Qrânio";

                explosion.setBackgroundResource(R.drawable.round_back_white_stroke10);

                variavel.setBackgroundResource(R.drawable.round_back_white10);

                fixa.setBackgroundResource(R.drawable.round_back_white10);

                benef.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Por favor, selecione um tema", Toast.LENGTH_SHORT).show();

                }
                else{

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);

                }


            }
        });

    }
}