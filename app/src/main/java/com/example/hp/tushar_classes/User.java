package com.example.hp.tushar_classes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Handler handler = new Handler();
        b1 = (Button) findViewById(R.id.btnSearch);
        b2 = (Button) findViewById(R.id.btnAdd);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(User.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 900000000);

    }
    public void onClick(View view) {
        int id;
        switch (view.getId()) {
            case R.id.btnSearch:
                Intent intent = new Intent(this, login.class);
                this.startActivity(intent);
                break;

            case R.id.btnAdd:
                Intent intent1 = new Intent(this, usersecond.class);
                this.startActivity(intent1);
                break;







        }
    }
}
