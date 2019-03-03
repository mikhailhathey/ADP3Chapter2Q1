package com.cput.chapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Models implements TechEquipment{


    public Models() {

    }

    @Override
    public Set<String> SmartPhones()
    {
        Set  sPhone = new HashSet();

        sPhone.add("Apple iPhone XR");
        sPhone.add("Apple iPhone X");
        sPhone.add("Samsung S10");               //Smartphone Models
        sPhone.add("Huawei P20 Lite");
        sPhone.add("Huawei Mate 20 Pro");

        return sPhone;
    }

    @Override
    public Map<String, String> Cameras()
    {
        Map cam = new HashMap();
        cam.put("DSLR1", "Canon EOS 5D Mark IV");
        cam.put("DSLR2", "Canon EOS 7D Mark II");
        cam.put("DSLR3", "Nikon D5");                        //DSLR cameras
        cam.put("DSLR4", "Nikon D750");
        cam.put("DSLR5", "Sony Alpha A99 Mark II");

        return cam;

    }

    @Override
    public List<String> Wearables()
    {

        List wear = new ArrayList();
        wear.add("Apple Watch Series 3");
        wear.add("Apple Watch Series 4");
        wear.add("Fitbit Versa");                            //Wearable Devices
        wear.add("Samsung Galaxy Watch");
        wear.add("Huawei Watch 2");

        return wear;
    }
}
