package sorting.selection_sort;

public class Main {

    static void selction_sort(int[] arr, int num){
        for(int i =0;i<num-1;i++){
            int mini = i;
            for(int j = i+1;j<num;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        System.out.println("after selection sort");
        for(int i = 0;i<num;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[]  args){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("before selection sort");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selction_sort(arr,n);
    }
}

// in selection sort, a range is selected 
// the first element is checked against the elements in the range and exchanged
// with the smallest element
// and this range goes on decreasing as the first element after checking is left out of the range


// smallest element is made to come to the first index in selection sort



// Time complexity: O(N2), (where N = size of the array), for the best,
// worst, and average cases.
// Reason: If we carefully observe, we can notice that the outer loop,
// say i, is running from 0 to n-2 i.e. n-1 times, and for each i, the inner
// loop j runs from i to n-1. For, i = 0, the inner loop runs n-1 times, for
// i = 1, the inner loop runs n-2 times, and so on. So, the total steps will be 
//approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1.
// The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. 
//The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can 
//ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). 
// Here the value of n is N i.e. the size of the array.

// Space Complexity: O(1)