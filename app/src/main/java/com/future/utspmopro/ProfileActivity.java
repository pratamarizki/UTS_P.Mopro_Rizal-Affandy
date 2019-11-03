package com.future.utspmopro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button bHP, bSsmd, bLks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bHP = (Button) findViewById(R.id.bHP);
        bSsmd = (Button) findViewById(R.id.bSsmd);
        bLks = (Button) findViewById(R.id.bLks);

        bHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:089691671660"));
                startActivity(intent);
            }
        });

        bSsmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://instagram.com/rizalaffandy21?igshid=h5fkn8i21nrn"));
                startActivity(intent);
            }
        });

        bLks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://maps.app.goo.gl/CC7R8N3Qbc5uSPDv5"));
                startActivity(intent);
            }
        });
    }
}
