package com.maghi711.lambdas;

import com.maghi711.lambdas.domain.Apple;

import java.util.Arrays;
import java.util.List;

public class AppleUtils {

    public static List<Apple> load() {
        List<Apple> apples = Arrays.asList(
                new Apple("Malgoba", 100, "Green"),
                new Apple("MalgobaGreenyRed", 150, "GreenyRed"),
                new Apple("MalgobaGreenyYellow", 170, "GreenyYellow"),
                new Apple("MalgobaGreenyOrange", 190, "GreenyOrange"),
                new Apple("MalgobaYellow", 200, "Yellow"),
                new Apple("MalgobaYellowGreen", 220, "YellowGreen"),
                new Apple("MalgobaYellowRed", 250, "YellowRed"),
                new Apple("MalgobaYellowOrange", 270, "YellowOrange"),
                new Apple("MalgobaRed", 300, "Red"),
                new Apple("MalgobaReddyGreen", 320, "ReddyGreen"),
                new Apple("MalgobaReddyYellow", 340, "ReddyYellow"),
                new Apple("MalgobaReddyOrange", 350, "ReddyOrange")
        );
        return apples;
    }
}
