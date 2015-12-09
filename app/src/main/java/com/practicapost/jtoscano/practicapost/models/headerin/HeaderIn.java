package com.practicapost.jtoscano.practicapost.models.headerin;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class HeaderIn {
    @SerializedName("country")
    private String Country;

    @SerializedName("destination")
    private String Destination;

    @SerializedName("entity")
    private String Entity;

    @SerializedName("execId")
    private String ExecId;

    @SerializedName("lang")
    private String Lang;

    @SerializedName("operation")
    private String Operation;

    @SerializedName("originator")
    private String Originator;

    @SerializedName("subsystem")
    private String Subsystem;

    @SerializedName("system")
    private String System;

    @SerializedName("timestamp")
    private String Timestamp;

    @SerializedName("userId")
    private String UserId;

    @SerializedName("metodo")
    private String Metodo;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getEntity() {
        return Entity;
    }

    public void setEntity(String entity) {
        Entity = entity;
    }

    public String getExecId() {
        return ExecId;
    }

    public void setExecId(String execId) {
        ExecId = execId;
    }

    public String getLang() {
        return Lang;
    }

    public void setLang(String lang) {
        Lang = lang;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public String getOriginator() {
        return Originator;
    }

    public void setOriginator(String originator) {
        Originator = originator;
    }

    public String getSubsystem() {
        return Subsystem;
    }

    public void setSubsystem(String subsystem) {
        Subsystem = subsystem;
    }

    public String getSystem() {
        return System;
    }

    public void setSystem(String system) {
        System = system;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String metodo) {
        Metodo = metodo;
    }
}
