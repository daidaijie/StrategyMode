package com.net.second.strategy;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }


    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - (int) (money / moneyCondition) * moneyReturn;
        }

        return result;
    }
}
