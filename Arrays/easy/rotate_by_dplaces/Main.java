package Arrays.easy.rotate_by_dplaces;

// using a temp array

// public class Main {

//     static void rotateToRight(int[] arr, int n, int k){
//         if(n == 0) return;
//         k = k%n;
//         if(k>n) return;

//         int[] temp = new int[k];
//         for(int i = n-k;i<n;i++){
//             temp[i-n+k] = arr[i];
//         }
//         for(int i = n-k-1;i>=0;i--){
//             arr[i+k] = arr[i];
//         }
//         for(int i =0;i<k;i++){
//             arr[i] = temp[i];
//         }
//     }
//     public static void main(String[] args){
//         int n = 7;
//         int[] arr = {1,2,3,4,5,6};
//         int k = 2;
//         System.out.println("before rotation");
//         for(int i = 0;i<n;i++){
//             System.out.print(i+ " ");
//         }
//         System.out.println();
//         rotateToRight(arr,n,k);
//         System.out.println("after rotation");
//         for(int i = 0;i<n;i++){
//             System.out.print(i+ " ");
//         }
//         System.out.println();
//     }
// }


// reversal algorithm

public class Main{

    static void Reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateByReversal(int[] arr,int n, int k){
        Reverse(arr,0,n-k-1);
        Reverse(arr,n-k,n-1);
        Reverse(arr,0,n-1);

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 2;
        System.out.println("before rotating");
        for(int i = 0;i<n;i++){
            System.out.print(i+" ");
        }
        rotateByReversal(arr,n,k);
        System.out.println("after rotating");
        for(int i = 0;i<n;i++){
            System.out.print(i+" ");
        }
    }
}


// https://takeuforward.org/data-structure/rotate-array-by-k-elements/