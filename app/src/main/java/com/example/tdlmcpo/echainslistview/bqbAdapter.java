package com.example.tdlmcpo.echainslistview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tdlmcpo on 2018/2/15.
 */

public class bqbAdapter extends RecyclerView.Adapter<bqbAdapter.ViewHolder> {
    private List<bqb> mbqbList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView bqbImage;
        TextView bqbName;

        public ViewHolder(View view){
            super(view);
            bqbImage=(ImageView)view.findViewById(R.id.bqb_image);
            bqbName=(TextView)view.findViewById(R.id.bqb_name);
        }
    }

    public  bqbAdapter(List<bqb> bqbList){
        mbqbList = bqbList;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        bqb bqb=mbqbList.get(position);
        holder.bqbImage.setImageResource(bqb.getImageId());
        holder.bqbName.setText(bqb.getName());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_layout,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return mbqbList.size();
    }
}
