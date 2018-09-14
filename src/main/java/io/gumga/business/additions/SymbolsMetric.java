package io.gumga.business.additions;

import io.gumga.business.entity.Metric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <b>Validação de simbolos que não sejam uma letras e nem numeros e apresente mais que uma correspondencia</b><br>
 *
 * @author Carlos Eduardo Justino
 */

public class SymbolsMetric implements Metric {
    private static final Pattern REGEX = Pattern.compile("([^a-zA-Z\\d\\s]+)");

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
        return +(n * 6);
    }
}
