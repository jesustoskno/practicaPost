package com.practicapost.jtoscano.practicapost.models.rateplanout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class QueryRateplanResponse
{
    private RatePlan RatePlan;

    private ResultInfo resultInfo;

    public RatePlan getRatePlan ()
    {
        return RatePlan;
    }

    public void setRatePlan (RatePlan RatePlan)
    {
        this.RatePlan = RatePlan;
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
        return "ClassPojo [RatePlan = "+RatePlan+", resultInfo = "+resultInfo+"]";
    }
}