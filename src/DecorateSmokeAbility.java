public class DecorateSmokeAbility extends DecoratorAbility{
    public DecorateSmokeAbility(IGetDescription description) {
        super(description);
    }

    public String getDescription(){
        return super.getDescription() + " + Smoke Ability.";
    }

    public double getCost(){
        return super.getCost() + 80.00;
    }
}
