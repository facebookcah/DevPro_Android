package adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import models.Food;
import vn.com.nguyenduyphong_android45_day4.R;

public class FoodAdapter extends BaseAdapter {
     List<Food> foodList;

    public FoodAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View v = layoutInflater.inflate(R.layout.item_food, viewGroup, false);

        TextView tvTitle=v.findViewById(R.id.tvTitle);
        TextView tvName = v.findViewById(R.id.tvName);
        TextView tvRate = v.findViewById(R.id.tvRate);
        TextView tvTime = v.findViewById(R.id.tvTime);
        ImageView image=v.findViewById(R.id.image);
        TextView tvMinPrice=v.findViewById(R.id.tvMinPrice);

        Food food = foodList.get(i);

        image.setImageResource(food.getImage());
        tvTitle.setText(food.getTitle());
        tvRate.setText(food.getRate());
        tvName.setText(food.getName());
        tvTime.setText(food.getDeliveryTime());
        tvMinPrice.setText(food.getMinPrice());



        return v;
    }
}
