//Assignment1 :Que.1
class ArrayFindSecond{
public static void main(String[] args){
int[] arr = new int[]{10,0,5,20,0,8,15};

 int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
			 moveZerosToEnd(arr);
        System.out.print("Array after moving zeros : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

	
    static int findSecondLargest(int[] arr) {
              int largest = Integer.MIN_VALUE;//constant in java that //represent smallest possible value that an int can hold
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest elements
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

       
        return secondLargest;
    }

// Method to move all zeros to the end of the array while maintaining the order of non-zero elements
	static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }

       
}
/*Output;Second largest element: 15
Array after moving zeros : 10 5 20 8 15 0 0*/