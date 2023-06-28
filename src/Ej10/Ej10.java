package Ej10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Ej10 {
    public static void main(String[] args) {
        List<Double> listA = new ArrayList<>();
        List<Double> listB = new ArrayList<>();
        Random random = new Random();
        random.doubles(50).forEach(d -> listA.add(d*100));
        System.out.println("------ A -> DESORDENADOS ------");
        listA.forEach(System.out::println);
        System.out.println("------ A -> ORDENADOS ------");
        listA.sort(Double::compareTo);
        listA.forEach(System.out::println);
        System.out.println("------ A -> ORDENADOS INVERSO ------");
        Collections.reverse(listA);
        listA.forEach(System.out::println);
        listA.stream().limit(10).forEach(listB::add);
        Collections.nCopies(10, 0.5).forEach(listB::add);
        System.out.println("------ B ------");
        listB.forEach(System.out::println);

    }
}
