package com.quickpay.controller;

import com.quickpay.dao.TransactionDao;
import com.quickpay.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private TransactionDao transactionDao;

    public TransactionController(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }


    @GetMapping
    public List<Transaction> listAllTransactions() {
        return transactionDao.listAllTransactions();
    }

    @PostMapping
    public void createTransaction(Transaction transaction) {
        transactionDao.createTransaction(transaction);
    }

    @PutMapping
    public void updateTransaction(Transaction transaction) {
        transactionDao.updateTransaction(transaction);
    }
}
