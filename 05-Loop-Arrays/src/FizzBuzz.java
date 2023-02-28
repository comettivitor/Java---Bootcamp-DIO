import java.util.Scanner;

public class FizzBuzz {
    Scanner num = new Scanner(System.in);

    static void fizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(num % 3 == 0){
            System.out.println("Fizz");
        }else if(num % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }

}
