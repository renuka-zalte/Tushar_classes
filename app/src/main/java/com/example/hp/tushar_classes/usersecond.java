package com.example.hp.tushar_classes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usersecond extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersecond);
        b1 = (Button) findViewById(R.id.view);
        b2 = (Button) findViewById(R.id.dec);
        b2 = (Button) findViewById(R.id.structure);
    }
    public void onClick(View view) {
        int id;
        switch (view.getId()) {
            case R.id.view:
                Intent i = new Intent(usersecond.this, placelist2.class);
                startActivity(i);
                break;

            case R.id.dec:
                Intent intent2 = new Intent(this, value.class);
                this.startActivity(intent2);
                break;

                case R.id.structure:
                Intent intent3= new Intent(this, feedback.class);
                this.startActivity(intent3);
                break;







        }
    }
}
