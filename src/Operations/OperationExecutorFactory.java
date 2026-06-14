package Operations;

import Operations.Strategies.OperationExecutor;
import Operations.Strategies.SumExecutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OperationExecutorFactory {
    private final HashMap<OperationsEnum, OperationExecutor> executorMap;

    public OperationExecutorFactory() {
        List<OperationExecutor> executorList = new ArrayList<>();

        executorList.add(new SumExecutor());

        this.executorMap = new HashMap<>();
        executorList.forEach(t -> this.executorMap.put(t.getOperation(), t));
    }

    public Optional<OperationExecutor> getStrategy(OperationsEnum operationsEnum)
    {
        var strat = executorMap.getOrDefault(operationsEnum, null);

        return strat == null ? Optional.empty() : Optional.of(strat);
    }
}
