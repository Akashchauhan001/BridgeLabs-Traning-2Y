import java.util.*;
class Q5_NumberChecker4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i*i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq = n*n;
        int sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }
    public static boolean isSpy(int n) {
        int sum = 0; int prod = 1; int m = Math.abs(n);
        if (m == 0) prod = 0;
        while (m > 0) { int d = m % 10; sum += d; prod *= d; m /= 10; }
        return sum == prod;
    }
    public static boolean isAutomorphic(int n) {
        long sq = (long)n * n;
        String s = String.valueOf(sq);
        String t = String.valueOf(n);
        return s.endsWith(t);
    }
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (Math.abs(n) % 10 == 7);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        System.out.println(isSpy(n));
        System.out.println(isAutomorphic(n));
        System.out.println(isBuzz(n));
    }
}
