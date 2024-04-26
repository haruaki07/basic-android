package com.misbahul.akumancing;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PageDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int menu = getIntent().getIntExtra("title", -1);
        ((TextView) findViewById(R.id.page_title)).setText(getResources().getString(menu));
        TextView desc_content = findViewById(R.id.desc_content);
        ImageView page_icon = findViewById(R.id.page_icon);
        ImageView imgBanner = findViewById(R.id.imgBanner);

        if (menu == R.string.fishing_spot) {
            page_icon.setImageResource(R.drawable.map);
            imgBanner.setImageResource(R.drawable.fishing_spot_banner);
            desc_content.setText(R.string.fishing_spot_desc);
        } else if (menu == R.string.knowledge) {
            page_icon.setImageResource(R.drawable.zoology);
            imgBanner.setImageResource(R.drawable.knowledge_banner );
            desc_content.setText(R.string.knowledge_desc);
        } else if (menu == R.string.shop) {
            page_icon.setImageResource(R.drawable.shop);
            imgBanner.setImageResource(R.drawable.shop_banner);
            desc_content.setText(R.string.shop_desc);
        } else if (menu == R.string.tips_trick) {
            page_icon.setImageResource(R.drawable.tips);
            imgBanner.setImageResource(R.drawable.tips_trick_banner);
            desc_content.setText(R.string.tips_trick_desc);
        }
    }
}