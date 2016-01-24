package com.net.first;

import com.net.first.strategy.ConcreteStrategyA;
import com.net.first.strategy.ConcreteStrategyB;
import com.net.first.strategy.ConcreteStrategyC;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class Main {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
