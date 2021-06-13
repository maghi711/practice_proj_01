package com.maghi711.collections.stream.p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringAndSlicingWithStream {
    public static void main(String[] args) {
        List<String> dishes = Arrays.asList("Aadavan", "Swetha", "Mahesh");
        filtering(dishes);
        slicingWithLimit(dishes);
        slicingWithSkip(dishes);
    }

    public static void filtering(List<String> dishes) {
        System.out.println("FILTERING");
        List<String> collect = dishes.stream().filter(a -> a.length() > 6).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void slicingWithLimit(List<String> dishes) {
        System.out.println("SLICKING WITH LIMIT");
        Stream<String> limit = dishes.stream().limit(2);
        limit.forEach(System.out::println);
    }

    public static void slicingWithSkip(List<String> dishes) {
        System.out.println("SLICKING WITH SKIP");
        Stream<String> limit = dishes.stream().skip(2);
        limit.forEach(System.out::println);
    }

}
