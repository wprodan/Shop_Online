package app.model.impl;

import app.entity.Purchase;
import app.model.impl.AppBaseModel;

public class AppDeliveryModel extends AppBaseModel {

    double deliveryRate = 5;

    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuota() * purchase.getPrice();
            return cost + cost * deliveryRate / 100;
        }
}