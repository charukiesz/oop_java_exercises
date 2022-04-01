package com.techreturners.cats;

abstract class Feline implements Cat {

//properties
   private int AverageHeight;
   private boolean isAsleep = false;

//abstract methods
   public abstract String eat();

//generic methods to be inherited by all subclasses
   public int getAverageHeight(){return AverageHeight;}

   public boolean isAsleep(){
      return isAsleep;
   }

   public void goToSleep(){isAsleep = true;}

   public void wakeUp(){isAsleep = false;}

   public void run(){}






}
