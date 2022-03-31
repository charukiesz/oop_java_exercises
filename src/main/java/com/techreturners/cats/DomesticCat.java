package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    private String setting = "domestic";

    public boolean isAsleep(){return false;}

    @Override
    public boolean wakeUp() {return true;}

    @Override
    public boolean goToSleep(){return false;}

    public String getSetting(){ return setting;}
}
