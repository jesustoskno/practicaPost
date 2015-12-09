package com.practicapost.jtoscano.practicapost.models.getoperatorin;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class GetOperator
{
    private HeaderInOperator HeaderIn;

    private String metodo;

    private GetOperatorRequest getOperatorRequest;

    public HeaderInOperator getHeaderIn ()
    {
        return HeaderIn;
    }

    public void setHeaderIn (HeaderInOperator HeaderIn)
    {
        this.HeaderIn = HeaderIn;
    }

    public String getMetodo ()
    {
        return metodo;
    }

    public void setMetodo (String metodo)
    {
        this.metodo = metodo;
    }

    public GetOperatorRequest getGetOperatorRequest ()
    {
        return getOperatorRequest;
    }

    public void setGetOperatorRequest (GetOperatorRequest getOperatorRequest)
    {
        this.getOperatorRequest = getOperatorRequest;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HeaderInOperator = "+HeaderIn+", metodo = "+metodo+", getOperatorRequest = "+getOperatorRequest+"]";
    }
}