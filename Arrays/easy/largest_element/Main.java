package Arrays.easy.largest_element;

import java.util.Arrays;

// brute force method
// public class Main{
 
//   public static void main(String args[]) {
//     int arr1[] =  {2,5,1,3,0};
//     System.out.println("The Largest element in the array is: " + sort(arr1));
   
//     int arr2[] =  {8,10,5,7,9};
//     System.out.println("The Largest element in the array is: " + sort(arr2));
//   }

//   static int sort_asc(int[] arr1){
//     Arrays.sort(arr1);
//     return arr1[arr1.length-1];
//   }

//   static int sort(int arr[]) {
//     Arrays.sort(arr);
//     return arr[arr.length - 1];
//   }
// }



// Time Complexity: O(N*log(N))

// quick sort is used under the hood, thats why it gives the same 
// time complexity of quick sort

// Space Complexity: O(n)

// these time and space can be understood after learning  the sorting techniques 

// recursive appraoch

public class Main{


  static int sort(int[] arr){
    int max = arr[0];
    for(int i =1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
        }
    }    
    return max;
  }
  public static void main(String[] args){
    int[] arr = {2,5,1,3,0};
    System.out.println(sort(arr));
  }
}

// Time Complexity: O(N)

// Space Complexity: O(1)