package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Main Activity2");

        Intent inter = getIntent();
        String name = getIntent().getStringExtra("NAME");
        String pass = getIntent().getStringExtra("PASSWORD");

        TextView resultMasuk = findViewById(R.id.masukLog);

        resultMasuk.setText("Name : "+name+"\nPassword : "+pass);
    }
}