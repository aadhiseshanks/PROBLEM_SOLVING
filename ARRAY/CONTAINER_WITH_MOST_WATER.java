// Leetcode - 11
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
// In this case, the max area of water (blue section) the container can contain is 49.

// Input: height = [1,1]
// Output: 1

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int height[] = new int[size];
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }
        
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
