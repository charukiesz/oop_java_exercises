package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    private String setting = "domestic";

    public boolean isAsleep(){return false;}

    @Override
    public boolean wakeUp() {return true;}

    @Override
    public boolean goToSleep(){return false;}
    @Override
    public String getSetting(){ return setting;}
    @Override
    public int getAverageHeight(){return 23;}

    @Override
    public String eat(){return "";}
}
