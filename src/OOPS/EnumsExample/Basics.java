package OOPS.EnumsExample;

public class Basics {
    enum Week {
        // these are enum constant
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday
        // public static and final
        // since it is final you cant create child enum
        // type is week
    }
    public static void main(String[] args) {
        // enums : - it is a group of variable it is just like constant immutable
        Week week ;
        week = Week.Monday;
        for(Week day : Week.values()){
            System.out.println(day);
        }
    }
}
