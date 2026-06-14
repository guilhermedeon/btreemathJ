package Nodes;

public class ValueNode extends BaseNode {
    private final double value;

    public ValueNode(double value) {
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
