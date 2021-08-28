/*
 * Creation : 13 Jul 2021
 */
package com.acn.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {
    public static void main(String args[]) {

        MathOpertion mo = (x, y) -> x + y;

        MathOpertion m = (x, y) -> x + y;

        System.out.println(m.add(9, 10));

        System.out.println("Added two no using custome interface: " + mo.add(4, 5));

        List<Integer> list = Arrays.asList(9, 1, 10, 3, 5, 6, 7);

        List<String> namelist = Arrays.asList("Ramesh", "Ram", "RameshYada", "Jak");

        Optional<String> biggestLength = namelist.stream().reduce((a, b) -> a.length() > b.length() ? a : b);
        System.out.println("Biggest String using reduce method:  " + biggestLength.orElse("List is Empty..s"));

        Optional<String> combinnedStr = namelist.stream().reduce((a, b) -> a + "@" + b);
        System.out.println("Combine String using reduce method:  " + combinnedStr.orElse("no String found.."));

        int sum = list.stream().reduce(0, (x, y) -> x + y);

        Optional<Integer> sum1 = list.stream().reduce((x, y) -> x + y);

        System.out.println("Sum of Integer using reduce and Optional: " + sum1.orElse(0));

        System.out.println("Sum of Integer " + sum);

        Optional<Integer> max = list.stream().reduce((x, y) -> x > y ? x : y);

        System.out.println("Max value from Array: " + max.isPresent());

        List<Student> stuList = Arrays.asList(new Student(1, "Ram"), new Student(2, "Radha"), new Student(3, "Shyam"), new Student(4, "Shyam"));

        List<String> stuNameList = stuList.stream().map(i -> i.getName()).collect(Collectors.toList());
        System.out.println("Extract Name list From Student Object: " + stuNameList);

        Map<Integer, String> map = stuList.stream().collect(Collectors.toMap(Student::getId, Student::getName));

        Map<Integer, String> map1 = stuList.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));

        List<Integer> idList = stuList.stream().collect(Collectors.toMap(Student::getId, Student::getName)).entrySet().stream().map(i -> i.getKey())
                .collect(Collectors.toList());

        System.out.println("Extract name list From Student Object: " + idList);

        Map<String, List<Student>> groupByName = stuList.stream().collect(Collectors.groupingBy(Student::getName, Collectors.toList()));
        System.out.println("group by Name From Student Object: " + groupByName);
        Function<Integer, Integer> fun = (x) -> x * x;
        Integer funValue = fun.apply(3);
        System.out.println("Exmple of Function Functional interafce:  " + funValue);

        Supplier<Integer> sup = () -> 7;
        System.out.println("Exmple of Supplier Functional interafce:  " + sup.get());

        Consumer<Integer> con = (x) -> System.out.println("Exmple of Consumer Functional interafce:  " + x);
        con.accept(9);

    }

}

@FunctionalInterface
interface MathOpertion {
    int add(int x, int y);
}

class Student {
    private int id;
    private String name ;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
