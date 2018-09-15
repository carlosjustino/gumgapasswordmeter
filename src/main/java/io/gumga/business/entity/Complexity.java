package io.gumga.business.entity;

/**
 * <b>Complexidade</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public enum Complexity {
    VERY_WEAK("Muito fraca", 0, 20),
    WEAK("Fraca", 20, 40),
    GOOD("Boa", 40, 60),
    STRONG("Forte", 60, 80),
    VERY_STRONG("Muito Forte", 80, 101);

    private String descricao;
    private int min;
    private int max;

    Complexity(String name, int min, int max) {
        this.descricao = name;
        this.min = min;
        this.max = max;
    }

    public static Complexity getComplexity(int score) {
        for (Complexity c : values()) {
            if (score >= c.min && score < c.max)
                return c;
        }
        return null;
    }

    public String getDescricao() {
        return descricao;
    }
}
