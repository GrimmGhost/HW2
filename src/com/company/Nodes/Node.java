package com.company.Nodes;

import java.util.Objects;

/**
 * Created by fili_ on 9/1/2016.
 */
abstract class Node
{
    private Node nextInRow;
    private Node nextInColumn;
    protected Node getNextInRow()
    {
        return nextInRow;
    }

    protected void setNextInRow(Node nextInRow)
    {
        this.nextInRow = nextInRow;
    }

    protected Node getNextInColumn()
    {
        return nextInColumn;
    }

    protected void setNextInColumn(Node getNextInColumn)
    {
        this.nextInColumn = getNextInColumn;
    }
}
