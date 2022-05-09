package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tutorial {

    public void acceptInput()
    {
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, name + " you are  here");
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("please, enter your age"));
//        JOptionPane.showMessageDialog(null, "you are " + age);

        //WRAPPER CLASSES
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "nadea";

        //ARRAY LISTS
        ArrayList<String> food = new ArrayList<String>();
        food.add("candy");
        food.add("ice-cream");

        food.set(0, "donut");
        food.remove(1);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
        }

        //2D ARRAYLIST
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatos");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

//        System.out.println(groceryList.get(0).get(2));

        //FOREACH

        String[] todos = {"clean", "feed the dog", "walk the dog"};

        for (String todo: todos) {
            System.out.println(todo);
        }

        System.out.println(add(3, 9, 14));
    }

    //OVERLOADED METHODS
    static int add(int a, int b)
    {
        return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }
}
