package com.github.mrs.impl;

/**
 * description:
 * date: 2023/6/20 19:18
 * author: MR.孙
 */
public class CalculationAreaExt extends CalculationArea{

    private final static double π = 3.141592653D;

    @Override
    public double circular(double r) {
        return π * r *r;
    }
}
