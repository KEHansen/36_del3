package boundary;

public class Text {
    public final static String[] TEXT =
            {
                    "How many players are you? (2-4 player) \n",
                    "Set player %d's name \n",
                    "Waiting for %s. Click ENTER to continue \n",
                    "%s has to pay 1M in order to get out of prison. \n",
                    "%s landed on chance and has to pick a chance card \n",
                    "The game is over. %s won \n"
            };

    public final static String[] CHANCETEXT =
            {
                    "%s landed on chance and has to pick a chance card \n",
                    "Move to START and receive 2M \n", // 1 chancecard
                    "Move UP TO 5 fields forward \n", // 2 chancecard
                    "Move to an ORANGE field if it's available you get it for free, if not paid the owner rent \n", // 3 chancecard
                    "Would you like to move 1 field or draw another CHANCECARD?\n", // 4 chancecard
                    "you ate to much candy, pay 2 M to the bank\n", // 5 chancecard
                    "Move to an ORANGE or a GREEN field if it's available you get it for free, if not paid the owner rent \n", // 6 chancecard
                    "Move to an PINK field if it's available you get it for free, if not paid the owner rent \n", // 7 chancecard
                    "you've been released from jail free of charge (keep this card "
                };

    public final static String[] interactiveTEXT =
            {
                    "How many fields do you wish move? (1-5 fields)\n",  // 2 chancecard
                    "Do you wish to move to (1) SKATER PARK or (2) SWIMMING POOL? \n", // 3 chancecard
                    "Do you wish to (1) move 1 field or (2) draw another \n", // 4
                    "Do you wish to move to (1) ORANGE or (2) GREEN? \n", // 6.1 chancecard
                    "you Chose ORANGE, which would you like to move to? (1) SKATER PARK or (2) SWIMMING POOL? \n", // 6.2 chancecard
                    "you Chose GREEN, which would you like to move to? (1) BOWLING ALLEY or (2) ZOO? \n", // 6.3 chancecard
                    "Do you wish to move to (1) CANDY SHOP or (2) IS-CREAM SHOP? \n", // 7 chancecard

            };
}
