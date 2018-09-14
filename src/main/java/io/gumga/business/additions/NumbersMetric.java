package io.gumga.business.additions;

import io.gumga.business.entity.Metric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b>Validação de números</b><br>
 *
 * @author Carlos Eduardo Justino
 */

public class NumbersMetric implements Metric {
    private static final Pattern REGEX = Pattern.compile("([\\d]+)");

    @Override
    public int count(String password) {
        Matcher matcher = REGEX.matcher(password);
        int count = 0;
        while (matcher.find())
            count += matcher.group().length();
        return count;
    }

    @Override
    public int rate(int n, int len) {
        if (n > 0 && n < len)
            return (n * 4);
        return 0;
    }
}
