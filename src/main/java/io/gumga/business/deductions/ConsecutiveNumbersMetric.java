package io.gumga.business.deductions;

import io.gumga.business.entity.Metric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b>Dedução de repetição de números</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class ConsecutiveNumbersMetric implements Metric {
    private static final Pattern REGEX = Pattern.compile("([\\d]{2,})");

    @Override
    public int count(String password) {
        Matcher matcher = REGEX.matcher(password.replaceAll("\\s", ""));
        int count = 0;
        while (matcher.find())
            count += (matcher.group().length() - 1);
        return count;
    }

    @Override
    public int rate(int n, int len) {
        return -(n * 2);
    }
}
