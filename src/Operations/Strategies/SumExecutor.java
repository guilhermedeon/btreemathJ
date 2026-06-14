package Operations.Strategies;

import Operations.OperationsEnum;

public class SumExecutor implements OperationExecutor{
    @Override
    public OperationsEnum getOperation() {
        return OperationsEnum.SUM;
    }

    @Override
    public double Calculate(double value1, double value2) {
        return value1 + value2;
    }
}
