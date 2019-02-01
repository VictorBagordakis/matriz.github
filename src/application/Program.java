package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] M = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				M[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(M[i][j] == number) {
					System.out.println("Position " + i + "," + j + ":");
					if(i==0) {
						if(j==0) {
							System.out.println("Right: " + M[i][j+1]);
							System.out.println("Down: " + M[i+1][j]);
						}
						else if(j==n-1){
							System.out.println("Left: " + M[i][j-1]);
							System.out.println("Down: " + M[i+1][j]);
						}
						else {
							System.out.println("Left: " + M[i][j-1]);
							System.out.println("Right: " + M[i][j+1]);
							System.out.println("Down: " + M[i+1][j]);
						}
					}
					
					else if(i==m-1) {
						if(j==0) {
							System.out.println("Up: " + M[i-1][j]);
							System.out.println("Right: " + M[i][j+1]);
						}
						else if(j==n-1) {
							System.out.println("Left: " + M[i][j-1]);
							System.out.println("Up: " + M[i-1][j]);
						}
						else {
							System.out.println("Left: " + M[i][j-1]);
							System.out.println("Up: " + M[i-1][j]);
							System.out.println("Right: " + M[i][j+1]);
						}
					}
					
					else {
						if(j==0) {
							System.out.println("Up: " + M[i-1][j]);
							System.out.println("Right: " + M[i][j+1]);
							System.out.println("Down: " + M[i+1][j]);
						}
						else if(j==n-1) {
							System.out.println("Left: " + M[i][j-1]);
							System.out.println("Up: " + M[i-1][j]);
							System.out.println("Down: " + M[i+1][j]);
						}
						else {
							System.out.println("Left: " + M[i][j-1]);
							System.out.println("Up: " + M[i-1][j]);
							System.out.println("Right: " + M[i][j+1]);
							System.out.println("Down: " + M[i+1][j]);
						}
					}
				}
			}
		}
		
		sc.close();

	}

}
