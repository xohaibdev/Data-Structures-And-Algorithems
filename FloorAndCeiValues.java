/*

Given an unsorted array arr[] and an element x, find floor and ceiling of x in arr[0..n-1].
Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

Examples: 

Input : arr[] = {5, 6, 8, 9, 6, 5, 5, 6}      
        x = 7
Output : Floor = 6
         Ceiling = 8

Input : arr[] = {5, 6, 8, 9, 6, 5, 5, 6}      
        x = 6
Output : Floor = 6
         Ceiling = 6

Input : arr[] = {5, 6, 8, 9, 6, 5, 5, 6}      
        x = 10
Output : Floor = 9
         Ceiling doesn't exist.
         */
class FloorAndCeiValues {
    public static void main(String[] args) {
        int[] testArray = {5,5,5,6,6,8,10};
        int  element = 7;
        int[] resultArray = floorAndCeil(testArray,element);
        int ceilElement =  resultArray[0];
        int floorElement = resultArray[1];
        System.out.println("Floor is "+floorElement);
        System.out.println("Ceil is "+ ceilElement);
    }
    public static int[] floorAndCeil(int[] testArray, int element)
    {
        int low = 0;
        int high = testArray.length - 1;
        int[] floorCeilArray = new int[2];
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(testArray[mid] == element)
            {
                floorCeilArray[0] = element;
                floorCeilArray[1] = element;
            }else if(element > testArray[mid])
            {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        floorCeilArray[0] = (high == -1) ? -1 : testArray[low];
        floorCeilArray[1] = (low == -1) ? -1 : testArray[high];
        return floorCeilArray;
    }
}