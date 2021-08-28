package com.acn.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<String>();
        List<String> list3 = new Vector<String>();
        List<String> list4 = new Stack<String>();
        CopyOnWriteArrayList<String> cList = new CopyOnWriteArrayList<>();

        list.add("RAmesh");
        list.add("AAmesh");
        list.add("ZAmesh");
        list.add("BAmesh");
        list.add("CAmesh");
        list.add(0, "Hello");
        System.out.println("Size of list" + list.size());
        Emp[] empArray = { new Emp("ram", 1), new Emp("aam", 2) };
        List<Emp> emplist = Arrays.asList(empArray);
        // Collections.sort(emplist);

        // Sorting using Natural sort of Comparable Interface
        Collections.sort(list);

        // Collections.reverse(list);
        System.out.println("***************Printing list value using After SOrting****************");
        list.stream().forEach(i -> System.out.println(i));

        // Convert List to array
        // String srray[]=list.toArray(new String[list.size()]);

        // Convert array to List
        // String [] sArr= {"AB","BC","CD","AA","BB","CC"};
        // list=Arrays.asList(sArr);
        // list.add("HYt");//Unsuported Operation

        System.out.println("***************Printing list value using Iterator Interface****************");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Value at Index:" + it.next());
        }

        // Iterator to traverse Set and List collections whereas ListIterator can be
        // used with Lists only.
        System.out.println("***************Printing list value using ListIterator Interface in Frw Direction****************");
        ListIterator<String> lIt = list.listIterator();
        while (lIt.hasNext()) {
            System.out.println("Value at index: " + lIt.nextIndex() + " " + lIt.next());

        }

        System.out.println("***************Printing list value using ListIterator Interface in Backward Direction****************");
        // ListIterator<String> lIt1 = list.listIterator();
        while (lIt.hasPrevious()) {
            System.out.println("Value at index: " + lIt.previousIndex() + " " + lIt.previous());

        }

        /***************************************************************************************************/
        // List<String> list1 = new ArrayList<>();
        List<String> list1 = new CopyOnWriteArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        // get the iterator
        Iterator<String> it2 = list1.iterator();

        // manipulate list while iterating
        while (it2.hasNext()) {
            System.out.println("list is:" + list1);
            String str = it2.next();
            System.out.println(str);
            if (str.equals("2"))
                list1.remove("5");
            if (str.equals("3"))
                list1.add("3 found");
            // below code don't throw ConcurrentModificationException
            // because it doesn't change modCount variable of list
            if (str.equals("4"))
                list1.set(1, "4");
        }

        System.out.println("********************Duplicate value in list and No of Occurence**********************");
        List<Integer> lis = new ArrayList<>();
        lis = Arrays.asList(1, 1, 4, 5, 7, 7, 8, 4, 1);
        List<Integer> lessThanFiveList = lis.stream().filter(i -> i < 5).collect(Collectors.toList());
        System.out.println("Example of filter()  " + lessThanFiveList);
        List<Integer> distnictList = lis.stream().distinct().collect(Collectors.toList());
        System.out.println("Example of Distnict value from array  " + distnictList);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer li : lis) {
            Integer count = map.get(li);
            if (count == null) {
                map.put(li, 1);
            } else {
                map.put(li, ++count);
            }
        }

        map.entrySet().stream().forEach(i -> System.out.println(i.getKey() + ":" + i.getValue()));

        System.out.println("**********example of Map() and Flatmap()***********");

        List<Integer> mapList = new ArrayList<>();
        mapList = Arrays.asList(1, 1, 4, 5, 7, 7, 8, 4, 1);

        List<Integer> mapList1 = new ArrayList<>();
        mapList1 = Arrays.asList(10, 5, 90);

        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(mapList);
        listOfList.add(mapList1);

        List<Integer> squareList = mapList.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println("Example of map()  " + squareList);
        List<Integer> finalList = listOfList.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        System.out.println("Example of flatMap()  " + finalList);

    }

}

class Emp {
    private String name;
    private int id;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emp other = (Emp) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
