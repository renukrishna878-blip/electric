package org.example;
public class Main{
    public static double electric(int units){
        double bill;
        if(units<=0){
            throw new IllegalArgumentException("units cannot be negative");
        }
        else if(units<=100){
            bill=units*1.50;
        }
        else if(units<=200){
            bill=(100*1.50)+(units-100)*2.50;
        }
        else{
            bill=(100*1.50)+(200*2.50)+(units-200)*4.00;
        }
        return bill;
    }
    public static void main(String[] args){
        int units=150;
        System.out.println("final bill: "+electric(units));
    }
}