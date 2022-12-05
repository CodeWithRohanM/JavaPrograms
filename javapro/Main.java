package javapro;



class Main
{
    public static boolean isPrime(int n)
    {
        if(n <= 1)
            return false;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        

        int n = 5;
        boolean getPrime = isPrime(n);

        if(getPrime)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");


    }
}































// class Main 
// {

//     public static void incrementArray(int arr[][], int row, int col, int indices, int counter)
//     {
//         if(counter % 2 == 0)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[indices][j] += 1;
//             }
//         }
//         else
//         {
//             for(int i=0;i<row;i++)
//             {
//                 arr[i][indices] += 1;
//             }
//         }

//         System.out.println("After Incrementation = ");

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }


    // public static void main(String args[])
    // {
    //     Scanner scanner = new Scanner(System.in);

    //     int row = 2, col = 5;
    //     int arr[][] = new int[row][col];

    //     for(int i=0;i<row;i++)
    //     {
    //         for(int j=0;j<col;j++)
    //         {
    //             arr[i][j] = 0;
    //         }
    //     }

    //     System.out.println("Rows = "+arr[[0]]);


        // System.out.println("Array = ");

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<col;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }






        // int indices[][] = new int[2][2];
        // int counter = 0, oddCounter = 0;

        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<2;j++)
        //     {
        //         indices[i][j] = scanner.nextInt();
        //     }
        // }

        // System.out.println("Indices Array = ");

        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<2;j++)
        //     {
        //         System.out.print(indices[i][j]+" ");
        //     }
        //     System.out.println();
        // }






        // for(int i=0;i<2;i++)
        // {
        //     for(int j=0;j<2;j++)
        //     {
        //         incrementArray(arr, row, col, indices[i][j], counter);
        //         counter++;
        //     }
        // }

        // for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<col;j++)
        //     {
        //         if(arr[i][j] % 2 != 0)
        //         {
        //             oddCounter++;
        //         }
        //     }
        // }

        // System.out.println("Number of Odds in Array = "+oddCounter);

//     }
// }








































// class Main
// {


//     public static int nextArray(int arr[][], int row, int col, int displayRow, int displayCol)
//     {
//         int k = 0;    
//         int reshapedArray[] = new int[row*col];
//         int duplicateArray[][] = new int[row][col];
    
//         if(displayRow == 1 && displayCol == col*col)
//         {
//             for(int i=0;i<row;i++)
//             {
//                 for(int j=0;j<col;j++)
//                 {
//                     reshapedArray[k] = arr[i][j];
//                     k++;
//                 }
//             }
//         }
//         else
//         {
//             for(int i=0;i<row;i++)
//             {
//                 for(int j=0;j<col;j++)
//                 {
//                     duplicateArray[i][j] = arr[i][j];
//                 }
//             }
//         }
//         return reshapedArray;
//     }

//     public static void main(String args[])
//     {
//         int row = 3, col = 3;
//         int arr[][] = new int[row][col];
//         Scanner scanner = new Scanner(System.in);

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         int displayRow = 1;
//         int displayCol = 9;
//         int getNewArray = nextArray(arr, row, col, displayRow, displayCol);
//         System.out.println("The New Reshaped Array is = "+getNewArray);
//     }
// }





























// class Main
// {

//     public static int findMax(int arr[][], int row, int col)
//     {
//         int max = -1;
//         int temp = -1;
//         for(int i=0;i<row;i++)
//         {
//             int sum = 0;
//             for(int j=0;j<col;j++)
//             {
//                 sum += arr[i][j];
//             }
//             System.out.println("Sum of Row "+i+ "= "+sum);


//             if(sum > max)
//             {
//                 max = sum;
//                 temp =  i;
//                 System.out.println("Max = "+max);
//             }
//         }
//         return temp;
//     }


//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         int row = 2, col = 2;
//         int arr[][] = new int[row][col];

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         int getMaxRow = findMax(arr, row, col);
//         System.out.println(("The Max Sum is at row "+getMaxRow));
//     }
// }



























