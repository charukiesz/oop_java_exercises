package com.techreturners.cats;

public class DomesticCat extends Feline {

    private String setting = "domestic";


    @Override
    public String getSetting(){ return setting;}
    @Override
    public int getAverageHeight(){return 23;}

    @Override
    public String eat(){return "Purrrrrrr";}


}
