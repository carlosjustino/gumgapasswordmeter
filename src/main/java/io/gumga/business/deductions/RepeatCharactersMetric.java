package io.gumga.business.deductions;

import io.gumga.business.entity.Metric;

/**
 * <b>Repetição de Caracteres</b><br>
 *
 * @author Carlos Eduardo Justino
 */

public class RepeatCharactersMetric implements Metric {
    private Double nRepInc = 0d;

    @Override
    public int count(String password) {
        int count = 0;
        int length = password.length();
        for (int a = 0; a < length; a++) {
            boolean bCharExists = false;
            for (int b = 0; b < length; b++) {
                if (password.charAt(a) == password.charAt(b) && a != b) {
                    bCharExists = true;
                    nRepInc += Math.abs((float) length / (b - a));
                }
            }
            if (bCharExists) {
                count++;
                int nUnqChar = length - count;
                nRepInc = (nUnqChar != 0) ? Math.ceil(nRepInc / nUnqChar) : Math.ceil(nRepInc);
            }
        }
        return count;
    }

    @Override
    public int rate(int n, int len) {
        int rate = -nRepInc.intValue();
        nRepInc = 0d;
        return rate;
    }
}
