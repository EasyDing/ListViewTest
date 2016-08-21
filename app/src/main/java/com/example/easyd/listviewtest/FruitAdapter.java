package com.example.easyd.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Easy.D on 16/8/21.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Fruit fruit = getItem(position);
        View view;
        ViewHolder vh;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            vh = new ViewHolder();
            vh.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            vh.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(vh);
        }else{
            view = convertView;
            vh = (ViewHolder) view.getTag();
        }



        vh.fruitImage.setImageResource(R.mipmap.ic_launcher);
        vh.fruitName.setText(fruit.getName());

        return view;
    }

    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
