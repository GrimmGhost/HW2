package com.company.Nodes;

/**
 * Created by fili_ on 9/1/2016.
 */
abstract class HeadNode extends Node
{
    public HeadNode getNext()
    {
        // if get Next row is empty get next column
        if (this instanceof ColumnHeadNode)
        {
            //return (ColumnHeadNode) getNextInColumn();
            return (ColumnHeadNode) getNextInColumn();
        }else
        {
            return (RowHeadNode) getNextInRow();
        }
    }

    //get the first ValueNode in the linked list
    public ValueNode getFirst()
    {
        // this should be the next in rowNode
        if (this instanceof ColumnHeadNode)
        {
            return (ValueNode) getNextInRow();
        }else
        {
            return (ValueNode) getNextInColumn();
        }
    }

    // insert ValueNode where required
    public void insert(ValueNode value)
    {

        if (this instanceof ColumnHeadNode)
        {
            if (this.getFirst() == null)
            {
                this.setNextRow(value);
                value.setNextInRow(value);
            }else
            {
                ValueNode currentValueNode = (ValueNode) this.getNextInRow();
                if (currentValueNode.getRow() > value.getRow())
                {
                    this.setNextColumn(value);
                    value.setNextInColumn(currentValueNode);
                }
            }
        }else
        {

        }

        /**
        if (this instanceof ColumnHeadNode)
        {
            //return (ColumnHeadNode) getNextInColumn();
            if (this.getFirst() == null)
            {

                this.setNextRow(value);
2222                this.setNextInColumn(this);
            }else
            {
                //get the first value node
                ValueNode currentValueNode = this.getFirst();

                // get the next in row of value node and make a reference
                ValueNode nextValueNode = (ValueNode) currentValueNode.getNextInRow();

                //while valueNode get row is greater than next in row
                while(currentValueNode.getRow() > nextValueNode.getRow())
                {
                    // set next node to current value node
                    currentValueNode = nextValueNode;

                    //get the next in row from new value node
                    nextValueNode = (ValueNode) currentValueNode.getNextInRow();
                }

                value.setNextInRow(currentValueNode.getNextInRow());
                currentValueNode.setNextInRow(value);
            }
        }else
        {
            if (this.getFirst() == null)
            {

                this.setNextRow(this);
                this.setNextInColumn(value);
            }else
            {
                //get the first value node
                ValueNode currentValueNode = this.getFirst();

                // get the next in row of value node and make a reference
                ValueNode nextValueNode = (ValueNode) currentValueNode.getNextInColumn();

                //while valueNode get row is greater than next in row
                while(currentValueNode.getColumn() > nextValueNode.getColumn())
                {
                    // set next node to current value node
                    currentValueNode = nextValueNode;

                    //get the next in row from new value node
                    nextValueNode = (ValueNode) currentValueNode.getNextInColumn();
                }

                value.setNextInColumn(currentValueNode.getNextInColumn());
                currentValueNode.setNextInColumn(value);
            }
        }
        **/

        // check if current node has anything in nextRow
    }
    public ValueNode get()
    {

        // not sure what to use this for.
        // use for transpose to get and move nodes
        return null;
    }

    //setters
    public void setNextColumn(Object o)
    {
        // if type headNode
        setNextInColumn((Node) o);
    }
    public void setNextRow(Object o)
    {
        setNextInRow((Node) o);
    }

    //--test Functions


}
