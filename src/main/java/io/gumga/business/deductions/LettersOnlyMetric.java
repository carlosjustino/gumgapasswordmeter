package io.gumga.business.deductions;

import io.gumga.business.entity.Metric;

/**
 * <b>Dedução de repetição de letras</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class LettersOnlyMetric implements Metric {
    private static final String REGEX = "^[a-zA-Z\\s]*$";

    @Override
    public int count(String password) {
        return password.matches(REGEX) ? password.length() : 0;
    }

    @Override
    public int rate(int n, int len) {
        return -n;
    }
}
