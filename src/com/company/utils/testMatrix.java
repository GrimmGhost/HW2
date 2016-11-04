package com.company.utils;

import com.company.Nodes.*;

/**
 * Created by fili_ on 9/11/2016.
 */
public class testMatrix
{

    public static SparseMatrix test(SparseMatrix sparseMatrix)
    {

        // create 5 columns and 5 rows
        // should you make a headNode if sparseMatrix always has the head referenced?
        //ColumnHeadNode headColumnHeadNode = null;
        ColumnHeadNode lastColumnHeadNode = null;

        int counter = 1;

        // make columns
        while(counter <= 5)
        {

            // make headNodes then make value Nodes and link them to the column HeadNode

            ColumnHeadNode columnHeadNode = new ColumnHeadNode();
            if (counter == 1)
            {

                System.out.println(counter + " ColumnHeadNode");
                sparseMatrix.setNextColumn(columnHeadNode);
                lastColumnHeadNode = columnHeadNode;

            }else
            {
                System.out.println(counter + " ColumnHeadNode");
                //lastColumnHeadNode.setNextColumn(columnHeadNode);
                lastColumnHeadNode = columnHeadNode;
            }

            //make valueNode and add to correct location
            // value will always be 1 higher

            //sparseMatrix.insert(counter,0,counter+1);

            counter++;
        }
        //make row

        RowHeadNode lastRowHeadNode = null;
        counter = 1;
        while(counter <= 5)
        {
            // make headNodes then make value Nodes and link them to the column HeadNode

            RowHeadNode rowHeadNode = new RowHeadNode();
            if (counter == 1)
            {
                System.out.println(counter + " RowHeadNode");
                sparseMatrix.setNextRow(rowHeadNode);
                lastRowHeadNode = rowHeadNode;

            }else
            {
                System.out.println(counter + " RowHeadNode");
                //lastRowHeadNode.setNextRow(rowHeadNode);
                lastRowHeadNode = rowHeadNode;
            }

            //make valueNode and add to correct location
            // value will always be 1 higher

            //sparseMatrix.insert(counter,0,counter+1);

            counter++;
        }

        return sparseMatrix;
    }

}
