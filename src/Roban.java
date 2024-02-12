public class Roban extends TreeDecorator{
    public Roban(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithRoban();
    }

    private String decorateWithRoban(){
        return " with red roban";
    }
}
