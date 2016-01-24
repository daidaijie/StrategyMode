package com.net.first;

import com.net.first.strategy.Strategy;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterFace();
    }
}
