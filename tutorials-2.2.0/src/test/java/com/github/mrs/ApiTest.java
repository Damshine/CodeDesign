package com.github.mrs;

import com.github.mrs.impl.CalculationAreaExt;
import org.junit.Test;


public class ApiTest {

    @Test
    public void testCalculationAreaExt() {

        ICalculationArea iCalculationArea = new CalculationAreaExt();
        double circular = iCalculationArea.circular(10);
        System.out.println(circular);
    }
}
