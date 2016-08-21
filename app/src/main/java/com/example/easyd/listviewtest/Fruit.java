package com.example.easyd.listviewtest;

/**
 * Created by Easy.D on 16/8/21.
 */
public class Fruit {

    private String name;
    private int imageId;

    public Fruit (String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }


}
