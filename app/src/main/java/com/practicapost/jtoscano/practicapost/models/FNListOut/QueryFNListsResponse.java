package com.practicapost.jtoscano.practicapost.models.FNListOut;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class QueryFNListsResponse {
    private ResultInfo resultInfo;

    private FrequentNumberList FrequentNumberList;

    public ResultInfo getResultInfo ()
    {
        return resultInfo;
    }

    public void setResultInfo (ResultInfo resultInfo)
    {
        this.resultInfo = resultInfo;
    }

    public FrequentNumberList getFrequentNumberList ()
    {
        return FrequentNumberList;
    }

    public void setFrequentNumberList (FrequentNumberList FrequentNumberList)
    {
        this.FrequentNumberList = FrequentNumberList;
    }
}
