package ConsuleUI;

// Handles the flow of the story
public class StoryManager {
    private static final Chapters chapters = new Chapters();

    public static void startGame() {
        chapters.intro();
        chapters.entry();
    }
}
