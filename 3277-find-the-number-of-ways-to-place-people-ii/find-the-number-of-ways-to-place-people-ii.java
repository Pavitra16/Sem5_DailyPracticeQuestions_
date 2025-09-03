class Solution {
    public int numberOfPairs(int[][] points) {
         Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(b[1], a[1]);
        });
        int n = points.length, count = 0;
        for (int i = 0; i < n - 1; i++) {
            int maxY = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                if (points[j][1] <= points[i][1] && points[j][1] > maxY) {
                    count++;
                    maxY = points[j][1];
                }
            }
        }
        return count;
    }
}