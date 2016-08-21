package com.example.easyd.listviewtest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
    "Strawberry", "Cherry", "Mango"};

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        FruitAdapter fa = new FruitAdapter(getBaseContext(), R.layout.fruit_item, fruitList);
        ListView lv = (ListView) findViewById(R.id.list_view);
        lv.setAdapter(fa);



    }

    private void init(){
        Fruit apple = new Fruit("Apple", R.mipmap.ic_launcher);
        Fruit Banana = new Fruit("Banana", R.mipmap.ic_launcher);
        Fruit Orange = new Fruit("Orange", R.mipmap.ic_launcher);
        Fruit Watermelon = new Fruit("Watermelon", R.mipmap.ic_launcher);
        Fruit Pear = new Fruit("Pear", R.mipmap.ic_launcher);
        Fruit Grape = new Fruit("Grape", R.mipmap.ic_launcher);
        Fruit Pineapple = new Fruit("Pineapple", R.mipmap.ic_launcher);
        Fruit Strawberry = new Fruit("Strawberry", R.mipmap.ic_launcher);
        Fruit Cherry = new Fruit("Cherry", R.mipmap.ic_launcher);
        Fruit Mango = new Fruit("Mango", R.mipmap.ic_launcher);

        fruitList.add(apple);
        fruitList.add(Banana);
        fruitList.add(Cherry);
        fruitList.add(Grape);
        fruitList.add(Mango);
        fruitList.add(Orange);
        fruitList.add(Watermelon);
        fruitList.add(Pear);
        fruitList.add(Pineapple);
        fruitList.add(Strawberry);
    }

}
