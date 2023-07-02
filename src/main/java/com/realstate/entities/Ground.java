package com.realstate.entities;

import com.realstate.entities.enuns.CurrentSituation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Ground extends Property {
    private Integer id;
    private Double squareMeters;

    public Ground() {
    }

    public Ground(Integer id, Double squareMeters) {
        super();
        this.id = id;
        this.squareMeters = squareMeters;
    }

    public Ground(Integer block, String batch, BigDecimal saleValue,
                  CurrentSituation situation, Owner owner, LocalDate dateRegister
            , Integer id, Double squareMeters) {
        super(block, batch, saleValue, situation, owner, dateRegister);
        this.id = id;
        this.squareMeters = squareMeters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Double squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ground ground = (Ground) o;
        return Objects.equals(id, ground.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return super.toString() + " Ground{" +
                "id=" + id +
                ", squareMeters=" + squareMeters +
                '}';
    }
}

