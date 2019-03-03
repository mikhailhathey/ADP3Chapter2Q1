package com.cput.chapter;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestWearable {

    @Test
    public void wearables() {
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
    public void testListData() throws Exception
    {
        TechEquipment wear = new Models();

        Assert.assertTrue(wear.Wearables().contains("Huawei Watch 2"));
    }

    @Test
    public void testListSize() throws Exception
    {
        TechEquipment wear2 = new Models();

        Assert.assertEquals(5, wear2.Wearables().size());
    }

    @Test
    public void RemoveListObject() throws Exception
    {
        TechEquipment wear3 = new Models();

        Assert.assertTrue(wear3.Wearables().remove("Apple Watch Series 3"));
    }
}