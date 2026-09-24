public class sum_of_odd_even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("Sum of odd elements: " + oddSum);
        System.out.println("Sum of even elements: " + evenSum);
    }
}