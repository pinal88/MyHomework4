package myhomeworkpackage4;

public class MethodOverloading {
    static int mymethod(int a,int b){
      return a+b;}
      static double mymethod(double x,double y){
          return x-y;
        }

    public static void main(String[] args) {
        int i = mymethod(20,50);
        double m =mymethod(20.30,50.60);
        //System.out.println(mymethod(20,50));
       // System.out.println(mymethod(20.30,50.60));
        System.out.println(i);
        System.out.println(m);
    }
    }

