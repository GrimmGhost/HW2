package com.company.Nodes;

/**
 * Created by fili_ on 9/1/2016.
 */
public class RowHeadNode extends HeadNode
{
    public RowHeadNode()
    {
        setNextColumn(null);
        setNextRow(null);
    }

    @Override
    HeadNode getNext() {
        return null;
    }

    @Override
    ValueNode getFirst() {
        return null;
    }

    @Override
    void insert(ValueNode value) {

    }

    @Override
    ValueNode get() {
        return null;
    }

    @Override
    void setNextColumn(Object item) {

    }

    @Override
    void setNextRow(Object item) {

    }
}
