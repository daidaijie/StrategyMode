package com.net.second;

/**
 * Created by daidaijie on 2016/1/24.
 */
public class Main {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("打8折");
        System.out.println(cashContext.getResult(100.0));

    }
}
