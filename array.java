/**
 * array
 */
public class array {

    //

    public static void findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest Number is: " + largest);
        System.out.println("Smallest Number is: " + smallest);
    }

    // print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // //binary search
    // public static int binarySearch(int arr[], int key){
    // int start = 0;
    // int end = arr.length-1;

    // while(start <= end){

    // int mid = (start+end)/2;
    // //camparison
    // if(key == arr[mid]){
    // return mid;
    // }
    // if(key < arr[mid]){ //left
    // end = mid-1;
    // } else(key > arr[mid]){
    // start = mid+1;
    // }
    // }
    // return -1;
    // }

    // reverse array
    public static void reverseArray(int arr[]) {

        int first = 0;
        int last = arr.length - 1;
        while (first < last) {

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    // all pairs
    public static void pair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    // subarray
    public static void subArray(int arr[]) {
        int ts = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                    if (sum > max) {
                        max = sum;
                    }
                }
                System.out.println(" the current sum  is : " + sum);
                sum = 0;
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is : " + ts);
        System.out.println("The maximum sum of array : " + max);
    }

    // cadans subarray sum
    public static void cadans(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The max sum is : " + ms);

    }

    // trapped water
    public static void trappedWater(int arr[]) {
        int avg[] = new int[arr.length];
        int sum = 0;
        // calculate left max
        int l_max = arr[0];
        int left_max[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l_max) {
                l_max = arr[i];
            }
            left_max[i] = l_max;
        }
        // calculate right max
        int r_max = arr[arr.length - 1];
        int right_max[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > r_max) {
                r_max = arr[i];
            }
            right_max[i] = r_max;
        }

        for (int i = 0; i < arr.length; i++) {
            avg[i] = Math.min(left_max[i], right_max[i]);
            sum = sum + (avg[i] - arr[i]);
        }
        System.out.println("the total trapped water : " + sum);

    }

    public static void main(String[] args) {
        // System.out.println("my name is vijay kumar");
        // int arr[]={2,4,6,8,10};
        // int a = binarySearch(arr, 53);
        // System.out.println(a);
        // findLargest(arr);

        // reverseArray(arr);
        // printArray(arr);

        // pair(arr);

        // subArray(arr);

        // cadans(arr);

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedWater(arr);
    }
}