package app.model.impl;

import app.entity.Purchase;

public class AppBaseModel {

    public double calcPayment(Purchase purchase) {
        return purchase.getQuota() * purchase.getPrice();
    }
}
