package com.java.practised;

public class PokerV3 {
    /* 不重複的撲克洗牌 */
    public static void main(String[] args){
        int[] poker = new int[52];
        for (int i=0; i<poker.length; i++) poker[i]=i;

        for (int i = poker.length-1; i>0; i--){
            int rand = (int)(Math.random()*(i+1));
            int temp = poker[rand];
            poker[rand] = poker[i];
            poker[i] = temp;
        }
        for (int i = 0; i < poker.length; i++) System.out.printf("poker[%d] = %d\n", i, poker[i]);
    }
}