// class Main
// {

//     public static void searchAscendingArray(int arr[][], int row, int col, int key)
//     {
//         int rowIndex = 0;
//         int colIndex = col - 1;

//         while(colIndex >=0 && rowIndex <= row-1)
//         {
//             if(arr[rowIndex][colIndex] == key)
//             {
//                 System.out.println("The Element "+key+" is at position arr["+rowIndex+"]["+colIndex+"]");
//                 return;
//             }
//             if(key > arr[rowIndex][colIndex])
//             {
//                 rowIndex++;
//             }
//             else
//             {
//                 colIndex--;
//             }
//         }
//         System.out.println("The Element "+key+" is not in the Array.");
//     }
//     public static void main(String[] args) {
//         int row = 3, col = 3;
//         int arr[][] = new int[row][col];
//         int key = 30;

//         Scanner scanner = new Scanner(System.in);

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         searchAscendingArray(arr, row, col, key);
//     }
// }





























// class Main
// {

//     public static void binaryArray(int arr[][], int row, int col, int key)
//     {
//         int first = 0, last = (row * col) - 1;

//         int mid = first + (last - first)/2;


//         while(first <= last)
//         {
//             int actualRow = mid/col;
//             int actualCol = mid%col;

//             int actualMid = arr[actualRow][actualCol];

//             System.out.println("Actual Mid = "+actualMid);

//             if(actualMid == key)
//             {
//                 System.out.println("The Element "+key+" is present at arr["+actualRow+"]["+actualCol+"]");
//                 return;
//             }
//             else if(key > actualMid)
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         System.out.println("The Element "+key+" is not in Array.");
//     }



//     public static void main(String args[])
//     {
//         int row = 3, col = 4;
//         int arr[][] = new int[row][col];
//         int key = 50;

//         Scanner scanner = new Scanner(System.in);

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         binaryArray(arr, row, col, key);


//     }
// }

































// class Main
// {

//     public static void binarySearchArray(int arr[][], int row, int col, int key)
//     {
//         int first = 0, last = row*col - 1;

//         int mid = first + (last - first)/2;

//         int actualMid = -1;

//         while(first <= last)
//         {
//             int getRow = (mid/col);
//             int getCol = (mid%col);
//             actualMid = arr[getRow][getCol];
//             System.out.println("Actual Mid = "+actualMid);

//             if(actualMid == key)
//             {
//                 System.out.println("Element "+key+" is at position arr["+getRow+"]["+getCol+"]");
//             }
//             else if(key > actualMid)
//             {
//                 first = mid + 1;
//             }    
//             else 
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last-first)/2;
//         }
//         System.out.println("Element "+key+" NOT present in Array.");
//     }



//     public static void main(String[] args) {
//         int row = 4, col = 3;
//         int arr[][] = new int[row][col];
//         Scanner scanner = new Scanner(System.in);
//         int key = 20;

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         binarySearchArray(arr, row, col, key);
//     }
// }




























// class Main
// {
//     public static void rotatedArray(int arr[][], int row, int col)
//     {
//         int firstRow = 0;
//         int lastRow = row - 1;

//         int firstCol = 0;
//         int lastCol = col - 1;

//         while(firstCol <= lastCol)
//         {
//             for(int i=lastRow; i>=firstRow; i--)
//             {
//                 System.out.print(arr[i][firstCol]);
//             }
//             System.out.println();
//             firstCol++;
//         }
//     }
//     public static void main(String[] args) {
        

//         int row = 3, col = 3;
//         int arr[][] = new int[row][col];
//         Scanner scanner = new Scanner(System.in);

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         rotatedArray(arr, row, col);
//     }
// }
























// class Main
// {

//     public static void spiralArray(int arr[][], int row, int col)
//     {
//         int startingRow = 0;
//         int endingRow = row-1;

//         int startingCol = 0;
//         int endingCol = col-1;

//         int count = 0;

