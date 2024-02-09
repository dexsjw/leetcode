public class Solution {
    public static int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : --num;
            count++;
            System.out.println("CurrNum: " + num);
        }

        /* Model Solution - Bitwise Approach */
        // while (num > 0) {
        //     num = (num & 1) == 0 
        //         ? num >>= 1     // equivalent of num = num >> 1 
        //         : --num;
        //     count++;
        //     System.out.println("CurrNum: " + num);
        // }

        System.out.println("Step(s): " + count);
        return count;

    }

    public static void main(String[] args) {
        numberOfSteps(14);
    }
}
