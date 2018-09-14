package io.gumga.business.entity;

/**
 * <b>Validação</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public interface Metric {
    int count(String pass);

    int rate(int n, int len);
}
