package com.practicapost.jtoscano.practicapost.models.headerout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class ResultInfo {

    private String errorDesc;

    private String errorCode;

    public String getErrorDesc ()
    {
        return errorDesc;
    }

    public void setErrorDesc (String errorDesc)
    {
        this.errorDesc = errorDesc;
    }

    public String getErrorCode ()
    {
        return errorCode;
    }

    public void setErrorCode (String errorCode)
    {
        this.errorCode = errorCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [errorDesc = "+errorDesc+", errorCode = "+errorCode+"]";
    }
}
