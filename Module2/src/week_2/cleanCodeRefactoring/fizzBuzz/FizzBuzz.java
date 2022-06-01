package week_2.cleanCodeRefactoring.fizzBuzz;

public class FizzBuzz {
   public static String fizzBuzz(int number){
       boolean isFiz = number % 3 ==0;
       boolean isBuzz = number % 5 == 0;
       if( isFiz && isBuzz)
           return "FizzBuzz";
       if(isFiz)
           return "Fizz";
       if(isBuzz)
           return "Buzz";
       return number + "";
   }
}
