package com.practicapost.jtoscano.practicapost.models.rateplanout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class HeaderOut {
    private String timestamp;

    private String msgId;

    private String execId;

    private String msgType;

    private String pid;

    private String originator;

    private String destination;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getMsgId ()
    {
        return msgId;
    }

    public void setMsgId (String msgId)
    {
        this.msgId = msgId;
    }

    public String getExecId ()
    {
        return execId;
    }

    public void setExecId (String execId)
    {
        this.execId = execId;
    }

    public String getMsgType ()
    {
        return msgType;
    }

    public void setMsgType (String msgType)
    {
        this.msgType = msgType;
    }

    public String getPid ()
    {
        return pid;
    }

    public void setPid (String pid)
    {
        this.pid = pid;
    }

    public String getOriginator ()
    {
        return originator;
    }

    public void setOriginator (String originator)
    {
        this.originator = originator;
    }

    public String getDestination ()
    {
        return destination;
    }

    public void setDestination (String destination)
    {
        this.destination = destination;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", msgId = "+msgId+", execId = "+execId+", msgType = "+msgType+", pid = "+pid+", originator = "+originator+", destination = "+destination+"]";
    }
}
