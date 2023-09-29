
public class Reward implements iGameItem{
    private String className;

    public Reward(String className) {
        this.className = className;
    }

    @Override
    public void open() {
        if (className.equals("GoldGenerator")) {
            System.out.println("Gold");
        } else {
            System.out.println("Gem");
        }
    }
}