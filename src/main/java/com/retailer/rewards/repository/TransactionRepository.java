package com.retailer.rewards.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.retailer.rewards.entity.Transaction;

@org.springframework.stereotype.Repository
public class TransactionRepository extends Repository<Transaction,Long> {
    public  TransactionRepository()
    {
        Transaction t1 = new Transaction();
        t1.setCustomerId(1L);
        t1.setTransactionId(101L);
        t1.setTransactionDate(Timestamp.valueOf("2023-01-04 10:10:10.0"));
        t1.setTransactionAmount(120);
        add(t1);

        Transaction t2 = new Transaction();
        t2.setCustomerId(1L);
        t2.setTransactionId(102L);
        t2.setTransactionDate(Timestamp.valueOf("2022-12-15 10:10:10.0"));
        t2.setTransactionAmount(85);
        add(t2);

        Transaction t3 = new Transaction();
        t3.setCustomerId(1L);
        t3.setTransactionId(103L);
        t3.setTransactionDate(Timestamp.valueOf("2022-12-04 10:10:10.0"));
        t3.setTransactionAmount(160);
        add(t3);
    }
    public List<Transaction> findAllByCustomerId(Long customerId) {
        return list().stream().filter(k->k.getCustomerId().equals(customerId)).collect(Collectors.toList());
    }

    public List<Transaction> findAllByCustomerIdAndTransactionDateBetween(Long customerId, Timestamp from, Timestamp to) {
        return findAllByCustomerId(customerId).stream().filter(k-> k.getTransactionDate().after(from) && k.getTransactionDate().before(to)).collect(Collectors.toList());
    }

    @Override
    public Optional<Transaction> get(Long aLong) {
        return list().stream().filter(k->k.getTransactionId().equals(aLong)).findFirst();
    }
}
