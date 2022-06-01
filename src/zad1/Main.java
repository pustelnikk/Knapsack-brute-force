package zad1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int weights[] = {3, 1, 6, 10, 1, 4, 9, 1, 7, 2, 6, 1, 6, 2, 2, 4, 8, 1, 7, 3, 6, 2, 9, 5, 3, 3, 4, 7, 3, 5, 30, 50};
        int values[] = {7, 4, 9, 18, 9, 15, 4, 2, 6, 13, 18, 12, 12, 16, 19, 19, 10, 16, 14, 3, 14, 4, 15, 7, 5, 10, 10, 13, 19, 9, 8, 5};

        int size = 32;
        int W_max = 75;
        System.out.println(32>>5);
        int currentVal = 0;

        int[] currentVector = new int[32];
        int[] tempVector = new int[32];
        Arrays.fill(currentVector, 0);
        Arrays.fill(tempVector, 0);
        System.out.println(Math.pow(2,32));

        for (long i = 0l; i < Math.pow(2,size); ++i){

            if (i % 1000000 == 0){
                System.out.println(i);
            }
            int tempVal = 0;
            int tempWeight = 0;

            Arrays.fill(tempVector, 0);

            for(int j = 0; j < size; ++j){
                if (((i >> j) & 1) == 1){
                    tempVal += values[j];
                    tempWeight += weights[j];
                    tempVector[j] = 1;
                }
            }

            if (tempWeight > W_max){
                continue;
            }
            if(tempVal > currentVal){
                currentVal = tempVal;
                currentVector = Arrays.copyOfRange(tempVector,0,32);
            }

        }



        System.out.println(currentVal);
        System.out.println(Arrays.toString(currentVector));


    }
}
