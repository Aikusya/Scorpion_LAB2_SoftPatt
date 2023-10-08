public class DecorateToxicAbility extends DecoratorAbility{
    public DecorateToxicAbility(IGetDescription description) {
        super(description);
    }

    public String getDescription(){
        return super.getDescription() + " + Toxic Ability.";
    }

    public double getCost(){
        return super.getCost() + 75.00;
    }
}
