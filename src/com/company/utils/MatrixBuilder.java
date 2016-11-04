package com.company.utils;

import com.company.Nodes.SparseMatrix;

import java.util.Scanner;

/**
 * Created by fili_ on 9/1/2016.
 */
public class MatrixBuilder
{
    public static SparseMatrix matrix(String matrix)
    {

        Scanner currentMatrix = readFile.fileContents(matrix);
        String currentLine;

        while (currentMatrix.hasNext())
        {
            String line = currentMatrix.nextLine();
            System.out.println(line);
        }
        // create rows
        //do
        //{
            // get first two lines
         //   int rows = currentMatrix.nextInt();
        //    System.out.println(rows);
        //    int column = currentMatrix.nextInt();
         //   System.out.println(column);
            //System.exit(1);
        //}while (!currentMatrix.hasNext());
        //{
        //    currentLine = currentMatrix.nextLine();
        //    System.out.println(currentLine);
        //}
        return null;
    }
}
