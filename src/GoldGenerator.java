public class GoldGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Create new box");
        return new Reward("GoldGenerator");
    }

}
