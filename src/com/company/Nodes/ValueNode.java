package com.company.Nodes;

/**
 * Created by fili_ on 9/1/2016.
 */
public class ValueNode extends Node
{
    private int row;
    private int column;
    private int value;

    public ValueNode(int row, int column, int value)
    {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
