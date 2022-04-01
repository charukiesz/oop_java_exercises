package com.techreturners.cats;

public class LionCat extends Feline {

    //constructor
    public LionCat() {
        setting = "wild";
        AverageHeight = 1100;
    }

//generic methods are inherited from superclass Feline

//overridden methods specific to LionCat
    @Override
    public String eat(){return "Roar!!!!";}


}
