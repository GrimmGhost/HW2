package com.company.Nodes;

/**
 * Created by fili_ on 9/1/2016.
 */
public class SparseMatrix extends Node
{
    public SparseMatrix()
    {
        setNextColumn(null);
        setNextRow(null);
    }

    // insert values into ValueNode
    public void insert(int row, int column, int value)
    {

        // make ValueNode and add to the corresponding HeadNode
        System.out.println("Value: " + value);

        ValueNode valueNode = new ValueNode(row, column, value);

        this.getColumn(column).insert(valueNode);
        this.getRow(row).insert(valueNode);
        //columnHeadNode.insert(valueNode);
    }

    public int getValue(int row, int column)
    {
        // if value node does not exist send 0 because its not a value

        return 0;
    }

    // print sparseMatrix?
    public void print()
    {
        // print the sparseMatrix in a pretty way :D

        System.out.println("-----Matrix A-----");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public HeadNode getRow(int position)
    {
        int counter = 1;
        System.out.println("Sent Row Position: " + position);

        RowHeadNode currentRowHeadNode = (RowHeadNode) this.getNextInRow();

        while ((counter < position))
        {
            System.out.println("position: " + position);
            currentRowHeadNode = (RowHeadNode) currentRowHeadNode.getNext();
            counter++;
        }

        return currentRowHeadNode;
    }

    public HeadNode getColumn(int position)
    {
        // traverse headNode LinkedList
        int counter = 1;
        System.out.println("Sent Column Position: " + position);

        ColumnHeadNode currentColumnHeadNode = (ColumnHeadNode) this.getNextInColumn();

        while ((counter < position))
        {
            System.out.println("position: " + position);
            currentColumnHeadNode = (ColumnHeadNode) currentColumnHeadNode.getNext();
            counter++;
        }

        return currentColumnHeadNode;
    }


    //== Other Func

    public SparseMatrix Transpose()
    {
        return null;
    }

    public SparseMatrix product(SparseMatrix other)
    {
        return other;
    }

    public void setNextColumn(Object o)
    {
        setNextInColumn((Node) o);
    }

    public void setNextRow(Object o)
    {
        setNextInRow((Node) o);
    }
}
