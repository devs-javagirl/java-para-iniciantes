package cap6;

class Factorial {
    // Esta é uma função recursiva.
    int factR(int n) {
        if (n == 1) return 1;
        return factR(n - 1) * n;
    }

    // Este é um equivalente iterativo.
    int factI(int n) {
        int result = 1;
        for (int t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }

}

