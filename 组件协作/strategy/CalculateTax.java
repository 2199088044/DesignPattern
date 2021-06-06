package cn.dada.组件协作.strategy;

import java.math.BigDecimal;

public class CalculateTax {
    private TaxStrategy strategy;

    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculateTax(BigDecimal input) {
        return strategy.calculateTax(input);
    }

    public static void main(String[] args) {
        // todo 可利用工厂模式优化为自动选择策略？
        TaxStrategy cnTax = new CNTaxStrategy();
        TaxStrategy usaTax = new USATaxStrategy();

        CalculateTax taxCalculator = new CalculateTax();
        taxCalculator.setStrategy(cnTax);
        System.out.println("cn tax:" + taxCalculator.calculateTax(new BigDecimal("1000")));

        taxCalculator.setStrategy(usaTax);
        System.out.println("usa tax:" + taxCalculator.calculateTax(new BigDecimal("1000")));
    }
}
