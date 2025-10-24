package com.projects.f1leagueback.controller;

public class Test {

    private String name = "Victor" ;

    public void reverseName(){
        char[] nameArray = name.toCharArray();
        char[] reverseNameArray = new char[nameArray.length];
        for (int i = nameArray.length - 1; i >= 0; i--) {
            reverseNameArray[i] = nameArray[nameArray.length - 1 - i];
        }
        System.out.println(reverseNameArray);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.reverseName();
    }
}
