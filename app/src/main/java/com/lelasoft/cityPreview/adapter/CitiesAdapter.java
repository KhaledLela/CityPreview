package com.lelasoft.cityPreview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lelasoft.cityPreview.R;
import com.lelasoft.cityPreview.model.City;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder>{

    private final List<City> dataSource;

    public CitiesAdapter(List<City> data) {
        dataSource = data;
    }


    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CityViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        City city = getItem(position);
        holder.cityNameTV.setText(city.getName());
        holder.cityDetailsTV.setText(city.getDetails());
        Picasso.get().load(city.getImage())
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.cityIV,new Callback(){

                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError(Exception e) {
                        e.printStackTrace();
                    }
                });
    }

    private City getItem(int position) {
        return dataSource.get(position);
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    public class CityViewHolder extends RecyclerView.ViewHolder{

        private TextView cityNameTV;
        private TextView cityDetailsTV;
        private ImageView cityIV;
        public CityViewHolder(View itemView) {
            super(itemView);
            cityNameTV = itemView.findViewById(R.id.txt_city_name);
            cityDetailsTV = itemView.findViewById(R.id.txt_city_info);
            cityIV = itemView.findViewById(R.id.img_city);
        }
    }
}