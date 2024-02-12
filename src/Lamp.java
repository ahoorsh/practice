public class Lamp extends TreeDecorator{
    @Override
    public String decorate() {
        return super.decorate() + decorateWithLamp();
    }

    public Lamp(Tree tree) {
        super(tree);
    }
    private String decorateWithLamp(){
        return " with blue lamp";
    }
}
