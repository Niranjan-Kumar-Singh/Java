public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"mango", "banana", "apple"};

        // Assume first element is the largest initially
        String largest = fruits[0];

        // Start from index 1 and compare with current largest
        for (int i = 1; i < fruits.length; i++) {
            // If fruits[i] is lexicographically larger → update largest
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest (lexicographically): " + largest);
    }
}