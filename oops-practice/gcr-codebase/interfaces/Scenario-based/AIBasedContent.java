interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad") || post.toLowerCase().contains("abuse") || post.toLowerCase().contains("hate");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy: Spam posts are not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println(post + " -> Offensive Post");
        }
    }

    public void checkSpam(String post) {
        if (post.toLowerCase().contains("buy now") ||
            post.toLowerCase().contains("click here")) {
            System.out.println(post + " -> Spam Post");
        }
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class AIBasedContent {
    public static void main(String[] args) {

        String[] posts = {
            "Hello everyone!",
            "Buy now and get 50% off",
            "You are bad",
            "Click here to win a prize",
            "I hate this",
            "Welcome to Java Programming"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();
        System.out.println();

        for (String post : posts) {

            boolean spam = post.toLowerCase().contains("buy now") ||
                           post.toLowerCase().contains("click here") ||
                           post.toLowerCase().contains("free");

            boolean offensive = TextModeration.containsRestrictedWords(post);

            moderator.checkSpam(post);
            moderator.checkOffensiveContent(post);

            if (!spam && !offensive) {
                System.out.println(post + " -> Valid Post");
            }

            System.out.println();
        }
    }
}