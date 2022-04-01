package com.techreturners.cats;

abstract class Feline implements Cat {

//attributes

   protected boolean asleep = false;
   protected String setting = "";
   protected int AverageHeight = 0;

//abstract methods
   public abstract String eat();

//generic methods to be inherited by all subclasses
   public int getAverageHeight(){return AverageHeight;}

   public String getSetting(){return setting;}

   public boolean isAsleep(){
      return asleep;
   }

   public void goToSleep(){asleep = true;}

   public void wakeUp(){asleep = false;}

   public void run(){}






}
