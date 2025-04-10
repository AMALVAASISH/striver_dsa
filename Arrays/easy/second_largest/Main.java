package Arrays.easy.second_largest;

// import java.util.Arrays;
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

// public class Main{

//     static void sorting(int[] arr, int num){
//         if(num == 1 || num == 0){
//             System.out.println("there is no array length");
//         }
//         int small = Integer.MAX_VALUE;
//         int second_small = Integer.MAX_VALUE;
//         int large = Integer.MIN_VALUE;
//         int second_large = Integer.MIN_VALUE;
//         for(int i = 0;i<num;i++){
//             small = Math.min(small, arr[i]);
//             large = Math.max(large,arr[i]);
//         }
//         for(int j = 0;j<num;j++){
//             if(arr[j] < second_small && arr[j]!= small){
//                 second_small = arr[j];
//             }

//             if(arr[j] > second_large && arr[j] != large){
//                 second_large = arr[j];
//             }
//         }

//         System.out.println(second_large);
//         System.out.println(second_small);
//     }
//     public static void main(String[] args){
//         int[] arr = {1,4,2,9,5};
//         int n = arr.length;

//         sorting(arr,n);
//     }
// }


// Time Complexity: O(N), We do two linear traversals in our array

// Space Complexity: O(1)



// optimal approach

public class Main{

    static int second_smallest(int arr[], int n){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        System.out.println(small);// value: 2147483647

        for(int i = 0;i<n;i++){
            if(arr[i]< small){
                second_small = small;
                small = arr[i];

            }else if(arr[i] < second_small && arr[i]!= small){
                second_small = arr[i];
            }
        }
        return second_small;
    }


    static int second_largest(int[] arr, int num){
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int i = 0;i<num;i++){
            if(arr[i]>large){
                second_large = large;
                large = arr[i];
            }else if(arr[i]> second_large && arr[i]!= large){
                second_large =arr[i];
            }
        }

        return second_large;
    }
    public static void main(String[] args){
        int[] arr = {1,4,2,8,6,0};
        int n = arr.length;

        int ss = second_smallest(arr,n);
        int ll = second_largest(arr, n);

        System.out.println("second small:"+ ss);
        System.out.println("second large:"+ ll);
    }
}


// Time Complexity: O(N), Single-pass solution

// Space Complexity: O(1)