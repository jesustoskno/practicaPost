package com.practicapost.jtoscano.practicapost.models.rateplanout;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class RatePlan
{
    private String namePlan;

    private String description;

    private String rentPlan;

    private String name;

    private String type;

    private String rfc;

    public String getNamePlan ()
    {
        return namePlan;
    }

    public void setNamePlan (String namePlan)
    {
        this.namePlan = namePlan;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getRentPlan ()
    {
        return rentPlan;
    }

    public void setRentPlan (String rentPlan)
    {
        this.rentPlan = rentPlan;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getRfc ()
    {
        return rfc;
    }

    public void setRfc (String rfc)
    {
        this.rfc = rfc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [namePlan = "+namePlan+", description = "+description+", rentPlan = "+rentPlan+", name = "+name+", type = "+type+", rfc = "+rfc+"]";
    }
}