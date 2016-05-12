package com.example.zousheng.fleetingtime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private String name,number,qq,telephone;
    private TextView informationName,informationNumber,informationQq,informationTelephone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_information);
        setSupportActionBar(toolbar);
        Intent intent=getIntent();
        name=intent.getStringExtra("name");
        number=intent.getStringExtra("number");
        qq=intent.getStringExtra("qq");
        telephone=intent.getStringExtra("telephone");
        informationName= (TextView) findViewById(R.id.informationtext_name);
        informationNumber= (TextView) findViewById(R.id.informationtext_number);
        informationQq= (TextView) findViewById(R.id.informationtext_qq);
        informationTelephone= (TextView) findViewById(R.id.informationtext_telephone);
        informationName.setText(name);
        informationNumber.setText(number);
        informationQq.setText(qq);
        informationTelephone.setText(telephone);
    }

}
