package io.gumga.business.deductions;

import io.gumga.business.entity.Metric;

/**
 * <b>Sequencia de letras idependente a formatação da caixa de "a" a "Z"</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class SequentialLettersMetric implements Metric {
    private static final String LETTERS = "abcdefghijklmnopqrstuvxwyz";

    @Override
    public int count(String password) {
        int count = 0;
        for (int i = 0; i < (LETTERS.length() - 3); i++) {
            String fwd = LETTERS.substring(i, i + 3);
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
