package Arrays.easy.remove_duplicates_from_sorted;

import java.util.HashSet;

/// brute force
/// take a data structure that doesnt store duplicate elements,
/// hashset only stores unique elements


// public class Main {

//     static int removeDuplicates(int[] arr, int n){
//         HashSet <Integer> set = new HashSet<>();
//         for(int i = 0;i<n;i++){
//             set.add(arr[i]);
//         }
//         int k = set.size();
//         int j = 0;
//         for(int x: set){
//             arr[j++] = x;
//         }
//         return k;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,2,3,3,3};
//         int n = arr.length;
//         int k  = removeDuplicates(arr,n);
//         System.out.println(k);
//         System.out.println("The array after removing duplicate elements is ");
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
    
//     }
// }   

// Complexity Analysis

// Time complexity: O(n*log(n))+O(n)

// worst case is O(n*log(n))
// average case is o(n)
// these are from chatgpt


// Space Complexity: O(n) 


// optimal approach

public class Main{

    static int removeDuplicates(int[] arr,int n){
        
        int i = 0;
        for(int j = 1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        int n = arr.length;
        int k = removeDuplicates(arr,n);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



// Complexity Analysis

// Time Complexity: O(N)

// Space Complexity: O(1)