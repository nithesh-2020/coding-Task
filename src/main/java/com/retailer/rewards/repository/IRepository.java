package com.retailer.rewards.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T,ID> {
    void add(T model);
    void delete(T model);
    List<T> list();

    Optional<T> get(ID id);
}
