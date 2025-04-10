package sorting.bubble_sort;

public class Main {

    static void bubble_sort(int[] arr, int num){
        for(int i = num-1;i>=0;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("after bubble sort");
        for(int i = 0;i<num;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String[] args){
        int[] arr = {4,1,2,9,5};
        int n = arr.length;
        System.out.println("before bubble sort");

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        bubble_sort(arr,n);
    }
}


// here a range is taken, and the outer loop starts from behind and keeps on decreasing the range
// in the inner loop there is manual swapping of elements that are larger than the adjacent ones

// largest is made to go the last index in bubble sort

// Time complexity: O(N2), (where N = size of the array), for the worst,
//  and average cases.
// Reason: If we carefully observe, we can notice that the outer loop,
//  say i, is running from n-1 to 0 i.e. n times, and for each i, the inner
//   loop j runs from 0 to i-1. For, i = n-1, the inner loop runs n-1 times,
//    for i = n-2, the inner loop runs n-2 times, and so on. So, the total 
//    steps will be approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1. 
//    The summation is approximately the sum of the first n natural numbers
//     i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2).
//      Previously, we have learned that we can ignore the lower values as 
//      well as the constant coefficients. So, the time complexity is O(n2).
//       Here the value of n is N i.e. the size of the array.

// Space Complexity: O(1)

// Optimized approach (Reducing time complexity for the best case):

// The best case occurs if the given array is already sorted. We can reduce the time complexity to O(N) by just adding a small check inside the loops. 

// We will check in the first iteration if any swap is taking place. If the array is already sorted no swap will occur and we will break out from the loops. 
// Thus the iteration of the outer loop will be just 1. And our overall time complexity will be O(N).

// for (int i = n - 1; i >= 0; i--) {
//     int didSwap = 0;

//     for (int j = 0; j <= i - 1; j++) {
//         if (arr[j] > arr[j + 1]) {
//             int temp = arr[j];
//             arr[j] = arr[j + 1];
//             arr[j + 1] = temp;
//             didSwap = 1;
//         }
//     }
//     if (didSwap == 0) {
//         break;
//     }
// }


// Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.

// Space Complexity: O(1)