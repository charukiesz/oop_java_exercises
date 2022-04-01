package com.techreturners.cats;

public class CheetahCat extends Feline {

    //constructor
    public CheetahCat() {
        setting = "wild";
        AverageHeight = 94;
    }

//generic methods are inherited from superclass Feline


//overridden methods specific to CheetahCat
    @Override
    public String eat(){return "Zzzzzzz";}


}
