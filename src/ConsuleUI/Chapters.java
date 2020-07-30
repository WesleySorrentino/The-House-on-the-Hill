package ConsuleUI;

import Assets.Player;

import static Utilities.Utilities.slowTextScroll;

public class Chapters {
    private static Player jake = new Player("Jake");
//  Displays text for the intro
    public void intro() {
        String introText =
                "Intro: " +
                        "September 13th, It’s the beginning of the school year. Everyday on your way to school every year,\n" +
                        "You pass by this house on the hill. It has been deteriorating and has been covered with vines for several years.\n" +
                        "Once you get to school you tell your best friend.\n" +

                        "\nJake: Hey Mark, We should go explore the house on the hill after school\n" +
                        "\nMark: Have you been reading your dads hardy books again?\n" +
                        "\nJake: Yes, but that’s not the point, According to this newspaper (pulls out newspaper)\n" +
                        "Date is 1990, It says the owners got up and left, leaving everything behind. No one knows Why they left.\n" +
                        "\nMark: Do you know how dangerous it is? There could be ghosts!\n" +
                        "\nJake: Ghosts don't exist Mark. Have you ever watched Scooby doo?\n" +
                        "\nThere is always a person behind the monster or ghost.\n" +
                        "\nMark: Of course I watch Scooby doo you numb nut, let me think about it\n" +
                        "\nNarrator: Mark walks to class and follows\n" +
                        "\nNarrator: The time is now 4:00..\n" +
                        "\nJake: What do you say Mark?\n" +
                        "\nMark: You know what Jake, I'm in.\n" +
                        "\nJake: Awesome, we will go on Saturday. We can tell our parent we are just going to hangout in town.\n" +
                        "\nNarrator: The day is now Saturday the boys pack the supplies they might need for the exploration, with them being Boy Scouts they know to Be Prepared.\n";
        slowTextScroll(introText,1100);
    }
//  Display's text for the first chapter
    public void entry() {
        String entryText =
                "Chapter 1 - Entry\n" +
                        "\nNarrator: Mark and Jake both agreed to meet at Jake's house..\n" +
                        "\nMark: (Knocks on door)\n" +
                        "\nJake's Mom: Hey Mark, it's nice to see you.\n" +
                        "\nMark: Hello Ms. Jake's mom, Is Jake ready?\n" +
                        "\nJake's Mom: Let me go see if he is.\n" +
                        "\nJake's Mom: (Shouts from downstairs) Jake! Mark is here!\n" +
                        "\nJake's Mom: He's in his room Mark, You can come on in.\n" +
                        "\nMark: Thanks, Ms. Jake's Mom.\n" +
                        "\nNarrator: Mark heads upstairs to Jake's room.\n" +
                        "\nJake: Did you bring supplies?\n" +
                        "\nMark: Yep, I brought. One flashlight, My First aid kit we made last Boy Scout meeting,\n" +
                        "some snacks and my pocket knife. What did you bring?\n" +
                        "\nJake: I packed Two flashlights, I wanted to make sure we were prepared,\n" +
                        "I got some water bottles from my fridge just in case we need them,\n" +
                        "and I brought my favorite pocket knife.\n" +
                        "\nMark: We've got food and water covered as well as some flashlights.\n" +
                        "Are we ready to head out?\n" +
                        "\nJake: Let's head out.\n" +
                        "\nNarrator: The boys head out on their journey. After a 10 minute walk they reach the house.." +
                        "\nMark: Well we are here, what's the plan Jake?\n" +
                        "\nJake: We can either go through the main gate or we can go around the back of the house.\n" +
                        "\nMark: Its your call, What are going to do?";
        slowTextScroll(entryText,800);
    }
}
