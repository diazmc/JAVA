public class FizzBuzz {
    public String fizzBuzz(int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }
        else if (number % 15 == 0){
            return "FizzBuzz";
        }
        else if (number % 2 == 0){
            return "2";
        }
        else {
            return "Undefined";
        }
        
    }
}