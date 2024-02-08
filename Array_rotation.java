// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int k = scn.nextInt();
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }
    public static void reverse(int arr[], int sp, int ep){
        
         while(sp<ep){
            int temp = arr[sp];
            arr[sp]= arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
