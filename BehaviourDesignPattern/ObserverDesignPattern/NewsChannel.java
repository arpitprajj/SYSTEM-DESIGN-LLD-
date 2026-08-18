public class NewsChannel implements Observer{
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("News Channel '" + name + "' received message: " + message);
    }
    
}
