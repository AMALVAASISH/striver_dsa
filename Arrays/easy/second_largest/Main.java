package Arrays.easy.second_largest;

import java.util.Arrays;
// brute force approach
// works if there are no duplicates


// public class Main {

//     static int sort(int[] arr){
//         int n = arr.length;
//         if(n == 0 || n==1){
//             System.out.println("-1");
//         }
//         Arrays.sort(arr);
//         int second_small = arr[1];
//         int secoond_large = arr[n-2];

//         System.out.println("second smallest:"+second_small);
//         System.out.println("second largest:"+secoond_large);
        
//         return 0;
//     }
//     public static void main(String[] args){
//         int[] arr = {4,2,5,1,9,7};

//         System.out.println(sort(arr));
//         System.out.println();
//     }
// }

// Time Complexity: O(NlogN), For sorting the array

// Space Complexity: O(1)



// better approach

public class Main{

    static void sorting(int[] arr, int num){
        if(num == 1 || num == 0){
            System.out.println("there is no array length");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i = 0;i<num;i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large,arr[i]);
        }
        for(int j = 0;j<num;j++){
            if(arr[j] < second_small && arr[j]!= small){
                second_small = arr[j];
            }

            if(arr[j] > second_large && arr[j] != large){
                second_large = arr[j];
            }
        }

        System.out.println(second_large);
        System.out.println(second_small);
    }
    public static void main(String[] args){
        int[] arr = {1,4,2,9,5};
        int n = arr.length;

        sorting(arr,n);
    }
}

