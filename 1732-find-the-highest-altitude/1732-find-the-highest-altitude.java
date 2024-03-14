class Solution {
    public int largestAltitude(int[] gain) {
        int points[] = new int[gain.length+1];
        points[0] = 0;
        int max = 0;
        for (int i = 0; i <gain.length; i++) {
            points[i+1]= points[i] + gain[i];
            max = Math.max(max,  points[i+1]);
        }
        return max;
    }
}