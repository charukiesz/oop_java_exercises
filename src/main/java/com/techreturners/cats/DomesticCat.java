package com.techreturners.cats;

public class DomesticCat extends Feline {

//constructor
public DomesticCat() {
    setting = "domestic";
    AverageHeight = 23;
}

// generic methods are inherited from superclass Feline

//overridden  methods are specific to DomesticCat
@Override
    public String eat(){return "Purrrrrrr";}


}
