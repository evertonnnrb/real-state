package com.realstate.entities.enuns;

public enum CurrentSituation {
    FOR_SALE("For sale"),
    IN_NEGOCIATION("In negociation"),
    SOLD("Sold");

    private String status;

    CurrentSituation(String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
