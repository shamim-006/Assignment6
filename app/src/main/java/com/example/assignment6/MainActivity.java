package com.example.assignment6;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();
        itemList.add(new Item("CSE", R.drawable.cse, "Department of Computer Science and Engineering"));
        itemList.add(new Item("EEE", R.drawable.eee, "Department of Electrical and Electronics Engineering"));
        itemList.add(new Item("English", R.drawable.english, "Department of English"));
        adapter = new MyAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}
