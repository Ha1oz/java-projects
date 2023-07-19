package com.haloz;

import com.haloz.lists.api.IntegerList;
import com.haloz.lists.impl.IntegerListImpl;

public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerListImpl(1,2,3,4,5,6,7,8);

        System.out.println("integerList.contains() = " + integerList.contains(0));
    }
}
