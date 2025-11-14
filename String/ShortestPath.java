public class ShortestPath {
    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        System.out.println("Shortest Path: " + displacement(direction));
    }

    /**
     * Calculates the straight-line (Euclidean) shortest distance 
     * from origin after following the given directions.
     *
     * Directions:
     *  N → y + 1
     *  S → y - 1
     *  E → x + 1
     *  W → x - 1
     *
     * @param str The direction string
     * @return Straight-line distance from origin
     */
    public static float displacement(String str) {
        int x = 0; // horizontal movement
        int y = 0; // vertical movement

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case 'E': x++; break;
                case 'W': x--; break;
                case 'N': y++; break;
                case 'S': y--; break;

                // Optional: handle invalid characters
                default:
                    // ignore or throw error
            }
        }

        // Calculate the straight-line distance using Pythagoras theorem
        return (float) Math.sqrt((x * x) + (y * y));
    }
}