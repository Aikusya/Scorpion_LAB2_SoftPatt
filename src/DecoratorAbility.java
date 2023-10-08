public abstract class DecoratorAbility implements IGetDescription {
    protected IGetDescription description;

    public DecoratorAbility(IGetDescription description){
        this.description = description;
    }


    @Override
    public String getDescription() {
        return description.getDescription();
    }

    @Override
    public double getCost() {
        return description.getCost();
    }
}
