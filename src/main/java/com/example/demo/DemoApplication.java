package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        getSumOfPrimes1();
        System.out.println("====================");
        getSumOfPrimes2();
    }

    public static void getSumOfPrimes1(){
        System.out.println("start to get the sum of primes below 20000");
        int range = 10;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i =2 ;i<=range;i++){
            if (isPrime1(i)){
                sum += i;

                if(i==2){
                    sb.append(i);
                }else{
                    sb.append("+"+i);
                }
            }
        }
        sb.append(")");
        System.out.println("The sum of all prime number below "+range +"="+sum+sb.toString());
    }

    private static boolean isPrime1(int number ){
        for(int i = 2;i < number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void getSumOfPrimes2(){
        System.out.println("***this function has reduced the looping count***");
        System.out.println("start to get the sum of primes below 20000");
        int range = 10;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i =2 ;i<=range;i++){
            if (isPrime1(i)){
                sum += i;

                if(i==2){
                    sb.append(i);
                }else{
                    sb.append("+"+i);
                }
            }
        }
        sb.append(")");
        System.out.println("The sum of all prime number below "+range +"="+sum+sb.toString());

    }

    private static boolean isPrime2(int number ){
        int sqrt = (int)Math.sqrt(number);
        for(int i = 2;i < sqrt;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
