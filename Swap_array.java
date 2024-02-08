public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int sp=0;
        int ep = arr.length - 1;
        while(sp<ep){
            int temp = arr[sp];
            arr[sp]= arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }
}
