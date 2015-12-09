package com.practicapost.jtoscano.practicapost.models.getoperatorout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class GetOperatorResponse
{
    private ResourceSpecification ResourceSpecification;

    private ResultInfo resultInfo;

    public ResourceSpecification getResourceSpecification ()
    {
        return ResourceSpecification;
    }

    public void setResourceSpecification (ResourceSpecification ResourceSpecification)
    {
        this.ResourceSpecification = ResourceSpecification;
    }

    public ResultInfo getResultInfo ()
    {
        return resultInfo;
    }

    public void setResultInfo (ResultInfo resultInfo)
    {
        this.resultInfo = resultInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ResourceSpecification = "+ResourceSpecification+", resultInfo = "+resultInfo+"]";
    }
}
