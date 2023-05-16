package com.akshet;

//https://leetcode.com/problems/happy-number/

import java.util.Scanner;

// Will Use the Same Concept as Fast and Slow pointer
public class HappyNumber {

    private static boolean isHappy(int num) {

        int slow = num;
        int fast=num;

        // Do it this way or use do while loop
        slow = square(slow);
        fast = square(square(fast));
        while(fast!=slow){
            slow = square(slow);
            fast = square(square(fast));
            if(slow==1)
                return true;
        }
        return false;
    }

    private static int square(int num){
        int sum=0;

        while(num !=0) {
            int rem = num%10;
            sum+=rem*rem;
            num=num/10;
        }
        System.out.print("sum: "+sum+"\n");
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean ans = isHappy(num);

        System.out.println(ans);

    }

}
