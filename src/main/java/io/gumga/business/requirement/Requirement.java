package io.gumga.business.requirement;


import io.gumga.business.entity.Metric;

import java.util.List;

/**
 * @author Carlos Eduardo Justino
 */
public abstract class Requirement implements Metric {
    protected List<Metric> requiredMetrics;

    public Requirement(List<Metric> requiredMetrics) {
        this.requiredMetrics = requiredMetrics;
    }
}
