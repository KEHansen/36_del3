package boundary;

public class Text {
    public final static String[] TEXT =
            {
                    "How many players are you? (2-4 player) \n", // 0
                    "Set player %d's name \n",
                    "Waiting for %s. Click ENTER to continue \n",
                    "%s has to pay 1M in order to get out of prison \n",
                    "%s landed on chance and has to draw a chance card \n",
                    "%s chose to draw another card \n", // 5
                    "%s used a get-free-out-jail card\n",
                    "%s had the most money and have won the game \n",
                    "%s landed on GO TO JAIL and went to jail \n",

            };

    public final static String[] CHANCETEXT =
            {
                    "It's a TIE so the value of your properties will be added to your balance \n",
                    "Move to START and receive 2M \n", // 1 ChanceCard
                    "Move UP TO 5 fields forward \n", // 2 ChanceCard
                    "Move to an ORANGE field if it's available you get it for free, if not pay the owner rent \n", // 3 ChanceCard
                    "Would you like to move 1 field forward or draw another CHANCECARD?\n", // 4 ChanceCard
                    "you ate to much candy, pay 2 M to the bank\n", // 5 ChanceCard
                    "Move to a GREEN field if it's available you get it for free, if not pay the owner rent \n", // 6 ChanceCard
                    "Move to an PINK field if it's available you get it for free, if not pay the owner rent \n", // 7 ChanceCard
                    "you've been released from jail free of charge (keep this card, until you can use it)\n ", // 8 ChanceCard
                    "move to SEAFRONT\n", //9 ChanceCard
                    "ITS YOUR BIRTHDAY!!, everyone happily gift you 1M :)\n", // 10 chance card
                    "Move to a MAGENTA field if it's available you get it for free, if not pay the owner rent \n", // 11 ChanceCard
                    "Move to a CYAN field if it's available you get it for free, if not pay the owner rent \n", // 12 ChanceCard
                    "you have done all of your homework, you receive 2M\n ", // 13 chanceCard
                    "Move to an RED field if it's available you get it for free, if not pay the owner rent \n", // 14 ChanceCard
                    "FREE FIELD\n" + " move to SKATER PARK and do a cool grind!\n" + "if no one owns it, you get it for FREE!\n" + "else pay the rent to the owner\n", //  15 chancecard
                    "Move to a YELLOW if it's available you get it for free, if not pay the owner rent \n", // 16 ChanceCard
                    "Move to a GRAY if it's available you get it for free, if not pay the owner rent \n", // 17 ChanceCard
            };

    public final static String[] interactiveTEXT =
            {
                    "How many fields do you wish move? (1-5 fields)\n",  // 2 ChanceCard
                    "Do you wish to move to (1) SKATER PARK or (2) SWIMMING POOL? \n", // 3 ChanceCard
                    "Do you wish to (1) move 1 field or (2) draw another \n", // 4 ChanceCard
                    "Do you wish to move to (1) BOWLING ALLEY or (2) ZOO? \n", // 6 ChanceCard
                    "Do you wish to move to (1) CANDY SHOP or (2) IS-CREAM SHOP? \n", // 7 ChanceCard
                    "Do you wish to move to (1) MUSEUM or (2) LIBRARY? \n", // 11 ChanceCard
                    "Do you wish to move to (1) WATER PARK or (2) SEAFRONT? \n", // 12 ChanceCard
                    "Do you wish to move to (1) ARCADE or (2) CINEMA? \n", // 14 ChanceCard
                    "Do you wish to move to (1) TOY STORE or (2) PET STORE? \n", // 16 ChanceCard
                    "Do you wish to move to (1) BURGER JOINT or (2) PIZZA BAR? \n", // 17 ChanceCard
            };

    public final static String[] BUYINGTEXT =
            {
                    "%s landed on %s and bought it."
            };

    public final static String[] PAYINGTEXT =
            {
                    "%s landed on %s which %s owns and has to pay rent"
            };

    public final static String[] OWNERTEXT =
            {
                    "%s landed on %s which you already own \n"
            };
}
