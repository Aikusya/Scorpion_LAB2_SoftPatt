public class Main {
    public static void main(String[] args) {

        IGetDescription scorpion = new BaseDescription();
        System.out.println(scorpion.getDescription() + " Power Cost: " + scorpion.getCost());

        IGetDescription scorpionIce1 = new DecorateIceAbility(scorpion);
        System.out.println(scorpionIce1.getDescription() + " Power Cost: " + scorpionIce1.getCost());

        IGetDescription scorpionSmoke1 = new DecorateSmokeAbility(scorpionIce1);
        System.out.println(scorpionSmoke1.getDescription() + " Power Cost: " + scorpionSmoke1.getCost());

        IGetDescription scorpionToxic1 = new DecorateToxicAbility(scorpionSmoke1);
        System.out.println(scorpionToxic1.getDescription() + " Power Cost: " + scorpionToxic1.getCost());

        IGetDescription scorpionSmoke2 = new DecorateSmokeAbility(scorpionIce1);
        System.out.println(scorpionSmoke2.getDescription() + " Power Cost: " + scorpionSmoke2.getCost());

        IGetDescription scorpionIce2 = new DecorateIceAbility(scorpionToxic1);
        System.out.println(scorpionIce2.getDescription() + " Power Cost: " + scorpionIce2.getCost());
    }
}