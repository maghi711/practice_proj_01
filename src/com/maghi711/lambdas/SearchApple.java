package com.maghi711.lambdas;

import com.maghi711.lambdas.domain.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SearchApple {
    public static void main(String[] args) {
        System.out.println("Searching in available Apples");
        List<Apple> loadedApples = AppleUtils.load();
        Predicate<Apple> greenColor = apple -> {
            return testGreenApple(apple);
        };
        System.out.println(filterApples(loadedApples, greenColor));
        prettyPrintApple(loadedApples, a -> a.getWeight() + "");
        prettyPrintApple(loadedApples, Apple::getName);
        prettyPrintApple(loadedApples, Apple::getColorWeight);
    }

    private static void prettyPrintApple(List<Apple> apples, Function<Apple, String> supplier) {
        System.out.println("Pretty printing apples");
        for (Apple apple: apples) {
            System.out.println(supplier.apply(apple));
        }
    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple: apples) {
            if(predicate.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    private static boolean testGreenApple(Apple apple) {
        return apple.getColor().startsWith("Green");
    }
}
