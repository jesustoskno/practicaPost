package com.practicapost.jtoscano.practicapost.models.FNListOut;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class ListMemberBasicInfo {
    private String maxNFL;

    private ListMember[] listMember;

    private String listId;

    private String listType;

    public String getMaxNFL ()
    {
        return maxNFL;
    }

    public void setMaxNFL (String maxNFL)
    {
        this.maxNFL = maxNFL;
    }

    public ListMember[] getListMember ()
    {
        return listMember;
    }

    public void setListMember (ListMember[] listMember)
    {
        this.listMember = listMember;
    }

    public String getListId ()
    {
        return listId;
    }

    public void setListId (String listId)
    {
        this.listId = listId;
    }

    public String getListType ()
    {
        return listType;
    }

    public void setListType (String listType)
    {
        this.listType = listType;
    }

}


