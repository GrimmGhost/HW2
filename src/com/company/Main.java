package com.company;

import com.company.Nodes.*;
import com.company.utils.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        start();

    }

    public static void start()
    {
        SparseMatrix sparseMatrix = testMatrix.test(new SparseMatrix());

        sparseMatrix.insert(1,1,4);
        sparseMatrix.insert(2,1,53);
        sparseMatrix.insert(3,1,455);
        sparseMatrix.insert(2,2,567);
        sparseMatrix.insert(5,3,43);
        sparseMatrix.insert(4,4,32);
        sparseMatrix.insert(1,5,345678);

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Enter a Column: ");
        int column = reader.nextInt();

        System.out.print("Enter a Row: ");
        int row = reader.nextInt();

        System.out.print(sparseMatrix.getValue(row,column));

        // create sparseMatrix HeadNodes

        // MatrixBuilder.matrix(sparseMatrix);

        // sparseMatrix = testMatrix.test(sparseMatrix);

    }
}