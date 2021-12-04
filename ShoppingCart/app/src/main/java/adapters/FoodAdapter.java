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

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{
    List<Food> listFood;
    private IOnClickItem iOnClickItem;

    public void setiOnClickItem(IOnClickItem iOnClickItem) {
        this.iOnClickItem = iOnClickItem;
    }

    public FoodAdapter(List<Food> listFood) {
        this.listFood = listFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_food,parent,false);
        FoodViewHolder foodViewHolder=new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food=listFood.get(position);
        holder.image.setImageResource(food.getImage());
        holder.name.setText(food.getName());
        holder.address.setText(food.getAddress());
        holder.price.setText(food.getPrice()+"đ");

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOnClickItem.onClickItem(food);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class FoodViewHolder extends ViewHolder {
        TextView name,address,price;
        ImageView image;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            address=itemView.findViewById(R.id.address);
            price=itemView.findViewById(R.id.price);
            image=itemView.findViewById(R.id.image);
        }
    }
}
