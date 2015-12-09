package com.practicapost.jtoscano.practicapost.models.FNListIn;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class HeaderIn {
    private String timestamp;

    private String operation;

    private String system;

    private String userId;

    private String entity;

    private String execId;

    private String subsystem;

    private String originator;

    private String lang;

    private String destination;

    private String country;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getOperation ()
    {
        return operation;
    }

    public void setOperation (String operation)
    {
        this.operation = operation;
    }

    public String getSystem ()
    {
        return system;
    }

    public void setSystem (String system)
    {
        this.system = system;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public String getEntity ()
    {
        return entity;
    }

    public void setEntity (String entity)
    {
        this.entity = entity;
    }

    public String getExecId ()
    {
        return execId;
    }

    public void setExecId (String execId)
    {
        this.execId = execId;
    }

    public String getSubsystem ()
    {
        return subsystem;
    }

    public void setSubsystem (String subsystem)
    {
        this.subsystem = subsystem;
    }

    public String getOriginator ()
    {
        return originator;
    }

    public void setOriginator (String originator)
    {
        this.originator = originator;
    }

    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    public String getDestination ()
    {
        return destination;
    }

    public void setDestination (String destination)
    {
        this.destination = destination;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", operation = "+operation+", system = "+system+", userId = "+userId+", entity = "+entity+", execId = "+execId+", subsystem = "+subsystem+", originator = "+originator+", lang = "+lang+", destination = "+destination+", country = "+country+"]";
    }
}