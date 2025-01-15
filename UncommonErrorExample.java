public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            // Simulate an uncommon error: accessing a non-existent array element
            int[] array = new int[5];
            System.out.println(array[10]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Uncommon Error: " + e.getMessage());
            // Handle the exception appropriately (e.g., log, retry, fallback)
        } catch (Exception e) {
            System.err.println("Another Exception: " + e.getMessage());
        }
    }
}