//         while(count < row * col)
//         {
//             for(int i=startingCol; i<=endingCol; i++)
//             {
//                 System.out.print(arr[startingRow][i] +" ");
//                 count++;
//             }

//             startingRow++;

//             for(int i=startingRow; i<=endingRow; i++)
//             {
//                 System.out.print(arr[i][endingCol]+" ");
//                 count++;
//             }

//             endingCol--;

//             for(int i=endingCol; i>=startingCol; i--)
//             {
//                 System.out.print(arr[endingRow][i]+" ");
//                 count++;
//             }

//             endingRow--;

//             for(int i=endingRow; i>=startingRow; i--)
//             {
//                 System.out.print(arr[i][startingCol]+" ");
//                 count++;
//             }

//             startingCol++;

//         }
//     }
//     public static void main(String[] args) {
        

//         int row = 3, col = 3;
//         int arr[][] = new int[row][col];
//         Scanner scanner = new Scanner(System.in);

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         System.out.println(row*col);

//         spiralArray(arr, row, col);


//     }
// }
























// class Main
// {
//     public static void spiralArray(int arr[][], int row, int col)
//     {
//         int counter = -1, i = 0, j = 0;
//         int rowCount = 1, colCount = 1, limit = -1;
//         if(row <= col)
//             counter = row * 2 + 1;
//         else
//             counter = row * 2;

//         int temp = 2;
//         for(;i<row;i++)
//         {
//             for(;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//         }
//         while(temp <= counter)
//         {
//             if(temp % 2 == 0)
//             {
//                 limit = col - 1;

//                 if(colCount % 2 != 0)
//                 {
//                     i +=1;
//                     j -=1;

//                     for(; i<=limit ; i++)
//                     {
//                         System.out.print(arr[i][j]);
//                     }
//                 }
//                 else
//                 {
//                     i =- 1;
//                     for(;i>)
//                 }
//                 colCount++;
//             }
//             else
//             {
//                 if(rowCount %2 != 0)
//                 {

//                 }
//                 else
//                 {
//                     j -= 1;
//                     for(;j>=0;j--)
//                     {
//                         System.out.print(arr[i][j]);
//                     }
//                 }

//                 rowCount++;
//             }

//         }    

//     }
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         int row=5, col=5;
//         int arr[][] = new int[row][col];

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         spiralArray(arr, row, col);

//     }
// }































// class Main
// {

//     public static void printSineWave(int arr[][], int row, int col)
//     {
//         int temp = -1, i, j;
//         for(i=0;i<row;i++)
//         {
//             if(i%2 != 0)
//             {
//                 for(j=temp-1; j>=0; j--)
//                 {
//                     System.out.print(arr[j][i]+" ");
//                 }
//             }
//             else
//             {
//                 for(j=0; j<col; j++)
//                 {
//                     System.out.print(arr[j][i]+" ");
//                 }
//             }
//             temp = j;
//         }
//     }
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         int row = 3, col = 3;
//         int arr[][] = new int[row][col];

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                  System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         printSineWave(arr, row, col);


//     }
// }
























// class Main
// {

//     public static void sumArray(int key, int row, int col, int arr[][])
//     {

//         int sum = 0, max = -1, rowMax = -1;

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 sum += arr[i][j];
//             }
//             System.out.println("Sum of Row "+i+" is = "+sum);

//             if(sum > max)
//             {
//                 max = sum;
//                 rowMax = i;
//             }

//             sum = 0;
//         }
//         System.out.println("The Largest Sum Row is = "+rowMax+" with Sum = "+max);
//     }

//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner((System.in));
//         int row = 3, col = 3;
//         int arr[][] = new int[row][col];
//         int key = 7;

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print("Enter value at arr["+i+"]["+j+"] = ");
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//         sumArray(key, row, col, arr);
        


//     }
// }



















// class Main
// {

