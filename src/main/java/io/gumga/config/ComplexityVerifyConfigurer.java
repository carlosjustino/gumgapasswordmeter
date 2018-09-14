package io.gumga.config;

import io.gumga.business.ComplexityVerify;
import io.gumga.business.additions.*;
import io.gumga.business.deductions.*;
import io.gumga.business.entity.Metric;
import io.gumga.business.requirement.DefaultRequirementMetric;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
 * <b>Configuração geral</b><br>
 *
 * @author Carlos Eduardo Justino
 */
@Configuration
public class ComplexityVerifyConfigurer {


    /**
     * Base para implementação site: http://passwordmeter.com
     */
    @Bean
    public ComplexityVerify complexityVerify() {
        List<Metric> requirementMetrics = new ArrayList<>();
        requirementMetrics.add(new UppercaseLettersMetric());
        requirementMetrics.add(new LowercaseLettersMetric());
        requirementMetrics.add(new NumbersMetric());
        requirementMetrics.add(new SymbolsMetric());
        DefaultRequirementMetric requirement = new DefaultRequirementMetric(requirementMetrics);
        ComplexityVerify meter = new ComplexityVerify(requirement);
        meter.addMetric(requirementMetrics);
        meter.addMetric(new NumberOfCharactersMetric());
        meter.addMetric(new MiddleNumbersOrSymbolsMetric());
        meter.addMetric(new LettersOnlyMetric());
        meter.addMetric(new NumbersOnlyMetric());
        meter.addMetric(new ConsecutiveUppercaseLettersMetric());
        meter.addMetric(new ConsecutiveLowercaseLettersMetric());
        meter.addMetric(new ConsecutiveNumbersMetric());
        meter.addMetric(new SequentialLettersMetric());
        meter.addMetric(new SequentialNumbersMetric());
        meter.addMetric(new SequentialSymbolsMetric());
        meter.addMetric(new RepeatCharactersMetric());
        return meter;
    }
}
