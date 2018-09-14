package io.gumga.business.additions;

import io.gumga.business.entity.Metric;

/**
 * <b>Validação de números de um algorismo apenas ou simbolos que não sejam uma letra</b><br>
 *
 * @author Carlos Eduardo Justino
 */

public class MiddleNumbersOrSymbolsMetric implements Metric {
    private static final String REGEX = "[\\d]|[^a-zA-Z\\s]";

    @Override
    public int count(String password) {
        int count = 0;
        String pwd = password.replaceAll("\\s", "");
        int length = pwd.length();
        for (int i = 0; i < length; i++) {
            String c = pwd.substring(i, i + 1);
            boolean isMiddle = i > 0 && i < length - 1;
            if (c.matches(REGEX) && isMiddle)
                count++;
        }
        return count;
    }

    @Override
    public int rate(int n, int len) {
        return +(n * 2);
    }
}
