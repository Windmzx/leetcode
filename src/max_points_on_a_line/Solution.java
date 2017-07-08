package max_points_on_a_line;

import java.util.*;

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}

public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length == 0)
            return 0;
        if (points.length == 1)
            return 1;
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            int dup = 0;
            int ver = 0;
            int currmax = 1;
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;
                double x = points[j].x - points[i].x;
                double y = points[j].y - points[i].y;
                if (x == 0 && y == 0) {
                    if (dup == 0)
                        dup = 2;
                    else
                        dup++;
                    currmax = Math.max(dup, currmax);
                }
                if (y == 0) {
                    if (ver == 0)
                        ver = 2;
                    else
                        ver++;
                    currmax = Math.max(ver, currmax);
                }
                double temp = x / y;
                map.put(temp, map.containsKey(temp) ? map.get(temp) + 1 : 2);
                currmax = Math.max(currmax, map.get(temp));

            }
            max = Math.max(max, currmax);
        }
        return max;
    }

}