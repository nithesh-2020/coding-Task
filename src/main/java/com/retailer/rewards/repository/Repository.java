package com.retailer.rewards.repository;

import java.util.LinkedList;
import java.util.List;

public abstract class Repository<T,ID> implements IRepository<T,ID>{
    private List<T> db;
    public Repository(){
        this.db = new LinkedList<>();
    }
    @Override
    public void add(T model) {
        this.db.add(model);
    }

    @Override
    public void delete(T model) {
        this.db.remove(model);
    }

    @Override
    public List<T> list() {
        return db;
    }

}
