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
                    "%s used a get-free-out-jail card\n",
            };

    public final static String[] CHANCETEXT =
            {
                    "%s landed on chance and has to pick a chance card \n",
                    "Move to START and receive 2M \n", // 2 ChanceCard
                    "Move UP TO 5 fields forward \n", // 3 ChanceCard
                    "Move to an ORANGE field if it's available you get it for free, if not paid the owner rent \n", // 4 ChanceCard
                    "Would you like to move 1 field or draw another CHANCECARD?\n", // 6 ChanceCard
                    "you ate to much candy, pay 2 M to the bank\n", // 7 ChanceCard
                    "Move to a GREEN field if it's available you get it for free, if not paid the owner rent \n", // 8 ChanceCard
                    "Move to an PINK field if it's available you get it for free, if not paid the owner rent \n", // 9 ChanceCard
                    "you've been released from jail free of charge (keep this card, until you can use it)\n ", // 10 ChanceCard
                    "move to SEAFRONT\n", //11 ChanceCard
                    "ITS YOUR BIRTHDAY!!, everyone happily gift you 1M :)\n", // 14 chance card
                    "Move to a MAGENTA if it's available you get it for free, if not paid the owner rent \n", // 15 ChanceCard
                    "Move to a CYAN field if it's available you get it for free, if not paid the owner rent \n", // 16 ChanceCard
                    "you have done all of your homework, you receive 2M\n ", // 17 chanceCard
                    "Move to an RED field if it's available you get it for free, if not paid the owner rent \n", // 18 ChanceCard
                    "FREE FIELD\n" + " move to SKATER PARK\n" + "do a cool grind!\n" + " to be a cool kid\n" + "if no one owns it, you get it for FREE!\n" + "else pay the rent to the owner\n", //  19 chancecard
                    "Move to a YELLOW if it's available you get it for free, if not paid the owner rent \n", // 20 ChanceCard
                    "Move to a GRAY if it's available you get it for free, if not paid the owner rent \n", // 21 ChanceCard

                    // ---------------------- 1 ChanceCard ------------------------------
                    // ---------------------- 5 ChanceCard ------------------------------
                    // ---------------------- 12 ChanceCard ------------------------------
                    // ---------------------- 13 ChanceCard ------------------------------

            };

    public final static String[] interactiveTEXT =
            {
                    "How many fields do you wish move? (1-5 fields)\n",  // 3 ChanceCard
                    "Do you wish to move to (1) SKATER PARK or (2) SWIMMING POOL? \n", // 4 ChanceCard
                    "Do you wish to (1) move 1 field or (2) draw another \n", // 6 ChanceCard
                    "Do you wish to move to (1) BOWLING ALLEY or (2) ZOO? \n", // 8 ChanceCard
                    "Do you wish to move to (1) CANDY SHOP or (2) IS-CREAM SHOP? \n", // 9 ChanceCard
                    "Do you wish to move to (1) MUSEUM or (2) LIBRARY? \n", // 15 ChanceCard
                    "Do you wish to move to (1) WATER PARK or (2) SEAFRONT? \n", // 16 ChanceCard
                    "Do you wish to move to (1) ARCADE or (2) CINEMA? \n", // 17 ChanceCard
                    "Do you wish to move to (1) TOY STORE or (2) PET STORE? \n", // 20 ChanceCard
                    "Do you wish to move to (1) BURGER JOINT or (2) PIZZA BAR? \n", // 21 ChanceCard

                    // ---------------------- 1 ChanceCard ------------------------------
                    // ---------------------- 5 ChanceCard ------------------------------
                    // ---------------------- 12 ChanceCard ------------------------------
                    // ---------------------- 13 ChanceCard ------------------------------
            };
}
