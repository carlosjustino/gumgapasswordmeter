package io.gumga.business.deductions;

import io.gumga.business.entity.Metric;

/**
 * <b>Dedução de repetição de números</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class NumbersOnlyMetric implements Metric {
    private static final String REGEX = "^[\\d\\s]*$";

    @Override
    public int count(String password) {
        return password.matches(REGEX) ? password.length() : 0;
    }

    @Override
    public int rate(int n, int len) {
        return -n;
    }
}
