package com.example.lab4921;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputTV;
    private EditText inputVT;
    private TextView answerTV;
    private Button CalcP;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputTV = this.findViewById(R.id.inputTV);
        this.inputVT = this.findViewById(R.id.inputVT);
        this.answerTV = this.findViewById(R.id.answerTV);
        this.CalcP = this.findViewById(R.id.CalcP);
    }

    public void onCalcButtonClicked(View v)
    {
        if(v == CalcP)
        {
            this.answerTV.setText("");
            Integer valuea = Integer.valueOf(this.inputTV.getText().toString());
            Integer valueb = Integer.valueOf(this.inputVT.getText().toString());

            Integer prt1 = (valuea*valuea) + (valueb*valueb);
            double solution = Math.sqrt(prt1);
            this.answerTV.setText((int) solution);
        }

    }

}