package myhomeworkpackage4;

public class StaticNonstatic {
    static void Mymethod1(){
        System.out.println("My First Static Method");}
    void myMethod2(){
        System.out.println("My First non static method");
    }

    public static void main(String[] args) {
        Mymethod1();
        StaticNonstatic obj = new StaticNonstatic();
        obj.myMethod2();
    }
    }

