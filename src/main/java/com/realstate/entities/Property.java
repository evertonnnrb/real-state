package com.realstate.entities;

import com.realstate.entities.enuns.CurrentSituation;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Property {
    private Integer block;
    private String batch;
    private BigDecimal saleValue;
    private CurrentSituation situation;
    private Owner owner;
    private LocalDate dateRegister;
    public Property() {
    }

    public Property(Integer block, String batch, BigDecimal saleValue, CurrentSituation situation, Owner owner, LocalDate dateRegister) {
        this.block = block;
        this.batch = batch;
        this.saleValue = saleValue;
        this.situation = situation;
        this.owner = owner;
        this.dateRegister = dateRegister;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public BigDecimal getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(BigDecimal saleValue) {
        this.saleValue = saleValue;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public CurrentSituation getSituation() {
        return situation;
    }

    public void setSituation(CurrentSituation situation) {
        this.situation = situation;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public String toString() {
        return "Property{block=" + block + ", batch='" + batch +
                ", saleValue=" + saleValue + "\nOwner " + owner.getName() +
                " situation " + situation +" Date register "+dateRegister+ '}';
    }
}
