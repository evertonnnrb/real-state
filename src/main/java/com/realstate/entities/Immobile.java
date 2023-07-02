package com.realstate.entities;

import com.realstate.entities.enuns.CurrentSituation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Immobile extends Property {
    private Integer id;

    private Double buildinArea;

    private boolean isCondominium;

    public Immobile() {
    }

    public Immobile(Integer id, Double buildinArea, boolean isCondominium) {
        this.id = id;
        this.buildinArea = buildinArea;
        this.isCondominium = isCondominium;
    }

    public Immobile(Integer block, String batch, BigDecimal saleValue,
                    CurrentSituation situation, Owner owner,
                    LocalDate dateRegister, Integer id, Double buildinArea,
                    boolean isCondominium) {
        super(block, batch, saleValue, situation, owner, dateRegister);
        this.id = id;
        this.buildinArea = buildinArea;
        this.isCondominium = isCondominium;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBuildinArea() {
        return buildinArea;
    }

    public void setBuildinArea(Double buildinArea) {
        this.buildinArea = buildinArea;
    }

    public boolean isCondominium() {
        return isCondominium;
    }

    public void setCondominium(boolean condominium) {
        isCondominium = condominium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Immobile immobile = (Immobile) o;
        return Objects.equals(id, immobile.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return super.toString()+"\nImmobile{" +
                "id=" + id +
                ", buildinArea=" + buildinArea +
                ", isCondominium=" + isCondominium +
                '}';
    }
}
