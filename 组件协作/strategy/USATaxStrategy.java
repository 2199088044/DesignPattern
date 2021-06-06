package cn.dada.组件协作.strategy;

import java.math.BigDecimal;
import java.util.Objects;

public class USATaxStrategy implements TaxStrategy {
    @Override
    public BigDecimal calculateTax(BigDecimal input) {
        if(Objects.nonNull(input)){
            return input.multiply(new BigDecimal("0.4"));
        } else {
            return null;
        }
    }
}