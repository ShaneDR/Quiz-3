package org.example;

public class Division {

    public static final long division(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return (long) a / b;
    }

    public static final long divisionUsingLoop(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 0;
        while (absA >= absB) {
            absA -= absB;
            result++;
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingRecursion(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 1;
        int diff = absA - absB;
        if (diff > 0 && diff <= 1) {
            return result;
        } else if (diff < 0) {
            return 0;
        }

        result += divisionUsingRecursion(diff, absB);
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingMultiplication(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 0;
        int multiplier = 1;

        // Multiply absB by 1, 2, 4, 8, ... until absB * multiplier > absA
        while (absB * multiplier <= absA) {
            multiplier *= 2;
        }

        // Decrease multiplier and subtract absB from absA in chunks
        while (multiplier > 0) {
            if (absB * multiplier <= absA) {
                absA -= absB * multiplier;
                result += multiplier;
            }
            multiplier /= 2;
        }

        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingShift(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        long result = 0;
        while (absA >= absB) {
            int shift = 0;
            while (absA >= (absB << shift)) {
                shift++;
            }
            result += (1L << (shift - 1));
            absA -= (absB << (shift - 1));
        }
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }

    public static final long divisionUsingLogs(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        // Use natural log instead of log10 for precision
        double result = Math.exp(Math.log(absA) - Math.log(absB));
        return (a > 0 && b > 0 || a < 0 && b < 0) ? (long) result : -(long) result;
    }
}
