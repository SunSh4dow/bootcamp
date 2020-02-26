package de.walter.alexander.tasks;

import java.util.Objects;

public class Bootcamp {
    public static boolean taskA(String s) {
        if (s.charAt(0) == s.charAt(1)) {
            return true;
        }
        return false;
    }

    public static String taskB(String s) {
        char checkMe = 'x';
        if (s.charAt(0) == checkMe && s.charAt(1) == checkMe) {
            return s.substring(2);
        }
        return s;
    }

/*    public static void taskN(int m) {
        int n = 1;
        List<Integer> primes = new ArrayList<Integer>();
        for(i=3;i<=m/2;i++){
            if(n%i==0){
                break;
            }
        }
        System.out.print(primes);
    }*/

    public static int taskO(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return taskO(n - 1) + taskO(n - 2);
    }

    public static void main(String[] args) {

        boolean equal;
        String cutChar;
        Bootcamp StringObject = new Bootcamp();
        System.out.println("The word is: " + args[0]);
        equal = StringObject.taskA(args[0]);
        System.out.println(" Task A - Are first char equal? " + equal);
        cutChar = StringObject.taskB(args[0]);
        System.out.println(" Task B - Remove starting x: " + cutChar);
        //taskN(10000);
        int fibo = Bootcamp.taskO(10);
        System.out.println(Long.toString(fibo));

        String s1 = "Hallo ".trim();
        String s2 = "Hallo";
        boolean isEqualWrong = s1 == s2;
        boolean isEqual = s1.equals(s2);
        boolean isEqualNS = Objects.equals(s1, s2);
        System.out.println(isEqualWrong + " " + isEqual + " " + isEqualNS);
    }
}