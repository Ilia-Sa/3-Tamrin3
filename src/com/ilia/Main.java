//ilia Safarian - 40012341054047
package com.ilia;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");

        String string = input.nextLine();

        int stringLength = string.length();

        char[] ch = string.toCharArray();
        StringBuilder strbuild = new StringBuilder();
        for(char c : ch){
            if(Character.isDigit(c)){
                strbuild.append(c);
                throw new ArrayStoreException("The String contains a number.");
            }
        }
        System.out.print("The length of the string is: " + stringLength);
    }
}