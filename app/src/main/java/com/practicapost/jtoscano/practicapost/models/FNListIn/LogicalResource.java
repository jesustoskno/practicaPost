package com.practicapost.jtoscano.practicapost.models.FNListIn;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class LogicalResource {
    private String msisdn;

    public String getMsisdn ()
    {
        return msisdn;
    }

    public void setMsisdn (String msisdn)
    {
        this.msisdn = msisdn;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [msisdn = "+msisdn+"]";
    }
}
