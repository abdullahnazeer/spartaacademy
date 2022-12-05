package com.sparta;

import DecoratorPatternLesson.*;
import Exceptions.Cat;
import Exceptions.DateParser;
import FizzBuzzTDD.FizzBuzz;
import NestedAndAnonymousClasses.MySorter;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        [BUBBLESORT & ARRAY MERGE]
//        int[] emptyArray = {};
//        int[] array = {23, 1, 7, 12, 8, 2, 10, 31};
//        int[] array2 = {10, 4, 26, 29, 100, 52, 111, 1, 17, 19};
//        BubbleSort bubbleSort = new BubbleSort();
//        System.out.println(Arrays.toString(bubbleSort.sortArray(array)));
//        System.out.println(Arrays.toString(bubbleSort.sortArray(array2)));
//        System.out.println(Arrays.toString(bubbleSort.mergeSortedArrays(array, array2)));

//        [DECORATOR PATTERN]
//        ThreeCheesePizzaWrongWay threeCheesePizza = new ThreeCheesePizzaWrongWay();
//        PepperoniThreeCheesePizzaWrongWay pepperoniThreeCheesePizza = new PepperoniThreeCheesePizzaWrongWay();
//        System.out.println(threeCheesePizza.prepare());
//        System.out.println(threeCheesePizza.getPizza());
//        System.out.println(pepperoniThreeCheesePizza.prepare());
//        System.out.println(pepperoniThreeCheesePizza.getPizza());
//        Pizza mushroomPepperoni = new MushroomDecorator(new PepperoniDecorator(new PlainPizza()));
//        System.out.println(mushroomPepperoni.prepare());
//        System.out.println(mushroomPepperoni.getPrice());

//        [EXCEPTIONS & LOGGING]
//        Cat myCat = new Cat();
//        System.out.println(myCat.meow("FUDGE"));
//        System.out.println(myCat.meow(null));
//        DateParser dateParser = new DateParser();
//        System.out.println(dateParser.convertToDate("29/11/2022"));


//        List<String> list = new ArrayList<>(List.of("John Doe", "James Mann", "Jonah Ess" ));
//
//        System.out.println(1);
//        MySorter theSorter = new MySorter();
//        theSorter.sort(list);

        FizzBuzz fizzBuzz = new FizzBuzz();

        
    }
}