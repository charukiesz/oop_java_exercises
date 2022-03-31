package com.techreturners.cats;

public class CheetahCat extends AbstractCat {

    private String setting = "wild";

    @Override
    public boolean isAsleep(){return false;}
    @Override
    public boolean goToSleep(){return false;}

    @Override
    public boolean wakeUp(){return true;}
    @Override
    public String eat(){return "Zzzzzzz";}

    @Override
    public int getAverageHeight(){return 0;}

    @Override
    public String getSetting(){return setting;}


}
