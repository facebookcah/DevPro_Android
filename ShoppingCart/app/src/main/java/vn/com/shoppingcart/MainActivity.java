package vn.com.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import adapters.FoodAdapter;
import interfaces.IOnClickItem;
import models.Food;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_listFood;
    TextView countOrder, btnOrder;
    FoodAdapter foodAdapter;
    List<Food> listFood;
    int count = 0;
    List<Food> foodOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        createList();
        addEvent();
    }


    private void addControl() {
        countOrder = findViewById(R.id.countOrder);
        btnOrder = findViewById(R.id.btnOrder);
        rv_listFood = findViewById(R.id.rv_listFood);
    }

    private void createList() {
        listFood = new ArrayList<>();
        listFood.add(new Food(R.drawable.trasua1, "Trà sữa Phúc Long", "Hà Nội", 23000));
        listFood.add(new Food(R.drawable.trasua2, "Trà sữa Phúc Long", "Hà Nội", 25000));
        listFood.add(new Food(R.drawable.trasua3, "Trà sữa Phúc Long", "Hà Nội", 50000));
        listFood.add(new Food(R.drawable.trasua4, "Trà sữa Phúc Long", "Hà Nội", 30000));
        listFood.add(new Food(R.drawable.trasua6, "Trà sữa Phúc Long", "Hà Nội", 20000));
        listFood.add(new Food(R.drawable.trasua7, "Trà sữa Phúc Long", "Hà Nội", 29000));
        listFood.add(new Food(R.drawable.trasua8, "Trà sữa Phúc Long", "Hà Nội", 35000));
        listFood.add(new Food(R.drawable.trasua9, "Trà sữa Phúc Long", "Hà Nội", 20000));
        listFood.add(new Food(R.drawable.trasua10, "Trà sữa Phúc Long", "Hà Nội", 42000));
        listFood.add(new Food(R.drawable.trasua7, "Trà sữa Phúc Long", "Hà Nội", 33000));
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 2, RecyclerView.VERTICAL, false);
        foodAdapter = new FoodAdapter(listFood);
        rv_listFood.setLayoutManager(layoutManager);
        rv_listFood.setAdapter(foodAdapter);

    }

    private void addEvent() {
        foodOrders = new ArrayList<>();
        foodAdapter.setiOnClickItem(new IOnClickItem() {
            @Override
            public void onClickItem(Food food) {
                count++;
                countOrder.setText(count + "");
                foodOrders.add(food);
            }
        });
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,TotalPriceActivity.class);
                intent.putExtra("list", (Serializable) foodOrders);
                startActivity(intent);
            }
        });

    }
}