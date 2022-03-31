package com.techreturners.cats;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        //arrange
        Cat domesticCat = new DomesticCat();
        //act and assert
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        //arrange
        Cat domesticCat = new DomesticCat();
        //further arrange
        domesticCat.isAsleep();
        //act
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakeUp() {
        //arrange
        Cat domesticCat = new DomesticCat();
        //further arrange
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        //act
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }

    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        assertEquals("Purrrrrrr", domesticCat.eat());
    }
}
