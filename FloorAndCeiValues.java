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