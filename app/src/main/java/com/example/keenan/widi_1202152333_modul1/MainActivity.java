package com.example.keenan.widi_1202152333_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText dmenu, dporsi ;
Button abnormal, eatbus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dmenu = (EditText) findViewById(R.id.menu);
        dporsi = (EditText)findViewById(R.id.porsi);

        abnormal = (Button)findViewById(R.id.abnormal);
        eatbus = (Button)findViewById(R.id.eatbus);
    }

    public void piliheatbus (View view){
        Intent a = new Intent(this, eatbus.class);
        a.putExtra("rmenu", dmenu.getText().toString());
        a.putExtra("rporsi", dporsi.getText().toString());
        a.putExtra("resto", "eatbus");
        a.putExtra("rharga", "50000");
        startActivity(a);
    }

    public void pilihabnormal (View view) {
        Intent a = new Intent(this, eatbus.class);
        a.putExtra("rmenu", dmenu.getText().toString());
        a.putExtra("rporsi", dporsi.getText().toString());
        a.putExtra("resto", "abnormal");
        a.putExtra("rharga", "30000");
        startActivity(a);
    }


}
