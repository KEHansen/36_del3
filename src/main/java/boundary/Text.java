package boundary;

public class Text {
    public final static String[] TEXT =
            {
                    "How many players are you? (2-4 player) \n",
                    "Set player %d's name \n",
                    "Waiting for %s. Click ENTER to continue \n",
                    "%s has to pay 1M in order to get out of prison. \n",
                    "%s landed on chance and has to draw a chance card \n",
                    "%s chose to draw another card \n",
                    "The game is over. %s won \n"
            };

    public final static String[] CHANCETEXT =
            {
                    "%s landed on chance and has to pick a chance card \n",
                    // ---------------------- 1 ChanceCard ------------------------------
                    "Move to START and receive 2M \n", // 2 ChanceCard
                    "Move UP TO 5 fields forward \n", // 3 ChanceCard
                    "Move to an ORANGE field if it's available you get it for free, if not paid the owner rent \n", // 4 ChanceCard
                    // ---------------------- 5 ChanceCard ------------------------------
                    "Would you like to move 1 field or draw another CHANCECARD?\n", // 6 ChanceCard
                    "you ate to much candy, pay 2 M to the bank\n", // 7 ChanceCard
                    "Move to an ORANGE or a GREEN field if it's available you get it for free, if not paid the owner rent \n", // 8 ChanceCard
                    "Move to an PINK field if it's available you get it for free, if not paid the owner rent \n", // 9 ChanceCard
                    "you've been released from jail free of charge (keep this card, until you can use it)\n ", // 10 ChanceCard
                    "move to SEAFRONT\n", //11 ChanceCard
                    // ---------------------- 12 ChanceCard ------------------------------
                    // ---------------------- 13 ChanceCard ------------------------------
                    "ITS YOUR BIRTHDAY!!, everyone happily gift you 1M :)\n", // 14 chance card
                    "Move to an MAGENTA or a CYAN field if it's available you get it for free, if not paid the owner rent \n", // 15 ChanceCard
                    "you have done all of your homework, you receive 2M\n ", // 16 chanceCard
                    "Move to an RED field if it's available you get it for free, if not paid the owner rent \n", // 17 ChanceCard
};

    public final static String[] interactiveTEXT =
            {
                    // ---------------------- 1 ChanceCard ------------------------------
                    "How many fields do you wish move? (1-5 fields)\n",  // 3 ChanceCard
                    "Do you wish to move to (1) SKATER PARK or (2) SWIMMING POOL? \n", // 4 ChanceCard
                    // ---------------------- 5 ChanceCard ------------------------------
                    "Do you wish to (1) move 1 field or (2) draw another \n", // 6 ChanceCard

                    "Do you wish to move to ORANGE or GREEN? \n " +
                            "ORANGE: (1) SKATER PARK or (2) SWIMMING POOL\n" +
                            "GREEN:  (1) BOWLING ALLEY or (2) ZOO? \n", // 8.1 ChanceCard

                    "Do you wish to move to (1) CANDY SHOP or (2) IS-CREAM SHOP? \n", // 9 ChanceCard
                    // ---------------------- 12 ChanceCard ------------------------------
                    // ---------------------- 13 ChanceCard ------------------------------

                    "Do you wish to move to MAGENTA or CYAN? \n " +
                            "ORANGE: (1) MUSEUM or (2) LIBRARY\n" +
                            "GREEN:  (1) WATER PARK or (2) SEAFRON? \n", // 15.1 Chancecard

                    "Do you wish to move to (1) ARCADE or (2) CINEMA? \n", // 17 ChanceCard


            };
}
