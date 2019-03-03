package com.cput.chapter;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSmartPhone {

    @Test
    public void smartPhones() {
    }

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testSetData() throws Exception{
        TechEquipment sPhone = new Models();

        Assert.assertTrue(sPhone.SmartPhones().contains("Apple iPhone XR"));
    }

    @Test
    public void testSetSize() throws Exception
    {
        TechEquipment sPhone2 = new Models();

        Assert.assertEquals(5, sPhone2.SmartPhones().size());
    }

    @Test
    public void RemoveSetObject() throws Exception
    {
        TechEquipment sPhone3 = new Models();

        Assert.assertTrue(sPhone3.SmartPhones().remove("Apple iPhone X"));
    }

}