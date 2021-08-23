package com.javatutorial;

import com.javatutorial.Task;

class task1{

    public static void main(String[] args) {

        String name = "Package is declared by the user";
        Task obj = new Task();
        obj.packagesAndMethod(name);

        int a = 143;
        System.out.println(a);
        myMethod(); // User define method and this method is calling
    }
    public static void myMethod(){
        System.out.println("method is called");
    }
}
