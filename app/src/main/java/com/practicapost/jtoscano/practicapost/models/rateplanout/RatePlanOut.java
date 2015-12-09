package com.practicapost.jtoscano.practicapost.models.rateplanout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class RatePlanOut {
    private HeaderOut HeaderOut;

    public HeaderOut getHeaderOut ()
    {
        return HeaderOut;
    }

    public void setHeaderOut (HeaderOut HeaderOut)
    {
        this.HeaderOut = HeaderOut;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HeaderOut = "+HeaderOut+"]";
    }
}
