public class Pair_Array {
    public static void Pairs(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")" );
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        Pairs(arr);
    }
}
