import java.util.stream.Stream;

public class TreeDecorator implements Tree
{

    private Tree tree;

    public TreeDecorator(Tree tree) {
        this.tree = tree;
    }


    @Override
    public String decorate() {
        return tree.decorate();
    }
}
