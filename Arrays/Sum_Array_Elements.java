public class Sum_Array_Elements {
    public  int sum(int arr[], int n) {
    int Sum = 0;

    for(int i = 0; i < n; i++){
        Sum = Sum + arr[i];       
    }
    return Sum;
  }
}
