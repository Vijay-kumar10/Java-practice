import java.util.PrimitiveIterator.OfLong;

/**
 * TwoDArray
 */
public class TwoDArray {

    //search smallest element
    public static void searchSmallest(int arr[] []){
        int small = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] <= small){
                    small = arr[i] [j];
                }
            }
        }
        System.out.println("The smallest integer in this array is : "+small);
    }

    //search a key element
    public static void Search(int arr[][], int key){
        int a=1;
        for(int i=0 ; i<arr.length ;i++){
            for(int j=0 ;j<arr[0].length ;j++){
                if(arr[i][j] == key){
                    System.out.println("The key is present on "+i+","+j+" index");
                    a = 0;
                }
            }
        }
        if(a==1){
            System.out.println("key is not found in this array");
        }
    }
    
    //#DSA print 2D array in spiral way
    public static void printSpiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow <= endRow && startCol <=endCol){

            //top
            for(int j=startCol ; j<=endCol ;j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1 ;i<=endRow ;i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1 ;j>=startCol ;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1 ;i>=startRow+1 ;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            //update
            startRow ++;
            startCol ++;
            endRow --;
            endCol --;
        }
        System.out.println();
    }

    //sum of diognals of twoD array
public static void diagnalSum(int arr[][]){
    int sum = 0;
    for(int i=0 ; i<arr.length ;i++){
        sum+= arr[i][i];
        if(i != arr.length-1-i){
            sum+=arr[i][arr.length-1-i];
        }
    }
    System.out.println(" The sum of diagonals is : "+sum);
}

//DSA stair case search
public static boolean stairCaseSearch(int arr[][] , int key){
    int row = 0 , col = arr[0].length-1;

    while(row<arr.length && col>=0){
        if(key == arr[row][col]){
            System.out.println("Key is found on ("+row+" "+col+")");
            return true;
        }else if(key < arr[row][col]){
            col--;
        }else{
            row++;
        }
    }
    System.out.println("key is not found");
    return false;
}

    public static void main(String[] args) {
        int arr[][]= {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        // searchSmallest(arr);

        // Search(arr, 10);

        int matrix[][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // printSpiral(arr);

        // diagnalSum(matrix);

        stairCaseSearch(arr, 25);
    }
}