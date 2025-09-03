import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        int myNumber = 10;
        long myNumberLong = 1234567890;
        float myDecimal = 19.99f;
        double myDouble = 1.523;
        char grade = 'A';
        boolean isTrue = true;
        String name = "John";
        int[] numbers = {1, 2, 3, 4};

        System.out.println("myNumber : " + myNumber);
        System.out.println("myNumberLong : " + myNumberLong);
        System.out.println("myDecimal : " + myDecimal);
        System.out.println("myDouble : " + myDouble);
        System.out.println("grade: " + grade);
        System.out.println("isTrue: " + isTrue);
        System.out.println("Name: "+ name);
        System.out.println("Arr Num: "+Arrays.toString(numbers));
    }
}