import java.util.Scanner;
import java.lang.Math;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int L = sc.nextInt();
            int V1 = sc.nextInt();
            int V2 = sc.nextInt();

            double tortoiseTime = Math.ceil((double) L / V1);
            double maxHareTime = (double) L / V2;

            int maxWaitTime = -1; // Initialize to -1, meaning hare can't win

            for (int waitTime = 0; waitTime < tortoiseTime; waitTime++) {
                double hareTime = waitTime + maxHareTime;
                double roundedHareTime = Math.ceil(hareTime);

                if (roundedHareTime < tortoiseTime) {
                    maxWaitTime = waitTime;
                }
            }

            System.out.println(maxWaitTime);
        }
    }
}
