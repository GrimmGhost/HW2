package com.company.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by fili_ on 9/1/2016.
 */
public class readFile
{
    public static void readFile()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\CMPS\\CMPS390\\src\\com\\company\\matrixA.dat")));

            String line;


            while ((line = reader.readLine()) != null)
            {
                int lineCOunter = 1;
                System.out.print(line + "\n");
                //

                switch (lineCOunter)
                {
                    case 1:
                        // make that many columns
                        break;
                    case 2:
                        break;
                }
                //if (shouldBreak) break;
                // send to value reader
            }
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.");
            e.printStackTrace();
        }
    }

    public static void readFileValues()
    {

    }
}
