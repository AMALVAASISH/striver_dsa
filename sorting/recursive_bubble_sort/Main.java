package sorting.recursive_bubble_sort;

public class Main {

    static void recursive_bubble_sort(int[] arr, int num){
        if(num == 1) return;
        for(int i = 0;i<num-1;i++){
            for(int j = 0;j<num-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }
        }
        recursive_bubble_sort(arr, num-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,7};
        int n = arr.length;
        
        System.out.println("before recursive bubble sort");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        recursive_bubble_sort(arr,n);

        System.out.println();
        System.out.println("after recursive bubble sort");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}


// in java, all primitives are pass by value, so the value canot be changed outside the func
// the arrays, objects are pass by refernce, so their value can be changed by the func


// Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.

// Reason: If we carefully observe, we can notice that the recursion call, is occurring for n times, and for each recursion call, the loop j runs from 0 to n-2. For, the range of size n, the inner loop runs n-1 times, for the range of size n-1, the inner loop runs n-2 times, and so on. So, the total steps will be approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1. The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.

// Space Complexity: O(N) auxiliary stack space



// if (n == 1) return;

//         int didSwap = 0;
//         for (int j = 0; j <= n - 2; j++) {
//             if (arr[j] > arr[j + 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//                 didSwap = 1;
//             }
//         }

//         // if no swapping happens.
//         if (didSwap == 0) return;

//         //Range reduced after recursion:
//         bubble_sort(arr, n - 1);

// Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.

// Space Complexity: O(N) auxiliary stack space.

