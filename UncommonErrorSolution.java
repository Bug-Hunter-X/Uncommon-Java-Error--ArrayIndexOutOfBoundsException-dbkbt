public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int index = 10;
            // Check the index before accessing the array element
            if (index >= 0 && index < array.length) {
                System.out.println(array[index]);
            } else {
                System.err.println("Index out of bounds: " + index);
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
} 