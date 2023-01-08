
class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }

        int count = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> h = new HashMap<>();
            int samePointCount = 1;
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    samePointCount++;
                    continue;
                }
                double slope=0;
                if (points[j][0] == points[i][0]) {
                    if (points[i][1] == points[j][1]) {
                        samePointCount++;
                    } else {
                        slope = Double.MAX_VALUE;
                    }
                } else if (points[i][1] == points[j][1]) {
                    slope = 0.0;
                } else {
                    slope = (double)(points[j][1] - points[i][1]) / (double)(points[j][0] - points[i][0]);
                }
                h.put(slope, h.getOrDefault(slope, 0) + 1);
            }
            count = Math.max(count, samePointCount);
            for (int value : h.values()) {
                count = Math.max(count, value + samePointCount);
            }
        }

        return count;
    }
}

