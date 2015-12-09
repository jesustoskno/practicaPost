package com.practicapost.jtoscano.practicapost.models.rateplanin;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class RatePlanIn {
    private QueryRateplanRequest queryRateplanRequest;

    private HeaderIn HeaderIn;

    private String metodo;

    public QueryRateplanRequest getQueryRateplanRequest ()
    {
        return queryRateplanRequest;
    }

    public void setQueryRateplanRequest (QueryRateplanRequest queryRateplanRequest)
    {
        this.queryRateplanRequest = queryRateplanRequest;
    }

    public HeaderIn getHeaderIn ()
    {
        return HeaderIn;
    }

    public void setHeaderIn (HeaderIn HeaderIn)
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

    @Override
    public String toString()
    {
        return "ClassPojo [queryRateplanRequest = "+queryRateplanRequest+", HeaderIn = "+HeaderIn+", metodo = "+metodo+"]";
    }
}
