package com.java.practised;

import java.sql.SQLOutput;

public class PokerV1 {
    public static void main(String[] args) {
        /* 不重複的撲克洗牌 */
        int[] poker = new int[52];
        //for (int i = 0; i < poker.length; i++) System.out.printf("poker[%d] = %d\n", i, poker[i]);

        for (int i = 0; i < poker.length; i++) {
            int rand = (int) (Math.random() * 52); // 0 - 51

            //檢查機制
            boolean isRepeat = false;
            for (int j=0; j<i; j++) {
                if (rand == poker[j]) {
                    isRepeat = true;
                    break;
                }
            }

            if (!isRepeat){
                poker[i] = rand;
            }else{
                i--;
            }
           // poker[i] = rand;

        }
        for (int i = 0; i < poker.length; i++) System.out.printf("poker[%d] = %d\n", i, poker[i]);

    }
}