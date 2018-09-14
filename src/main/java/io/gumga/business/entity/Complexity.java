package io.gumga.business.entity;

/**
 * <b>Complexidade</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public enum Complexity {
    VERY_WEAK("Muito fraco", 0, 20),
    WEAK("Fraco", 20, 40),
    GOOD("Bom", 40, 60),
    STRONG("Forte", 60, 80),
    VERY_STRONG("Muito Forte", 80, 101);

    private String name;
    private int min;
    private int max;

    Complexity(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public static String getComplexity(int score) {
        for (Complexity c : values()) {
            if (score >= c.min && score < c.max)
                return c.name;
        }
        return null;
    }


}
