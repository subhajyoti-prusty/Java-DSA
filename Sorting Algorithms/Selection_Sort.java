public class Selection_Sort {
    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };

        sort(arr);
    }
}


/*
    int temp,index = 0;

    for (int i = 0; i < arr.length; i++) {
        int minValue = Integer.MAX_VALUE;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] < minValue) {
                minValue = arr[j];
                index = j;
            }
        }
        temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
 */