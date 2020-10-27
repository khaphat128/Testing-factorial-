package util;

/**
 *
 * @author Administrator
 */
public class MyToy {

    public static long computeFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be in 0..20");

        } else if (n == 0) {
            return 1;
        }else{
                    return n*computeFactorial(n-1);
        }
    }
}
