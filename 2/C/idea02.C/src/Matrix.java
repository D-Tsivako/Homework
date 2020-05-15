import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите размерность матрицы: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            System.out.println("Ваша матрица: ");

            int[][] A = new int[n][n];
            for (int i=0; i<n; i++)
            {
                for (int j=0; j<n; j++)
                {
                    A[i][j] = (int) (Math.random()*2*n - n);
                }
            }

            for (int i=0; i<n; i++)
            {
                for (int j=0; j<n; j++)
                {
                    System.out.print( A[i][j]+" ");
                }
                System.out.print("\n");
            }


            System.out.print("Выбирeте столбец: ");
            Scanner s = new Scanner(System.in);
            int e = s.nextInt();
            e--;

            System.out.println("Итог:");

            for (int i=0;  i<n; i++)
                for (int k=i+1; k < n; k++) {
                    if (A[i][e] > A[k][e]){
                        for (int j=0; j < n; j++) {
                            int temp = A[i][j];
                            A[i][j]=A[k][j];
                            A[k][j]=temp;
                        }
                    }
                }

            for (int i=0; i<n; i++)
            {
                for (int j=0; j<n; j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
        catch (NumberFormatException r) {
            System.out.println("ошибка невозможного преобразования строки в числовой формат " + r);
        }
    }
}
