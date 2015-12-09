package com.practicapost.jtoscano.practicapost.models.getoperatorout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class LogicalResource {
    private String msisdn;

    private String msisdnType;

    public String getMsisdn ()
    {
        return msisdn;
    }

    public void setMsisdn (String msisdn)
    {
        this.msisdn = msisdn;
    }

    public String getMsisdnType ()
    {
        return msisdnType;
    }

    public void setMsisdnType (String msisdnType)
    {
        this.msisdnType = msisdnType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [msisdn = "+msisdn+", msisdnType = "+msisdnType+"]";
    }
}

