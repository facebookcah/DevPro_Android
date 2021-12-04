package adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;

import interfaces.IOnClickItem;
import models.Food;
import vn.com.shoppingcart.R;

public class FoodOrderAdapter extends RecyclerView.Adapter<FoodOrderAdapter.FoodViewHolder>{
    List<Food> listFood;

    public FoodOrderAdapter(List<Food> listFood) {
        this.listFood = listFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_order,parent,false);
        FoodViewHolder foodViewHolder=new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food=listFood.get(position);
        holder.image_order.setImageResource(food.getImage());
        holder.tv_name.setText(food.getName());
        holder.tv_price.setText(food.getPrice()+" đ");
        holder.tv_count.setText("1");
        holder.tv_total.setText(food.getPrice()+" đ");
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class FoodViewHolder extends ViewHolder {
        TextView tv_name,tv_price,tv_count,tv_total;
        ImageView image_order;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_count=itemView.findViewById(R.id.tv_count);
            tv_name=itemView.findViewById(R.id.tv_name);
            tv_price=itemView.findViewById(R.id.tv_price);
            tv_total=itemView.findViewById(R.id.tv_total);
            image_order=itemView.findViewById(R.id.image_order);
        }
    }
}
