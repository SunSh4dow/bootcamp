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

    public static void main(String[] args) {

        boolean equal;
        String cutChar;
        Bootcamp StringObject = new Bootcamp();
        System.out.println("The word is: " + args[0]);
        equal = StringObject.taskA(args[0]);
        System.out.println(" Task A - Are first char equal? " + equal);
        cutChar = StringObject.taskB(args[0]);
        System.out.println(" Task B - Remove starting x: " + cutChar);

        /*String s1 = "String";
        String s2 = s1;
        s1 += "1";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);*/

        String s1 = "Hallo ".trim();
        String s2 = "Hallo";
        boolean isEqualWrong = s1 == s2;
        boolean isEqual = s1.equals(s2);
        boolean isEqualNS = Objects.equals(s1,s2);
        System.out.println(isEqualWrong +" "+ isEqual +" "+ isEqualNS);
    }
}
class Circle{
    int radius;
    int x;
    int y;

    boolean equals(Circle circle){
        if (circle.radius != this.radius) {
            return false;
        }
        if (circle.x != this.x) {
            return false;
        }
        if (circle.y != this.y) {
            return false;
        }
        return true;
    }
    public String toString(){

    }
}