//     public static int findPivot(int arr[], int first, int last, int mid)
//     {
//         while(first < last)
//         {
//             if(arr[mid] <= arr[last])
//             {
//                 last = mid;
//             }
//             else
//             {
//                 first = mid + 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         return first;
//     }

//     public static int findKeyInSorted(int arr[], int pivotIndex, int first, int last, int mid, int key)
//     {
//         if(arr[first] == arr[last])
//         {
//             first = first + 1;
//             last =  last - 1;
//         }

//         if(arr[pivotIndex] == key)
//         {
//             return pivotIndex;
//         }
//         else if(key <= arr[last])
//         {
//             first = pivotIndex + 1;
//         }
//         else
//         {
//             last = pivotIndex - 1;
//         }

//         System.out.println("Final First = "+first+" Last = "+last);

//         mid = first + (last - first)/2;
//         System.out.println("Mid = "+mid);

//         while(first<=last)
//         {
//             if(arr[mid] == key)
//                 return mid;
//             else if(key > arr[mid])
//             {
//                 first = mid + 1;
//             }    
//             else
//             {
//                 last = mid - 1; 
//             }
//             mid = first + (last - first)/2;
//         }
//         return -1;
//     }


//     public static void main(String[] args) {
        
//         int arr[] = {2,2,2,9,2,2};
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last - first)/2;

//         int key = 9;

//         int pivotElementIndex = findPivot(arr,first, last, mid);

//         System.out.println("Pivot Index = "+pivotElementIndex);

//         int getKeyInSorted = findKeyInSorted(arr, pivotElementIndex, first, last, mid, key);

//         if(getKeyInSorted == -1)
//             System.out.println("The Key "+key+" is not in the Rotated Array."); 
//         else
//             System.out.println("The Key "+key+" in the Rotated Array is at Position = "+getKeyInSorted);
//     }
// }
























// class Main
// {

//     public static int findElementInInfinite(int arr[], int first, int last, int mid, int num)
//     {
//         int length = (last - first) + 1;

//         while(num > arr[last])
//         {
//             first = last + 1;
//             last = last + (length * 2);
//         }

//         System.out.println(("First = "+first+" Last = "+last));

//         while(first <= last)
//         {
//             if(arr[mid] == num)
//             {
//                 return mid;
//             }
//             else if(num > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else 
//             {
//                 first = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
        

//         int arr[] = {2,5,6,8,10,12,15,20,22,24,26,30,50,51,52,53,54,55,56,57};

//         int first = 0, last = 1;
//         int mid = first + (last - first)/2;
//         int num = 50;

//         int getPosition = findElementInInfinite(arr, first, last, mid, num);
//         System.out.println("The Key "+num+" is present at Position "+getPosition+" in the Infinite Array.");
//     }
// }






































// class Main{

//     public static int findFirstOccurance(int arr[], int first, int last, int mid, int num)
//     {
//         int temp = -1;
//         while(first <= last)
//         {
//             if(arr[mid] == num)
//             {
//                 temp = mid;
//                 last = mid - 1;
//             }
//             else if(num > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         return temp;
//     }

//     public static int findLastOccurance(int arr[], int first, int last, int mid, int num)
//     {
//         int temp = -1;
//         while(first <= last)
//         {
//             if(arr[mid] == num)
//             {
//                 temp = mid;
//                 first = mid + 1;
//             }
//             else if(num > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         return temp;
//     }

//     public static void main(String [] args)
//     {
//         int arr[] = {1,2,3,3,3,3,5,5};
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last -first)/2;
//         int num = 0;
//         int getLastOccurance = findLastOccurance(arr, first, last, mid, num);
//         int getFirstOccurance = findFirstOccurance(arr, first, getLastOccurance, mid, num);

//         System.out.println("["+getFirstOccurance+","+getLastOccurance+"]");
        
//     }
// }




























// class Main{

//     public static int findFirstOccurance(int arr[], int first, int last, int mid, int num)
//     {
//         int temp = -1;
//         while(first <= last)
//         {
//             if(arr[mid] == num)
//             {
//                 temp = mid;
//                 last = mid - 1;
//             }
//             else if(num > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         return temp;
//     }

