package com.sebir.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class InstantiateAndNavigateCollections {


    public static void invokeCollections() {
        List<Integer> listCollection = new ArrayList() ;
        listCollection.add(1);
        listCollection.add(2);
        listCollection.add(3);
        List<Integer> newList = new ArrayList<>(listCollection);
        List<Integer> viewList = List.copyOf(listCollection);
        viewList.add(1000);
        Collections.unmodifiableList(listCollection);
        SortedSet<Integer> setCollection = new TreeSet<>(listCollection);

}
}