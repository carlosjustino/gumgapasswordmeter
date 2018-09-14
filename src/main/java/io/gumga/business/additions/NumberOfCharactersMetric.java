package io.gumga.business.additions;

import io.gumga.business.entity.Metric;

/**
 * <b>Validação quantidade de caracteres informado</b><br>
 *
 * @author Carlos Eduardo Justino
 */

public class NumberOfCharactersMetric implements Metric {
    @Override
    public int count(String password) {
        return password.length();
    }

    @Override
    public int rate(int n, int len) {
        return +(n * 4);
    }
}
