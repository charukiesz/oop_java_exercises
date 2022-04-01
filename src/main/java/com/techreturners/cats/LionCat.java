package com.techreturners.cats;

public class LionCat extends Feline {


private String setting = "wild";
private int AverageHeight = 1100;


    @Override
    public int getAverageHeight(){return AverageHeight;}

    @Override
    public String getSetting(){return setting;}
    @Override
    public String eat(){return "Roar!!!!";}


}
