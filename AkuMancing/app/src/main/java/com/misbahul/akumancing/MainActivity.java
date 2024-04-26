package com.misbahul.akumancing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void spotMenu(View view) {
        Intent i = new Intent(getApplicationContext(), PageDetail.class);
        i.putExtra("title", R.string.fishing_spot);
        startActivity(i);
    }

    public void knowledgeMenu(View view) {
        Intent i = new Intent(getApplicationContext(), PageDetail.class);
        i.putExtra("title", R.string.knowledge);
        startActivity(i);
    }

    public void shopMenu(View view) {
        Intent i = new Intent(getApplicationContext(), PageDetail.class);
        i.putExtra("title", R.string.shop);
        startActivity(i);
    }

    public void tipsTrickMenu(View view) {
        Intent i = new Intent(getApplicationContext(), PageDetail.class);
        i.putExtra("title", R.string.tips_trick);
        startActivity(i);
    }
}