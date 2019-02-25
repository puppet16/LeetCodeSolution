package com.ltt.javademo;

import java.util.Arrays;

/*************************************************************************************
 * Module Name:
 * Description: 121. 买卖股票的最佳时机
 * Author: 李桐桐
 * Date:   2019/2/25
 *************************************************************************************/
public class maxProfitDemo {

    public static void main(String args[]) {
        int[] prices = new int[]{7, 2, 4, 3, 5,1};
        System.out.println(Arrays.toString(prices));
        System.out.print("result:" + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > result) {
                    result = prices[j] - prices[i];
                }
            }
        }
        return result;
    }

    public static int maxProfit1(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

}
