class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {//if(points == null ) means no array exist  
            return 0;// if the array has no ballons therefore no arroes are needed
        }

        // Sort balloons in ascending order by their end coordinates
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        long end = points[0][1];

        // Iterate through all intervals
        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the last arrow position, shoot a new arrow
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}
