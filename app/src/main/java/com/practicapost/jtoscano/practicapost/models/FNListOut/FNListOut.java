package com.practicapost.jtoscano.practicapost.models.FNListOut;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class FNListOut{
    private QueryFNListsResponse queryFNListsResponse;

    public QueryFNListsResponse getQueryFNListsResponse ()
    {
        return queryFNListsResponse;
    }

    public void setQueryFNListsResponse (QueryFNListsResponse queryFNListsResponse)
    {
        this.queryFNListsResponse = queryFNListsResponse;
    }

    private HeaderOut HeaderOut;

    public HeaderOut getHeaderOut ()
    {
        return HeaderOut;
    }

    public void setHeaderOut (HeaderOut HeaderOut)
    {
        this.HeaderOut = HeaderOut;
    }

}