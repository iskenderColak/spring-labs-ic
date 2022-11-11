package com.icolak.service;

import com.icolak.model.Product;

public class StockServiceImpl implements StockService{
    @Override
    public boolean checkStockIsAvailable(Product product, int quantity) {
        return product.getRemainingQuantity() > quantity;
    }
}
