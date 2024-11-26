public class Largest {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = { 12, 45, 78, 23, 56, 89, 34 };

        // Find the largest number
        int largest = findLargest(numbers);

        // Output the result
        System.out.println("The largest number in the array is: " + largest);
    }

    // Method to find the largest number in the array
    public static int findLargest(int[] array) {
        // Assume the first element is the largest
        int largest = array[0];

        // Traverse through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
        }

        return largest; // Return the largest number
    }
}































