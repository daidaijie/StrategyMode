package com.net.second.strategy;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
