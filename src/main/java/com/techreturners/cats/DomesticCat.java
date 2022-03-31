package com.techreturners.cats;

public class DomesticCat extends AbstractCat {


    public boolean isAsleep(){return false;}

    @Override
    public boolean wakeUp() {return true;}

    @Override
    public boolean goToSleep(){return false;}
}
