package com.company.utils;

import java.io.*;
import java.util.Scanner;

/**
 * Created by fili_ on 9/1/2016.
 */
public class readFile
{
    public static Scanner fileContents(String fileName)
    {
        Scanner matrix = null;
        try
        {
            matrix = new Scanner(new File("src/com/company/Files/" + fileName));
            while (matrix.hasNextLine())
            {
                String line = matrix.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return matrix;
    }
}