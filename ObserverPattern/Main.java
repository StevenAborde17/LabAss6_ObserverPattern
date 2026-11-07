public class Main {
    public static void main(String[] args) {
        System.out.println("=== News Notification on Real-Time ===");

        NewsAgency subject = new NewsAgency("TV5 News");

        // New subscribers
        Subscriber jackson = new User("Jackson");
        Subscriber emily = new User("Emily");
        Subscriber jacob = new User("Jacob");

        System.out.println("\n --New Subscribers-- ");
        subject.subscribe(jackson);
        subject.subscribe(emily);

        // Publish news
        System.out.println("\n --News Published--");
        subject.publish("The Asean Summit 2026 will be held in the Philippines.");

        //Subscribe and unsubscribe
        System.out.println("\n --User Subscription Status-- ");
        subject.subscribe(jacob);
        subject.unsubscribe(emily);

        System.out.println("\n --Latest News-- ");
        subject.publish("Rodil Zalameda is the new Chief Justice of the Supreme Court of the Philippines.");
    }
}