package com.example.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);
    }

    public void submit(View view) {
        EditText et1 =(EditText)findViewById(R.id.fullname_edt);
        EditText et2 =(EditText)findViewById(R.id.height_edt);
        EditText et3 =(EditText)findViewById(R.id.weight_edt);
        EditText et4 =(EditText)findViewById(R.id.age_edt);
        EditText et5 =(EditText)findViewById(R.id.contact_edt);
        RadioButton rb1 =(RadioButton)findViewById(R.id.q6rbtn1);
        RadioButton rb2 =(RadioButton)findViewById(R.id.q6rbtn2);
        EditText et6 = (EditText)findViewById(R.id.que7_edt);
        EditText et7 = (EditText)findViewById(R.id.que8_edt);
        RadioButton rb3 =(RadioButton)findViewById(R.id.q9rbtn1);
        RadioButton rb4 =(RadioButton)findViewById(R.id.q9rbtn2);
        EditText et8 = (EditText)findViewById(R.id.que9_edt);
        Spinner sp1 = (Spinner)findViewById(R.id.que10_spinner);
        Spinner sp2 = (Spinner)findViewById(R.id.que11_spinner);
        RadioButton rb5 =(RadioButton)findViewById(R.id.q13rbtn1);
        RadioButton rb6 =(RadioButton)findViewById(R.id.q13rbtn2);
        EditText et9 = (EditText)findViewById(R.id.que13_edt);


        String s1 =et1.getText().toString();
        String s2 =et2.getText().toString();
        String s3 =et3.getText().toString();
        String s4 =et4.getText().toString();
        String s5 =et5.getText().toString();
        String s6 ="";
                if(rb1.isChecked()){
                    s5 = "Yes";
                }
                else{
                    s5 = "No";
                }
        String s7 = et6.getText().toString();
        String s8 = et7.getText().toString();
        String s9 ="";
            if(rb3.isChecked()){
                s5 = "Yes";
            }
            else{
                s5 = "No";
            }
        String s10 = et8.getText().toString();
        String s11 = sp1.getSelectedItem().toString();
        String s12 = sp2.getSelectedItem().toString();
        String s13 ="";
            if(rb5.isChecked()){
                s5 = "Yes";
            }
            else{
                s5 = "No";
            }
        String s14 = et9.getText().toString();

    }
}