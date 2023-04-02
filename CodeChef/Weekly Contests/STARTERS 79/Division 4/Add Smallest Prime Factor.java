import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Codechef {

    public static int getSmallestPrimeFactor(int n) {
        if (n % 2 == 0)
            return 2;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return i;
        }
        return n;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            int minimumTime = 0;
            // optimization
            if (X == Y) {
                System.out.println(0);
                continue;
            }

            while (X < Y) {
                int smallestPrimeFactorX = getSmallestPrimeFactor(X);
                int nextX = X + smallestPrimeFactorX;

                if (nextX >= Y) {
                    minimumTime++;
                    break;
                }

                minimumTime += (nextX - X) / smallestPrimeFactorX;
                X = nextX;
            }

            System.out.println(minimumTime);
        }
    }
}
