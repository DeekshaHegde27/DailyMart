package com.comptech.login.dailymart;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView chocolate,shampoos,fruits,vegetables;
    private ImageView soaps, rice, biscuits, milks;
    private ImageView pads, juices;
private Button LogoutBtn,checkOrderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
        LogoutBtn = (Button)  findViewById(R.id.admin_logout_btn);
        checkOrderBtn = (Button)  findViewById(R.id.check_orders_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,HomeActivity.class);
                intent.putExtra("Admins","Admins");
                startActivity(intent);


            }
        });
        checkOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddnewProductActivity.class);
                startActivity(intent);


            }
        });


        chocolate = (ImageView) findViewById(R.id.chocolate);
        shampoos = (ImageView) findViewById(R.id.shampoos);
        fruits = (ImageView) findViewById(R.id.fruits);
        vegetables = (ImageView) findViewById(R.id.vegetables);

        soaps = (ImageView) findViewById(R.id.soaps);
        rice = (ImageView) findViewById(R.id.rice);
        biscuits = (ImageView) findViewById(R.id.biscuits);
        milks = (ImageView) findViewById(R.id.milks);

        pads = (ImageView) findViewById(R.id.pads);
        juices = (ImageView) findViewById(R.id.juices);


        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "chocolate");
                startActivity(intent);
            }
        });


        shampoos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "shampoos");
                startActivity(intent);
            }
        });


        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "fruits");
                startActivity(intent);
            }
        });

        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this,HomeActivity .class);
                intent.putExtra("category", "vegetables");
                startActivity(intent);
            }
        });


        soaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "soaps");
                startActivity(intent);
            }
        });


        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "rice");
                startActivity(intent);
            }
        });



        biscuits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "biscuits");
                startActivity(intent);
            }
        });


        milks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "milks");
                startActivity(intent);
            }
        });



        pads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "pads");
                startActivity(intent);
            }
        });


        juices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddnewProductActivity.class);
                intent.putExtra("category", "juices");
                startActivity(intent);
            }
        });



    }
}
