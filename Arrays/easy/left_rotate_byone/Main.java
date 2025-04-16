package Arrays.easy.left_rotate_byone;

// brute force approach

// public class Main {

//     static void rotate(int[] arr,int num){
//         int[] temp = new int[num];
//         for(int i = 1;i<num;i++){
//             temp[i-1] = arr[i];
//         }

//         temp[num-1] = arr[0];
//         for(int i = 0;i<num;i++){
//             System.out.print(temp[i]+ " ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int n = arr.length;
//         rotate(arr,n);
//     }
// }


// Complexity Analysis

// Time Complexity: O(n), as we iterate through the array only once.

// Space Complexity: O(n) as we are using another array of size, same as the given array.


// optimal approach

public class Main{

    static void rotate(int[] arr, int n){
        int k = arr[0];
        for(int i = 0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = k;
        System.out.println("after sorting");
        for(int j = 0;j<n;j++){
            System.out.print(arr[j]+ " ");
        }

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6};
        int n =arr.length;
        System.out.println("before sorting");
        for(int j = 0;j<n;j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
        rotate(arr,n);
    }
}



// Time Complexity: O(n), as we iterate through the array only once.

// Space Complexity: O(1) as no extra space is used