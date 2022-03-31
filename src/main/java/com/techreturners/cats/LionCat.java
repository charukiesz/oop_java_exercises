package com.techreturners.cats;

public class LionCat extends AbstractCat{


private String setting = "wild";

    @Override
    public boolean isAsleep(){return false;}

    @Override
    public boolean goToSleep(){return false;}

    @Override
    public boolean wakeUp(){return true;}
    @Override
    public int getAverageHeight(){return 1100;}

    @Override
    public String getSetting(){return setting;}
    @Override
    public String eat(){return "Roar!!!!";}


}
