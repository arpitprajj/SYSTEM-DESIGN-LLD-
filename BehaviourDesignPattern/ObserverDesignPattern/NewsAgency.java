import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    List<Observer> observers=new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer o) {

       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Breaking news! "+news);
        }
    }
    public void setNews(String news) {
        this.news=news;
        notifyObservers();


       
    }
    
}
