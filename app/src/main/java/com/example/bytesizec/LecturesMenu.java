package com.example.bytesizec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LecturesMenu extends AppCompatActivity {
    public Button pointers, inout, dataType, reference, loops, progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectures_menu);

        inout = (Button) findViewById(R.id.inoutbutton);
        inout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LecturesMenu.this,FileInOut.class);
                startActivity(intent);
            }
        });

        pointers = (Button) findViewById(R.id.pointerbutton);
        pointers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LecturesMenu.this,VideoWatchPointers.class);
                startActivity(intent);
            }
        });

        dataType = (Button) findViewById(R.id.dataTypeButton);
        dataType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LecturesMenu.this,DataVideo.class);
                startActivity(intent);
            }
        });

        reference = (Button) findViewById(R.id.referenceButton);
        reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LecturesMenu.this,ValueVideo.class);
                startActivity(intent);
            }
        });

        progress = (Button) findViewById(R.id.progressbutton);
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LecturesMenu.this,Progress.class);
                startActivity(intent);
            }
        });


        loops = (Button) findViewById(R.id.loopsButton);
        loops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LecturesMenu.this,loops.class);
                startActivity(intent);
            }
        });

    }
}
