import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<String> fizzBuzz(int n) {
        // String[] answer = new String[n];
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            // String element = "";
            
            if (i % 3 == 0 && i % 5 == 0) {
                // element = "FizzBuzz";
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                // element = "Fizz";
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                // element = "Buzz";
                answer.add("Buzz");
            } else {
                // element = Integer.toString(i);
                answer.add(String.valueOf(i));
            }

            // answer[i - 1] = element;
        }

        for (String s : answer) {
            System.out.println(s);
        }

        // return Arrays.asList(answer);
        return answer;

        /* Model Solution */
        // List<String> answer = new ArrayList<>(n);

        // for (int i = 1; i <= n; i++) {
        //     boolean divisbleBy3 = i % 3 == 0;
        //     boolean divisbleBy5 = i % 5 == 0;

        //     String currStr = "";

        //     if (divisbleBy3) {
        //         currStr += "Fizz";
        //     }

        //     if (divisbleBy5) {
        //         currStr += "Buzz";
        //     }

        //     if (currStr.isEmpty()) {
        //         currStr += String.valueOf(i);
        //     }

        //     answer.add(currStr);
        // }

        // return answer;

    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
