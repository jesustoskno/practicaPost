package com.practicapost.jtoscano.practicapost.models.FNListOut;

/**
 * Created by jtoscano on 07/12/2015.
 */
public class FrequentNumberList {
    private String promotionId;

    private String description;

    private String availableFrequentNumbers;

    private Current Current;

    private String opCost;

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailableFrequentNumbers() {
        return availableFrequentNumbers;
    }

    public void setAvailableFrequentNumbers(String availableFrequentNumbers) {
        this.availableFrequentNumbers = availableFrequentNumbers;
    }

    public Current getCurrent() {
        return Current;
    }

    public void setCurrent(Current Current) {
        this.Current = Current;
    }

    public String getOpCost() {
        return opCost;
    }

    public void setOpCost(String opCost) {
        this.opCost = opCost;
    }


}


