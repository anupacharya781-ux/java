import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // Display Matrix A
        System.out.println("\n Matrix A:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("enter A[%d][%d]: ",i,j);
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("\n Matrix B:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("enter B[%d][%d]: ",i,j);
                B[i][j]= sc.nextInt();
            }
        }
        System.out.println("\nDisplaying Matrix A:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("\n Displaying Matrix B:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("\n Displaying Matrix C:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}