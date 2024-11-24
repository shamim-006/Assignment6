package com.example.assignment6;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class DetailActivity extends AppCompatActivity {
    private TextView titleTextView;
    private TextView descriptionTextView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        titleTextView = findViewById(R.id.titleDetail);
        descriptionTextView = findViewById(R.id.descriptionDetail);
        imageView = findViewById(R.id.imageDetail);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResource = getIntent().getIntExtra("image", -1);
        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResource);
    }
}
