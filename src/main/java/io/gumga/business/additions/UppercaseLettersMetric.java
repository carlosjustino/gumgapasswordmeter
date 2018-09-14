package io.gumga.business.additions;

import io.gumga.business.entity.Metric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b>Validação de letras em caixa alta de "A" a "Z"</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class UppercaseLettersMetric implements Metric {
    private static final Pattern REGEX = Pattern.compile("([A-Z]+)");

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
            return +((len - n) * 2);
        return 0;
    }
}
