package LeetCode_Problems;

public class Richest_Customer_Wealth {
        public int maximumWealth(int[][] accounts){
            int maxWealthSoFar = 0;
    
            for(int[] customer : accounts){
                int currentCustomerWealth = 0;
    
                for(int bank : customer){
                    currentCustomerWealth += bank;
                }
                maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
            }
            return maxWealthSoFar;
        }
        // Time Complexity = O(n * m)
        // Space Complexity = O(1)
}