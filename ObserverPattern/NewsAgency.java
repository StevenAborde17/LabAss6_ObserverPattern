import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String name;
    private List<Subscriber> subs = new ArrayList<>();

    public NewsAgency(String name) {
        this.name = name;
    }

    public void subscribe(Subscriber sub) {
        subs.add(sub);
        System.out.println(sub.getUser() + " subscribed to " + name);
    }

    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
        System.out.println(sub.getUser() + " unsubscribed from " + name);
    }

    public void publish(String news) {
        for (Subscriber sub : subs) {
            sub.newsUpdate(name, news);
        }
    }
}