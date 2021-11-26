package vn.com.nguyenduyphong_android45_day4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapters.FoodAdapter;
import models.Food;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Food> foodList;
    FoodAdapter foodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lv);
        foodList=new ArrayList<>();
        foodList.add(new Food(R.drawable.bunbo,"Món Huế","(40)","Bún bò Huế","15 min","Tối thiểu 30.000 đ"));
        foodList.add(new Food(R.drawable.bunbo,"Món Huế","(40)","Bún bò Huế","15 min","Tối thiểu 30.000 đ"));
        foodList.add(new Food(R.drawable.bunbo,"Món Huế","(40)","Bún bò Huế","15 min","Tối thiểu 30.000 đ"));
        foodList.add(new Food(R.drawable.bunbo,"Món Huế","(40)","Bún bò Huế","15 min","Tối thiểu 30.000 đ"));
        foodList.add(new Food(R.drawable.bunbo,"Món Huế","(40)","Bún bò Huế","15 min","Tối thiểu 30.000 đ"));

        foodAdapter=new FoodAdapter(foodList);
        listView.setAdapter(foodAdapter);
    }
}