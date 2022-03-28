//This is a demo task from Ericsson.
// you can also use imports, for example:
// import java.util.*;
    import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        //Positive integer greater than 0
        int smallest = 1;

        //If statement for check for the length
        if(A.length == 0) return smallest;

        //Array sort to find the numbers
        Arrays.sort(A);

        //If statement for checking if is bigger than 0
        if(A[0] > 1){
            return smallest;
        }

        //Else if statement for checking if is smaller than 0
        if(A[A.length -1] <= 0){
           return smallest;
        }

        //For loop  to repeat the cycle
        for(int i = 0; i < A.length; i++){
            if (A[i] == smallest){
                smallest++;
            }
        }
        return smallest;
    }
}
