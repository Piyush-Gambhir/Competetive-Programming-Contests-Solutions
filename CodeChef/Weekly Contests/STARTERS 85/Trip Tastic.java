/*
 * 
 * Problem
A school wants to plan a trip for a group of K students and one mentor.
A hotel is booked for their stay, where the rooms are formatted in form of a matrix A with N rows
and M columns. There are a total of N x M rooms where the room (i, j) has a capacity of A(ij)
people.
The distance between the rooms (il,jl) and (i2,j2) is given by max(lil — i21, Ijl — AI), where IXI
denotes the absolute value of X.
To ensure that the trip goes smoothly, the rooms should be booked in a way such that the distance
between the mentor's room and the farthest room of a student is minimal.
Note that the mentor and students can stay in the same room.
Your task is to find the minimal distance between the mentor's room and the farthest room of a
student.
In case the total capacity of the hotel is less than K + 1, print —1 instead.
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[][] roomCapacity = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    roomCapacity[i][j] = sc.nextInt();
                }
            }

            int hotelTotalCapacity = 0;

            for (int i = 0; i < N; i++) {
                int rowCapacity = 0;
                for (int j = 0; j < M; j++) {
                    rowCapacity += roomCapacity[i][j];
                }
                hotelTotalCapacity += rowCapacity;
            }

            if (hotelTotalCapacity < K + 1) {
                System.out.println(-1);
                continue;
            }

            int[][] distance = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    distance[i][j] = Math.max(Math.abs(i - 0), Math.abs(j - 0));
                }
            }

            int maxDistance = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (distance[i][j] > maxDistance) {
                        maxDistance = distance[i][j];
                    }
                }
            }

            System.out.println(maxDistance);
        }
    }
}
