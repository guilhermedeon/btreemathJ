import Nodes.BaseNode;
import Nodes.OperationNode;
import Nodes.ValueNode;
import Operations.OperationExecutorFactory;
import Operations.Strategies.OperationExecutor;

import java.security.InvalidParameterException;
import java.util.Optional;

public class TreeExpressionRunner {
    private final OperationExecutorFactory operationExecutorFactory;

    public TreeExpressionRunner(OperationExecutorFactory operationExecutorFactory) {
        this.operationExecutorFactory = operationExecutorFactory;
    }

    public double Compute(BaseNode root)
    {
        if (root == null)
            throw new IllegalArgumentException("node cannot be null");

        if (root.getClass() == ValueNode.class)
            return ((ValueNode) root).getValue();

        OperationNode current = (OperationNode) root;

        double leftValue = Compute(current.getLeftNode());
        double rightValue = Compute(current.getRightNode());

        Optional<OperationExecutor> executorOptional = operationExecutorFactory.getStrategy(current.getOperation());

        if (executorOptional.isEmpty())
            throw new InvalidParameterException("Operation not implemented");

        return executorOptional.get().Calculate(leftValue, rightValue);
    }
}
