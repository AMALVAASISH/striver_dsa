package Arrays.easy.check_if_sorted;

public class Main {

    static boolean check_if_sorted(int[] arr,int n){
        for(int i =0;i<n-1;i++){
            if(!(arr[i]<arr[i+1])){
                return false;
            }
        }

        
        
        for(int j = 0;j<n-1;j++){
            if(!(arr[j]>arr[j+1])){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;

        boolean result = check_if_sorted(arr,n);
        System.out.println(result);
    }
}
