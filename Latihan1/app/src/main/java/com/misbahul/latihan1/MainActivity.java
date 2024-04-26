package com.misbahul.latihan1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

    @SuppressWarnings("SetTextI18n")
    public void convertCurrency(View view) {
        EditText rupiahInput = findViewById(R.id.rupiahInput);
        TextView textView = findViewById(R.id.textView);

        if (!rupiahInput.getText().toString().isEmpty()) {
            float rupiahValue = Float.parseFloat(rupiahInput.getText().toString());
            float dollarValue = rupiahValue * 0.0001f;
            textView.setText("$" + dollarValue);
        } else {
            textView.setText(R.string.empty_input);
        }
    }
}