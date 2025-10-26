public class Q4_TappingRainWater {
    public static void main(String[] args) {
        // int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped water: " + trappedRainWater(height));
    }

    public static int trappedRainWater(int height[]) {
        int leftMax[] = new int[height.length];
        int water = 0;
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int trappedWater = waterLevel - height[i];
            water += trappedWater;
        }
        return water;
    }
}
