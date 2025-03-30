//Assignment 1:Que3
class SearchigInArray{
public static void main(String[] args){
int[] arr=new int[] {1,3,3,3,5,6,8};
int key =3;
		int first = findFirstOccurrence(arr, key);
        int last = findLastOccurrence(arr, key);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
 int search=binarySearch(arr,key);
 if(search!=(-1))
	 System.out.println("key found at index :"+search);
 else
	System.out.println("key not found ");
 // Count the total occurrences of the key
        int count = countOccurrences(arr, key);
        System.out.println("Total count of key: " + count);

        // Find peak element
        int[] peakArr = {1, 2, 18, 4, 5, 0};
        int peakElement = findPeakElement(peakArr);
        System.out.println("Peak element: " + peakElement);
    }



static int binarySearch(int[] arr,int k){
for(int i=0;i<arr.length;i++)
{
		if(arr[i]==k){
		return i;
		}
	}return -1;
}
 // Method to find the first occurrence of the key
    public static int findFirstOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccurrence = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                firstOccurrence = mid;
                end = mid - 1; // Move left to find the first occurrence
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return firstOccurrence;
    }

    // Method to find the last occurrence of the key
    public static int findLastOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int lastOccurrence = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                lastOccurrence = mid;
                start = mid + 1; // Move right to find the last occurrence
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return lastOccurrence;
    }
	//Method to count the total occurrences of the key
    public static int countOccurrences(int[] arr, int key) {
        int firstOccurrence = findFirstOccurrence(arr, key);
        int lastOccurrence = findLastOccurrence(arr, key);

        if (firstOccurrence == -1) {
            return 0; // Key not found
        }

        return lastOccurrence - firstOccurrence + 1;
    }

    // Method to find any peak element in the array
    public static int findPeakElement(int[] arr) {
        int n = arr.length;

        // Check if the first element is a peak
        if (n == 1 || arr[0] > arr[1]) {
            return arr[0];
        }

        // Check if the last element is a peak
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        // Check for peak in the middle of the array
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }

        return -1; // This case should not happen with the given array assumptions
    }
}/*Output:First occurrence: 1
Last occurrence: 3
key found at index :1
Total count of key: 3
Peak element: 18*/