class Solution {

    public boolean isSymm(int num) {
        int n = num;
        int c = 0;

        while (n != 0) {
            n /= 10;
            c++;
        }

        if (c % 2 != 0)
            return false;

        int x = num;
        int rsum = 0;

        for (int i = 1; i <= c / 2; i++) {
            rsum += x % 10;
            x /= 10;
        }

        int lsum = 0;

        for (int i = 1; i <= c / 2; i++) {
            lsum += x % 10;
            x /= 10;
        }

        return lsum == rsum;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (isSymm(i)) {
                count++;
            }
        }

        return count;
    }
}