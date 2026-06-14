package Operations.Strategies;

import Operations.OperationsEnum;

public interface OperationExecutor {
    OperationsEnum getOperation();
    double Calculate(double value1, double value2);
}
