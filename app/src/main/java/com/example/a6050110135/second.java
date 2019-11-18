package com.example.a6050110135;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class second extends AppCompatActivity {

    EditText et1,et2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a =Float.parseFloat(et1.getText().toString());
                float b =Float.parseFloat(et2.getText().toString());
                float c= a*b*1/2;
                AlertDialog.Builder dig1 = new AlertDialog.Builder(second.this);
                dig1.setTitle("คำตอบ");
                dig1.setMessage(" "+c);
                dig1.setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ตกลง", Toast.LENGTH_SHORT).show();
                    }
                });
                dig1.setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ยกเลิก", Toast.LENGTH_SHORT).show();
                    }
                });
                dig1.create();
                dig1.show();
            }
        });

    }
}
