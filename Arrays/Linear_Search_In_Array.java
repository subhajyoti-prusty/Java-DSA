public class Linear_Search_In_Array {
    public static int Search(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,15,17,19,5,23,6,1};
        int key = 17;

        Search(arr, key);

        
    }
}
