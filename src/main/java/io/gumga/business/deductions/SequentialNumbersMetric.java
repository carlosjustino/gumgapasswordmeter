package io.gumga.business.deductions;

import io.gumga.business.entity.Metric;

/**
 * <b>Sequencia de numeros de "0" a "9"</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class SequentialNumbersMetric implements Metric {
    private static final String NUMBERS = "0123456789";

    @Override
    public int count(String password) {
        int count = 0;
        for (int i = 0; i < (NUMBERS.length() - 3); i++) {
            String fwd = NUMBERS.substring(i, i + 3);
            String rev = new StringBuilder(fwd).reverse().toString();
            if (password.toLowerCase().contains(fwd) || password.toLowerCase().contains(rev))
                count++;
        }
        return count;
    }

    @Override
    public int rate(int n, int len) {
        return -(n * 3);
    }
}
