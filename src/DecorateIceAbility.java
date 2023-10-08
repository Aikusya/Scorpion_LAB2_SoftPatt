public class DecorateIceAbility extends DecoratorAbility{

    public DecorateIceAbility(IGetDescription description) {
        super(description);
    }

    public String getDescription(){
        return super.getDescription() + " + Ice Ability.";
    }

    public double getCost(){
        return super.getCost() + 120.00;
    }
}
