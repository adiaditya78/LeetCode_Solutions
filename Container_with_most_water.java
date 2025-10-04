// Approach:
// Use the Two Pointer Technique — start with one pointer at the beginning and the other at the end of the array.
// Calculate the area between them and keep track of the maximum.
// Move the pointer pointing to the smaller height inward to possibly find a taller line and maximize the area.
// Continue until both pointers meet.

class Solution {
    public int maxArea(int[] height) {
        int maxAmount = 0;
        int minHeight = 0;
        int start = 0;
        int end = height.length - 1;
        while(start < end){
            minHeight = Math.min(height[start], height[end]);
            maxAmount = Math.max(maxAmount, (end - start) * minHeight);
            if(height[start] < height[end]){
                start++;
            }
            else
            {
                end--;
            }
        }
        return maxAmount;
    }
}
