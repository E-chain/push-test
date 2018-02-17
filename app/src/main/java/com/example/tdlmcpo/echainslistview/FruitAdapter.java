package com.example.tdlmcpo.echainslistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by tdlmcpo on 2018/2/8.
 */

public class FruitAdapter extends ArrayAdapter<bqb> {
    private int resourceId;
    public FruitAdapter(Context context, int textViewResourceId, List<bqb> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        bqb bqb = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.bqbImage = (ImageView) view.findViewById(R.id.bqb_image);
            viewHolder.bqbName = (TextView) view.findViewById(R.id.bqb_name);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.bqbImage.setImageResource(bqb.getImageId());
        viewHolder.bqbName.setText(bqb.getName());
        return view;
    }

    class ViewHolder{
        ImageView bqbImage;
        TextView bqbName;
    }
}
