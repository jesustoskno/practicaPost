package com.practicapost.jtoscano.practicapost.models.FNListIn;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class FNListIn {
    private HeaderIn HeaderIn;

    private String metodo;

    private QueryFNListsRequest queryFNListsRequest;

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

    public QueryFNListsRequest getQueryFNListsRequest ()
    {
        return queryFNListsRequest;
    }

    public void setQueryFNListsRequest (QueryFNListsRequest queryFNListsRequest)
    {
        this.queryFNListsRequest = queryFNListsRequest;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HeaderIn = "+HeaderIn+", metodo = "+metodo+", queryFNListsRequest = "+queryFNListsRequest+"]";
    }
}
