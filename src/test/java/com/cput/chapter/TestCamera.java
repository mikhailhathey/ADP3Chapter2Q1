package com.cput.chapter;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCamera {

    @Test
    public void cameras() {
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
    public void testMapData() throws Exception
    {
        TechEquipment cam = new Models();

        Assert.assertEquals("Canon EOS 5D Mark IV", cam.Cameras().get("DSLR1"));
    }

    @Test
    public void testMapSize() throws Exception
    {
        TechEquipment cam2 = new Models();

        Assert.assertEquals(5, cam2.Cameras().size());
    }

    @Test
    public void testMapRemove() throws Exception
    {
        TechEquipment cam3 = new Models();

        Assert.assertEquals("Nikon D5", cam3.Cameras().remove("DSLR3"));
    }
}