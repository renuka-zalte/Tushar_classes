package com.example.hp.tushar_classes;

import android.annotation.SuppressLint;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import static com.example.hp.tushar_classes.SQLiteHelper.TABLE_NAME;
import static com.example.hp.tushar_classes.SQLiteHelper.Table_Column_ID;

public class ViewDetails extends AppCompatActivity {
    TextView tv;
    public static final String TABLE_NAME = "UserTable";
    String fees;
    DBController controller = new DBController(this);
    ListView ls;
    TextView infotext;
    public EditText e1;
    SQLiteDatabase db;
    SQLiteHelper helper;
    Button b1;
    Cursor cursor = null;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);
        tv = (TextView) findViewById(R.id.fee);
        b1 = (Button) findViewById(R.id.extract);
        e1 = (EditText) findViewById(R.id.edit);

    }
   


    public void watch(View view)
{

    tv.setText("done");
}

    }
