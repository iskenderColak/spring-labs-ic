package com.icolak.service;

import com.icolak.model.Product;

public interface StockService {
    boolean checkStockIsAvailable(Product product, int quantity);
}
