package com.example.keenan.widi_1202152333_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class eatbus extends AppCompatActivity {
    TextView debresto, debmenu, debporsi, debharga;
    int b = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatbus);

        debmenu = (TextView) findViewById(R.id.rmenu);
        debporsi = (TextView) findViewById(R.id.rporsi);
        debharga = (TextView) findViewById(R.id.rharga);
        debresto = (TextView) findViewById(R.id.resto);

        Intent a = getIntent();
        String rmenu = a.getStringExtra("rmenu");
        String rporsi = a.getStringExtra("rporsi");
        String rharga = a.getStringExtra("rharga");
        String resto = a.getStringExtra("resto");

        debmenu.setText(rmenu.toString());
        debporsi.setText(rporsi.toString());
        debharga.setText(String.valueOf(Integer.parseInt(rharga)*Integer.parseInt(rporsi)));
        debresto.setText(resto.toString());

        if (Integer.parseInt(debharga.getText().toString()) > b ) {
            Toast.makeText(getApplicationContext(),"Jangan makan disini. Kamu ga akan kuat", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Yeeaay, kamu bisa makan disini", Toast.LENGTH_LONG).show();
        }




    }
}
