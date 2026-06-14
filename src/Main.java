import Nodes.OperationNode;
import Nodes.ValueNode;
import Operations.OperationExecutorFactory;
import Operations.OperationsEnum;

void main() {
    ValueNode n1 = new ValueNode(1);
    ValueNode n2 = new ValueNode(1);
    ValueNode n3 = new ValueNode(1);
    ValueNode n4 = new ValueNode(1);

    OperationNode child1 = new OperationNode(n1, n2, OperationsEnum.SUM);
    OperationNode child2 = new OperationNode(n3, n4, OperationsEnum.SUM);
    OperationNode root = new OperationNode(child1, child2, OperationsEnum.SUM);

    TreeExpressionRunner runner = new TreeExpressionRunner(new OperationExecutorFactory());

    System.out.println("Result = " + runner.Compute(root));
}
