public class ObserverPattern {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);

        newsAgency.setNews("New Java version released!");
    }
}
