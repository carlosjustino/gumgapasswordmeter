package io.gumga.business;

import io.gumga.business.entity.Complexity;
import io.gumga.business.entity.Metric;
import io.gumga.business.entity.VerifyDTO;
import io.gumga.business.requirement.Requirement;

import java.util.ArrayList;
import java.util.List;


/**
 * <b>Validação conforme site:	http://passwordmeter.com</b><br>
 *
 * @author Carlos Eduardo Justino
 */
public class ComplexityVerify {

    private List<Metric> metrics;

    private Requirement necessidade;

    public ComplexityVerify(Requirement necessidade) {
        this.necessidade = necessidade;
        this.metrics = new ArrayList<>();
        this.metrics.add(necessidade);
    }

    public void addMetric(Metric metric) {
        metrics.add(metric);
    }

    public void addMetric(List<Metric> metrics) {
        this.metrics.addAll(metrics);
    }

    private int score(String password) {
        int len = password.length();
        int score = 0;
        for (Metric m : this.metrics) {
            int n = m.count(password);
            int bonus = m.rate(n, len);
            score += bonus;
        }
        return checkRange(score);
    }

    private int checkRange(int score) {
        if (score < 0)
            return 0;
        else if (score > 100)
            return 100;
        else
            return score;
    }

    public VerifyDTO verify(String password) {
        int score = score(password);
        return new VerifyDTO(score + " %", Complexity.getComplexity(score));
    }
}
