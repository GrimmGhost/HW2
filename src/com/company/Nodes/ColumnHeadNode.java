package com.company.Nodes;

/**
 * Created by fili_ on 9/1/2016.
 */
public class ColumnHeadNode extends HeadNode
{
    public ColumnHeadNode()
    {
        // set next in row and column to null
        setNextColumn(null);
        setNextRow(null);
    }
}