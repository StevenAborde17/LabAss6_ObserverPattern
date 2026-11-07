class User implements Subscriber {
    private String user;

    public User(String user) {
        this.user = user;
    }

    @Override
    public void newsUpdate(String channel, String news) {
        System.out.println(user + " received news from " + channel + ": " + news);
    }

    @Override
    public String getUser() {
        return user;
    }
}