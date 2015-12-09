package com.practicapost.jtoscano.practicapost.models.rateplanin;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class QueryRateplanRequest
{
    private ResourceSpecification ResourceSpecification;

    public ResourceSpecification getResourceSpecification ()
    {
        return ResourceSpecification;
    }

    public void setResourceSpecification (ResourceSpecification ResourceSpecification)
    {
        this.ResourceSpecification = ResourceSpecification;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ResourceSpecification = "+ResourceSpecification+"]";
    }
}