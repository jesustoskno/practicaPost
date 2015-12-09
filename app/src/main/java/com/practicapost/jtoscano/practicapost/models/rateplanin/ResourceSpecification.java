package com.practicapost.jtoscano.practicapost.models.rateplanin;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class ResourceSpecification
{
    private LogicalResource LogicalResource;

    public LogicalResource getLogicalResource ()
    {
        return LogicalResource;
    }

    public void setLogicalResource (LogicalResource LogicalResource)
    {
        this.LogicalResource = LogicalResource;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [LogicalResource = "+LogicalResource+"]";
    }
}
