package sorting.insertion_sort;

public class Main {

    static void insertion_sort(int[] arr, int num){
        for(int i = 0;i<num-1;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("after insertion sort");
        for(int i = 0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,7,1,9};
        int n = arr.length;

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        insertion_sort(arr,n);
    }
}


// Time complexity: O(N2), (where N = size of the array), for th
// e worst, and average cases.
// Reason: If we carefully observe, we can notice that
// the outer loop, say i, is running from 0 to n-1 i.e.
// n times, and for each i, the inner loop j runs from
// i to 1 i.e. i times. For, i = 1, the inner loop runs
// 1 time, for i = 2, the inner loop runs 2 times, and 
// so on. So, the total steps will be approximately the 
// following: 1 + 2 + 3 +......+ (n-2) + (n-1). 
// The summation is approximately the sum of the first 
// n natural numbers i.e. (n*(n+1))/2. The precise time
// complexity will be O(n2/2 + n/2). Previously, we 
// have learned that we can ignore the lower values
// as well as the constant coefficients. So, the
// time complexity is O(n2). Here the value of n
// is N i.e. the size of the array.

// in this the particular position is selected from the outer loop and 
// it is swapped backwards,...for  and while loop

// Space Complexity: O(1)

// Best Case Time Complexity: 

// The best case occurs if the given array is already sorted. And if the given array is already sorted, the outer loop will only run and the inner loop will run for 0 times. So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.