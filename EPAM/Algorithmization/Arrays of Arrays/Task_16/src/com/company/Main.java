package com.company;

import java.util.Scanner;
//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
public class Main
{


    public static void print(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void creareMatrix(int matrix[][])
    {
        int k = 1;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = k;
                k++;
            }
        }
    }

    public static void reverseMatrixFirst(int matrix[][])
    {
        int temp;
        for (int i = 0; i < matrix.length / 2; i++)
        {
            for (int j = 0; j < matrix.length / 2; j++)
            {
                if (i == j)
                {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                    matrix[matrix.length - 1 - i][matrix.length - 1 - j] = temp;
                }
            }
        }
    }

    public static void reverseMatrixSecond(int matrix[][])
    {
        int temp;
        for (int i = 0, j = matrix.length - 1 - i; i <= (matrix.length / 2) - 1; ++i, --j)
        {
            temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner (System.in);
        // получилось сделать для матрицы, кратной 4. С другими цифрами пока что не разобрался. В процессе
        System.out.print("Введите размерность матрицы(n кратно 4)");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        if (n % 4 > 0)
        {
            System.out.print("n не кратно четырём");
        }
        else
        {
            System.out.println("Начальная матрица");
            creareMatrix(a);
            print(a);
            System.out.println("Магический квадрат");
            reverseMatrixFirst(a);
            reverseMatrixSecond(a);
            print(a);
        }
        scanner.close();
    }
}
