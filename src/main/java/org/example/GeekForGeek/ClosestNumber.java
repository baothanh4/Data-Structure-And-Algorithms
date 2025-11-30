package org.example.GeekForGeek;

public class ClosestNumber {
    public int closestNumber(int n, int m) {
        int low = (n / m) * m;    // số chia hết và nhỏ hơn hoặc bằng n
        int high = low + m;       // số chia hết tiếp theo

        if (Math.abs(n - low) <= Math.abs(high - n)) {
            return low;
        } else {
            return high;
        }
    }
}
