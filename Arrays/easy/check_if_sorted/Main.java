package Arrays.easy.check_if_sorted;

// check if in ascending/increasing order

// brute force approach


// class Main {
//     static boolean isSorted(int arr[], int n) {
//       for (int i = 0; i < n; i++) {
//         for (int j = i + 1; j < n; j++) {
//           if (arr[j] < arr[i])
//             return false;
//         }
//       }
  
//       return true;
//     }
  
//     public static void main(String args[]) {
//       int arr[] = {1, 2, 3, 4, 5}, n = 5;
  
//       System.out.println(isSorted(arr, n));
//     }
// }
  
//   

// Time Complexity: O(N^2)

// Space Complexity: O(1)


// optimal approach (i went to this in the first try :) )

// public class Main {

//     static boolean check_if_sorted(int[] arr,int n){
//         for(int i =0;i<n-1;i++){
//             if(!(arr[i]<arr[i+1])){
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,2,1};
//         int n = arr.length;

//         boolean result = check_if_sorted(arr,n);
//         System.out.println(result);
//     }
// }


// Complexity Analysis

// Time Complexity: O(N)

// Space Complexity: O(1)