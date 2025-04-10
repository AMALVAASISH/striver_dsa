package sorting.recursive_insertion_sort;

public class Main {

    static void recursive_insertion_sort(int[] arr,int num,int i){
        
        if(i == num) return;

        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursive_insertion_sort(arr, num, i+1);

    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,8,6,1,9};
        int n = arr.length;
    
        System.out.println("before recursive insertion sort");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }    

        recursive_insertion_sort(arr,n,0);

        System.out.println("after recursive insertion sort");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }    

    }
}


// Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.

// Reason: If we carefully observe, we can notice that the recursion call will occur for n times, and for each i, inside the recursive function, the loop j runs from i to 1 i.e. i times. For, i = 1, the loop runs 1 time, for i = 2, the loop runs 2 times, and so on. So, the total steps will be approximately the following: 1 + 2 + 3 +……+ (n-2) + (n-1). The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.

// Space Complexity: O(N) auxiliary stack space.

// Best Case Time Complexity: 

// The best case occurs if the given array is already sorted. And if the given array is already sorted, the recursion calls will only occur and inside the recursive function, the loop will run for 0 times(as each element is already present in its correct position). So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.