package Nodes;

import Operations.OperationsEnum;

public class OperationNode extends BaseNode {
    private final BaseNode leftNode;
    private final BaseNode rightNode;
    private final OperationsEnum operation;

    public OperationNode(BaseNode leftNode, BaseNode rightNode, OperationsEnum operation) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.operation = operation;
    }

    public BaseNode getLeftNode() {
        return leftNode;
    }

    public BaseNode getRightNode() {
        return rightNode;
    }

    public OperationsEnum getOperation() {
        return operation;
    }
}
