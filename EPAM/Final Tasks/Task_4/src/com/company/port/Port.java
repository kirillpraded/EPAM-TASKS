package com.company.port;

import java.util.ArrayList;
import java.util.List;

public class Port {
    public static int capacityPort = 100;
    public static int docks = 5;

    private List<Integer> piers = new ArrayList<Integer>();
    private List<Integer> list = new ArrayList<Integer>();

    {
        list.add(Integer.valueOf(0));
        piers.add(Integer.valueOf(0));
    }
}
