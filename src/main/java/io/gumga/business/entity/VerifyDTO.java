package io.gumga.business.entity;

public class VerifyDTO {
    private String score;
    private String complexity;

    public VerifyDTO() {
    }

    public VerifyDTO(String score, String complexity) {
        this.score = score;
        this.complexity = complexity;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }
}
