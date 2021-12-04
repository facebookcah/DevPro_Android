package vn.com.shoppingcart;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import adapters.FoodOrderAdapter;
import models.Food;

public class TotalPriceActivity extends AppCompatActivity {
    TextView tv_pay;
    RecyclerView rv_order;
    ImageView back;
    Button btnPay;
    FoodOrderAdapter foodOrderAdapter;
    ArrayList<Food> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_price);
        rv_order = findViewById(R.id.rv_order);
        back = findViewById(R.id.btnBack);
        btnPay = findViewById(R.id.btn_pay);
        tv_pay = findViewById(R.id.tv_pay);
        Intent intent = getIntent();
        list = (ArrayList<Food>) intent.getSerializableExtra("list");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(), RecyclerView.VERTICAL, false);
        foodOrderAdapter = new FoodOrderAdapter(list);
        rv_order.setLayoutManager(layoutManager);
        rv_order.setAdapter(foodOrderAdapter);
        double total = 0;
        for (Food food : list) {
            total += food.getPrice();
        }
        tv_pay.setText(total + "");
        btnPay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Done", Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}