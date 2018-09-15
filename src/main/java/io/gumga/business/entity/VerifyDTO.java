package io.gumga.business.entity;

public class VerifyDTO {
    private String score;
    private String complexityString;
    private Complexity complexity;

    public VerifyDTO() {
    }

    public VerifyDTO(String score, Complexity complexity) {
        this.score = score;
        this.complexityString= complexity.getDescricao();
        this.complexity = complexity;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getComplexityString() {
        return complexityString;
    }

    public void setComplexityString(String complexityString) {
        this.complexityString = complexityString;
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public void setComplexity(Complexity complexity) {
        this.complexity = complexity;
    }
}
