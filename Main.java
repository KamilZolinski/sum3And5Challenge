package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for(int i=10;i<=90;i++){
            if(isDividable(i)){
                System.out.println(i + " is dividable by 3 and 5");
                counter++;
                sum += i;
                if(counter==5){
                    break;
                }
            }
        }
        System.out.println("sum = " + sum);

    }
    public static boolean isDividable(int n){
        if(n%3==0 && n%5==0){
            return true;
        }
        return false;
    }
}
