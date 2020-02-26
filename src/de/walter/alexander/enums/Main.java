package de.walter.alexander.enums;

public class Main {
    public static void main(String[] args) {
        final Seasons[] values = Seasons.values();
        for (Seasons value : values) {
            System.out.println(value.name());
        }
    }
    public static boolean isSummer(Enum e){
        if (e.equals(Seasons.Summer)){
            return true;
        }
        return false;
    }
}
