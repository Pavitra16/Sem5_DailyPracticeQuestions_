class Solution {

    public int numberOfPairs(int[][] points) {
        int totalCount = 0;

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = 0; j < points.length; j++) {
                boolean flag = true;
                if (j == i)
                    continue;
                if (x1 <= points[j][0] && y1 >= points[j][1]) {

                    int x2 = points[j][0];
                    int y2 = points[j][1];

                    for (int k =0; k < points.length; k++) {
                        if (k == i || k == j)
                            continue;
                        int x3 = points[k][0];
                        int y3 = points[k][1];
                        if ((x1 <= x3 && x2 >= x3) && (y1 >= y3 && y2 <= y3)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        totalCount++;
                }
            }
        }

        return totalCount;
    }
}