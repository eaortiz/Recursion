package com.company;

import com.sun.deploy.util.StringUtils;

public class Main {

    public static void main(String[] args) {
        //more test cases would be good
        System.out.println(isEvenWord("tattletale"));
        System.out.println(isEvenWord("arraigning"));
        System.out.println(isEvenWord("banana"));

    }

    private static boolean isEvenWord(String s) // s could be a better variable name
    {
        if (s.length() == 0)
            return true;

        String search = String.valueOf(s.charAt(0)); // again search could be named better
        s = s.substring(1);

        if(s.contains(search)) {
            s = s.replace(search, "");
            return isEvenWord(s);

        }

        return false;

    }

    //clean and concise, I like it!
}
