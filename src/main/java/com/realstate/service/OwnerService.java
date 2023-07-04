package com.realstate.service;

import com.realstate.entities.Owner;
import com.realstate.jdbc.impl.OwnerImplJDBC;

import java.util.List;

public class OwnerService {
    OwnerImplJDBC implJDBC = new OwnerImplJDBC();

    public boolean insert(Owner owner) {
        return implJDBC.save(owner);
    }

    public boolean update(Owner owner) {
        return implJDBC.update(owner);
    }

    public List<Owner> findByLimit(int i) {
        return implJDBC.listByLimit(i);
    }

    public boolean delete(int i) {
        return implJDBC.delete(i);
    }

}