//     public static void main(String [] args)
//     {
//         int arr[] = {1,2,3,3,3,3,5,5};
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last -first)/2;
//         int num = 5;
//         int getFirstOccurance = findFirstOccurance(arr, first, last, mid, num);

//         System.out.println("The First Occurance of "+num+" is at position = "+ getFirstOccurance);
        
//     }
// }


















// class Main{

//     public static int findNextgreaterChar(int arr[], int first, int last, int mid, int ch)
//     {
//         while(first <= last)
//         {
//             if(arr[mid] == ch)
//             {
//                 if(mid == arr.length - 1)
//                     return 0;
//                 else    
//                     return mid + 1;
//             }
//             else if(ch > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }  
//         if(first == arr.length)
//             return 0;
//         else    
//             return first;
//     }
//     public static void main(String [] args)
//     {
//         int arr[] = {'c', 'f', 'j'};
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last -first)/2;
//         char ch = 'c';
//         System.out.println(mid);
//         int getNextGreaterChar = findNextgreaterChar(arr, first, last, mid, (int)ch);
//             char nextChar = (char) arr[getNextGreaterChar];
//             System.out.println("The Next Greater Character After "+ch+" is = "+ nextChar);
        
//     }
// }



















// class Main{

//     public static int findPrevSmaller(int arr[], int first, int last, int mid, int num)
//     {
//         while(first <= last)
//         {
//             if(arr[mid] == num)
//             {
//                 if(mid == 0)
//                     return mid;
//                 else    
//                     return mid - 1;
//             }
//             else if(num > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         if(last == -1)
//             return 400;
//         else    
//         return last;
//     }
//     public static void main(String [] args)
//     {
//         int arr[] = {2,3,5,9,14,16,18};
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last -first)/2;
//         int num = -20;
//         int getPrevSmaller = findPrevSmaller(arr, first, last, mid, num);
//         if(getPrevSmaller == 400)
//         {
//             System.out.println("The Number "+num+" "+"is not in the Array Range.");
//         }
//         else
//         System.out.println("The Next Larger Number After "+num+" is = "+arr[getPrevSmaller]);
//     }
// }




























// class Main{

//     public static int findNextGreater(int arr[], int first, int last, int mid, int num)
//     {
//         while(first <= last)
//         {
//             if(arr[mid] == num)
//             {
//                 if(mid == arr.length - 1)
//                     return mid;
//                 else    
//                     return mid + 1;
//             }
//             else if(num > arr[mid])
//             {
//                 first = mid + 1;
//             }
//             else
//             {
//                 last = mid - 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         return first;
//     }
//     public static void main(String [] args)
//     {
//         int arr[] = {2,3,5,9,14,16,18};
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last -first)/2;
//         int num = 18;
//         int getNextLarger = findNextGreater(arr, first, last, mid, num);
//         System.out.println("The Next Larger Number After "+num+" is = "+arr[getNextLarger]);
//     }
// }

















// public class Main 
// {

//     public static int findFirstLarger(int key, int arr[], int first, int last, int mid)
//     {
        
//         System.out.println(mid);

//         while(first <= last)
//         {
//             if(key < arr[mid])
//             {
//                 last = mid - 1;
//                 System.out.println("Last = "+last);
//             }
//             else
//             {
//                 first = mid + 1;
//                 System.out.println(("First = "+first));
//             }
//             mid = first + (last - first)/2;
//             System.out.println("Mid = "+mid);
//         }
//         return first;
//     }


//     public static void main(String[] args) {
        
//         int arr[] = {2,3,5,9,14,16,18};
//         int key = 17;
//         int first = 0, last = arr.length - 1;
//         int mid = first + (last - first)/2;
//         int getFirstLarger = findFirstLarger(key, arr, first, last, mid);
//         System.out.println("The First Greater Number after "+key+" is = "+arr[getFirstLarger]);
//     }
// }
