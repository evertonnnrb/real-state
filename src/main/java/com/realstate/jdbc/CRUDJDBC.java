package com.realstate.jdbc;

import java.util.List;

public interface CRUDJDBC<T> {
    boolean save(T t);
    boolean update(T t);
    List<T> listByLimit(int i);
    boolean delete(int i);
}
