public class GemGenerator extends ItemFabric{


    @Override
    public iGameItem createItem() {
        System.out.println("Create new gem");
        return new Reward("GemGenerator");
    }



}
