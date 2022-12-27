package javaByComparison.fizzBuzz;

public class ConsoleBasedFizzBuzz implements FizzBuzz{
    @Override
    public void print(int from, int to) {
        for (int i = from; i < to+1; i++) {
            String result = "";
            if (i % 3 ==0){
                result += "Fizz";
            }
            if (i % 5 == 0){
                result += "Buzz";
            }
            if ("".equals(result)){
                System.out.println(i);
            }else {
                System.out.println(result);
            }

        }
    }
}
