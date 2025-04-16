package Arrays.easy.move_zeros;

//brute force approach

import java.util.*;

// public class Main {
//     public static int[] moveZeros(int n, int []a) {
//         //temporary array:
//         ArrayList<Integer> temp = new ArrayList<>();
//         //copy non-zero elements
//         //from original -> temp array:
//         for (int i = 0; i < n; i++) {
//             if (a[i] != 0)
//                 temp.add(a[i]);
//         }

//         // number of non-zero elements.
//         int nz = temp.size();

//         //copy elements from temp
//         //fill first nz fields of
//         //original array:
//         for (int i = 0; i < nz; i++) {
//             a[i] = temp.get(i);
//         }

//         //fill rest of the cells with 0:
//         for (int i = nz; i < n; i++) {
//             a[i] = 0;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//         int n = 10;
//         int[] ans = moveZeros(n, arr);
//         for (int i = 0; i < n; i++) {
//             System.out.print(ans[i] + " ");
//         }
//         System.out.println("");
//     }
// }


// Time Complexity: O(N) + O(X) + O(N-X) ~ O(2*N), where N = total no. of elements,
// X = no. of non-zero elements, and N-X = total no. of zeros.
// Reason: O(N) for copying non-zero elements from the original to the temporary array. O(X) for again copying it back from the temporary to the original array. O(N-X) for filling zeros in the original array. So, the total time complexity will be O(2*N).

// Space Complexity: O(N), as we are using a temporary array to solve this problem and the maximum size of the array can be N in the worst case.
// Reason: The temporary array stores the non-zero elements. In the worst case, all the given array elements will be non-zero.

// optimal approach - using 2 pointers

public class Main{

    static int[] moveZeroes(int n, int[] arr){
        int j = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return arr;

        for(int i = j+1;i<n;i++){
            if(arr[i]!= 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeroes(n,arr);
        for(int i = 0;i<n;i++){
            System.out.println(ans[i]+" ");
        }
    }
}


// Time Complexity: O(N), N = size of the array.
// Reason: We have used 2 loops and using those loops, we are basically traversing the array once.

// Space Complexity: O(1) as we are not using any extra space to solve this problem.
