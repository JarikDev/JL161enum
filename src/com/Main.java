package com;


public class Main {
    class One{}
    enum Two{}
    public static void main(String[] args) {
        class Three{}
        //enum Four{} cannot be local
     //   Level.BEGINNER.setColor("Blue");
//        System.out.println(Level.BEGINNER.getColor());
//        System.out.println(Level.BEGINNER.toString());
    }
}
interface MyInterface{
    enum MyEnum{}
    class One{}
    enum Two{}
}
//enum Level {
//    BEGINNER("GREEN"){
//        public String getColor(){
//            return "color is "+color;
//        }
//    }, INTERMEDIATE("BLUE"), EXPERT("RED");
//    Level(String color){
//        this.setColor(color);
//
//    }
//    String color;
//
//    void setColor(String color) {
//        this.color = color;
//    }
//    public String getColor( ) {
//        return color;
//    }
//@Override
//    public String toString(){
//        return "Level = "+name();
//}
//}

//final class Level extends Enum{
//    public static   final Level BEGINNER;
//    public static   final Level EXPERT;
//
//    private static final Level $VALUES[];
//    static{
//        BEGINNER=new Level("BEGINNER",0);
//        EXPERT=new Level("EXPERT",0);
//        $VALUES=(new Level[]{
//                BEGINNER,EXPERT
//        });
//    }
//
//    public static Level[] values(){return ((Level[])$VALUES.clone());}
//    public static Level valueOf(String s){return (Level)Enum.valueOf(Level, s);}
//    private Level (String s,int i){super(s,i);}
//}


//abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable{
//    private final String name;
//    private final int ordinal;
//    protected Enum(String name,int ordinal){
//        this.name=name;
//        this.ordinal=ordinal;
//    }
//    public String toString(){
//        return name;
//    }
//    public final String name(){
//        return name;
//    }
//}

//class MyEnum<E extends Enum> extends Enum<MyEnum<Enum>>{
//    MyEnum(String s,int i){
//        super(s,i);
//    }
//}












