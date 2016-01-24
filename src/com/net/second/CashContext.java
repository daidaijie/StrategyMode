package com.net.second;

import com.net.second.strategy.CashNormal;
import com.net.second.strategy.CashRebate;
import com.net.second.strategy.CashReturn;
import com.net.second.strategy.CashSuper;

/**
 * Created by daidaijie on 2016/1/24.
 */
public class CashContext {

    CashSuper cashSuper = null;

    public CashContext(String type) {

        switch (type) {

            case "正常收费":
                cashSuper = new CashNormal();
                break;

            case "满300返100":
                cashSuper = new CashReturn(300.0, 100.0);
                break;

            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }

    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
