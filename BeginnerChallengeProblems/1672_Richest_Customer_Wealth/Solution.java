public class Solution {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sumOfCustomerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sumOfCustomerWealth += accounts[i][j];
            }
            
            System.out.println("Customer " + i + "'s Wealth: " + sumOfCustomerWealth);
            maxWealth = sumOfCustomerWealth > maxWealth ? sumOfCustomerWealth : maxWealth;
        }

        System.out.println("Wealth of Richest Customer: " + maxWealth);
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        maximumWealth(accounts);
    }
}
