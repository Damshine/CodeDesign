package com.github.mrs.impl;

import com.github.mrs.ICalculationArea;

/**
 * description:
 * date: 2023/6/20 19:15
 * author: MR.孙
 */
public class CalculationArea implements ICalculationArea {

    private final static double π = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
