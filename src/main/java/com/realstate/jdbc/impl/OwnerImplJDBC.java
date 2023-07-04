package com.realstate.jdbc.impl;

import com.realstate.entities.Owner;
import com.realstate.excpetion.DBException;
import com.realstate.jdbc.CRUDJDBC;
import com.realstate.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OwnerImplJDBC implements CRUDJDBC<Owner> {

    private Connection connection;

    public OwnerImplJDBC() {
        this.connection = ConnectionFactory.createConnection();
    }

    @Override
    public boolean save(Owner owner) {
        String sql = "insert into owner(name,fone) values (?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, owner.getName());
            pst.setString(2, owner.getFone());
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public boolean update(Owner owner) {
        String sql = "update owner set name = ?, fone = ? where id = ?";
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, owner.getName());
            pst.setString(2, owner.getFone());
            pst.setInt(3, owner.getId());
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public List<Owner> listByLimit(int i) {
        String sql = "select * from owner limit " + i;
        List<Owner> ownerList = new ArrayList<>();
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Owner owner = new Owner();
                owner.setId(rs.getInt("id"));
                owner.setName(rs.getString("name"));
                owner.setFone(rs.getString("fone"));
                ownerList.add(owner);
            }
            return ownerList;
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public boolean delete(int i) {
        String sql = "delete from owner where id = ?";
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setInt(1, i);
            return pst.execute();
        } catch (SQLException e) {
            throw new DBException(e.getMessage());
        }
    }
}
