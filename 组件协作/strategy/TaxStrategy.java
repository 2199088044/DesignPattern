package cn.dada.组件协作.strategy;

import java.math.BigDecimal;

public interface TaxStrategy {

    BigDecimal calculateTax(BigDecimal input);
}
