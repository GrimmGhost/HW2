package com.company.Nodes;

/**
 * Created by fili_ on 9/1/2016.
 */
abstract class HeadNode extends Node
{
    abstract HeadNode getNext();
    abstract ValueNode getFirst();
    abstract void insert(ValueNode value);
    abstract ValueNode get();
    abstract void setNextColumn(Object item);
    abstract void setNextRow(Object item);
}
