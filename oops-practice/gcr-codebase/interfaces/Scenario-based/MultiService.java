
interface StreamingService {

    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Active");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming Movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game: " + game);
    }

    @Override
    public void showSubscriptionDetails() {
        System.out.println("Streaming and Gaming Subscription Active");
    }
}

public class MultiService {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        String[] movies = {"Avengers", "Inception", "Titanic"};
        String[] games = {"PUBG", "Minecraft", "FIFA"};

        for (String movie : movies) {
            tv.streamMovie(movie);
        }
        for (String game : games) {
            tv.playGame(game);
        }

        tv.showSubscriptionDetails();
    }
}
