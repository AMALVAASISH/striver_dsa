package Arrays.easy.union;


import java.util.*;

class Main{
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        HashMap <Integer,Integer > freq = new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            
        for (int i = 0; i < m; i++)
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        for (int it: freq.keySet())
            Union.add(it);
        return Union;
}

    public static void main(String args[]) {
    int n = 10, m = 7;
    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
    ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
    System.out.println("Union of arr1 and arr2 is ");
    for (int val: Union)
        System.out.print(val+" ");
    }
}



// Complexity Analysis

// Time Compleixty : O( (m+n)log(m+n) ) . Inserting a key in map takes logN times, where N is no of elements in map. At max map can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. So Inserting m+n th element takes log(m+n) time. Upon approximation across insertion of all elements in worst it would take O((m+n)log(m+n) time.

// Using HashMap also takes the same time, On average insertion in unordered_map takes O(1) time but sorting the union vector takes O((m+n)log(m+n))  time. Because at max union vector can have m+n elements.

// Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 

// O(1) {If Space of union ArrayList is not considered}


// solution 2

