package com.net.second.strategy;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1.0;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return moneyRebate * money;
    }
}
