package app.controller;

import app.entity.Buyer;
import app.entity.Purchase;
import app.model.impl.AppBaseModel;
import app.model.impl.AppDeliveryModel;
import app.utils.Rounder;
import app.view.AppView;

public class AppController {
    private final AppView view = new AppView();
    private final static String CURRENCY = "USD";

    public void getPayment() {
        String[] data = view.getData();
        Buyer buyer = getBuyer(data);
        Purchase purchase = getPurchase(data);
        String output;
        String word = "no";
        if (data [2].equals(word)) {
            AppBaseModel model = new AppBaseModel();
            String payment = Rounder.roundValue(model.calcPayment(purchase));
            output = "\nBuyer: " + buyer.getName() + ", " + buyer.getPhone() +
                    "\nPayment is " + CURRENCY + " " + payment;
            view.getOutput(output);
        } else {
            AppDeliveryModel model = new AppDeliveryModel();
            String payment = Rounder.roundValue(model.calcPayment(purchase));
            output = "\nBuyer: " + buyer.getName() + ", " + buyer.getPhone() + buyer.getAddress() +
                    "\nPayment is " + CURRENCY + " " + payment;
            view.getOutput(output);
        }
    }

    private Buyer getBuyer(String[] data) {
        return new Buyer (data[0], data[1], data[2]);
    }

    private Purchase getPurchase(String[] data) {
        return new Purchase(Integer.parseInt(data[2]),
                Double.parseDouble(data[3]));
    }
}
