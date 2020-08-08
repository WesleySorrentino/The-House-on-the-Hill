package ConsuleUI;

// Handles the flow of the story
public class StoryManager {
    private static final Chapters chapters = new Chapters();

    public static void startGame(String userName) {
        chapters.intro(userName);
        chapters.entry(userName);
    }
}
