import java.util.Scanner;

public class $_Arrays_Basic {
    // Passing array as arguments
    public static void Update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        // Creating Array

        // datatype name[] = new datatype[size];

        int arr[] = { 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int arr1[] = new int[4];
        arr1[0] = 10;

        // Taking user input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Update(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2D Array

        int Arr[][] = new int[2][3];
        int Arr1[][] = {{1,2,3,4,5},{6,7,8,9,10}};

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1[0].length; j++) {
                System.out.print(Arr1[i][j] + " ");
            }
        }
    }
}