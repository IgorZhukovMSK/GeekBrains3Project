package Lesson1.Task1;

public class Main {

    public static void main (String [] args){

        ClassGeneric<Integer> num = new ClassGeneric<>(1, 2, 3, 4);
        ClassGeneric <String> str = new ClassGeneric<>("Hello World");



       num.showValue();
       str.showValue();


    }

}
