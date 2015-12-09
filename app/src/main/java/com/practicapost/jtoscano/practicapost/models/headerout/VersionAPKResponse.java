package com.practicapost.jtoscano.practicapost.models.headerout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class VersionAPKResponse {
    private ResultInfo resultInfo;

    private String version;

    public ResultInfo getResultInfo ()
    {
        return resultInfo;
    }

    public void setResultInfo (ResultInfo resultInfo)
    {
        this.resultInfo = resultInfo;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [resultInfo = "+resultInfo+", version = "+version+"]";
    }
}
