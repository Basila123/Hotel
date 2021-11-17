package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelBookTest {
    HotelBook hotel;
    @Before
    public void initializeClass(){
        hotel = new HotelBook();
    }
    @Test
    public void givenHotelNamesWhenAddedShouldReturnSize(){
        Assert.assertEquals(3,hotel.addHotel());
    }
}