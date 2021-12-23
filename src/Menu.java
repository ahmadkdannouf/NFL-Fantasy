import java.util.Scanner;
import java.util.HashMap;


public class Menu {

    public static void main(String[] args) {
        //All of our declarations and initializations for our HashMaps of objects
        HashMap<Integer, Quarterbacks> QB = new HashMap<>();
        HashMap<Integer, Runningbacks> RB = new HashMap<>();
        HashMap<Integer, Widereceivers> WR= new HashMap<>();
        HashMap<Integer, Tightends> TE = new HashMap<>();
        HashMap<Integer, Defense> DE = new HashMap<>();
        HashMap<Integer, Kickers> K = new HashMap<>();
        HashMap<Integer, Players> my_team = new HashMap<>();

        //All of our players, which are objects in Java
        Quarterbacks Eli_Manning = new Quarterbacks(1, "QB", "Eli Manning", 4300);
        Quarterbacks Peyton_Manning = new Quarterbacks(2, "QB", "Peyton Manning", 4500);
        Quarterbacks Tom_Brady = new Quarterbacks(3, "QB", "Tom Brady(Eli Manning's son)", 1000);
        Quarterbacks Aaron_Rodgers = new Quarterbacks(4, "QB", "Aaron Rodgers", 10000);
        Quarterbacks Daniel_Jones = new Quarterbacks(5, "QB", "Daniel Jones", 200);
        Quarterbacks Lamar_Jackson = new Quarterbacks(6, "QB", "Lamar Jackson", 300);
        Runningbacks Derrick_Henry = new Runningbacks(1, "RB", "Derrick Henry", 4300);
        Runningbacks Nick_Chubb = new Runningbacks(2, "RB", "Nick Chubb", 4500);
        Runningbacks Saquon_Barkley = new Runningbacks(3, "RB", "Saquon Barkley", 1000);
        Runningbacks Tiki_Barber = new Runningbacks(4, "RB", "Tiki Barber", 10000);
        Runningbacks Danielle_Jones = new Runningbacks(5, "RB", "Danielle Jones", 200);
        Runningbacks Brandon_Jacobs = new Runningbacks(6, "RB", "Brandon Jacobs", 13300);
        Widereceivers Odell_Beckham = new Widereceivers(1, "WR", "Odell Beckham", 4300);
        Widereceivers Plaxico_Burress = new Widereceivers(2, "WR", "Plaxico Burress", 4500);
        Widereceivers Amari_Toomer = new Widereceivers(3, "WR", "Amari Toomer", 1000);
        Widereceivers Julio_Jones = new Widereceivers(4, "WR", "Julio Jones", 10000);
        Widereceivers Cooper_Kupp = new Widereceivers(5, "WR", "Cooper Kupp", 200);
        Widereceivers Jamarr_Chase = new Widereceivers(6, "WR", "Jamarr Chase", 13300);
        Tightends Travis_Kelce = new Tightends(1, "TE", "Travis Kelce", 4300);
        Tightends Jeremy_Shockey = new Tightends(2, "TE", "Jeremy Shockey", 4500);
        Tightends Rob_Gronk = new Tightends(3, "TE", "Rob Gronk", 1000);
        Tightends Evan_Engram = new Tightends(4, "TE", "Evan Engram", 10000);
        Tightends George_Kittle = new Tightends(5, "TE", "George Kittle", 200);
        Tightends Jason_Witten = new Tightends(6, "TE", "Jason Witten", 300);
        Defense Giants = new Defense(1, "DE", "Giants", 4300);
        Defense Jaguars = new Defense(2, "DE", "Jaguars", 4500);
        Defense Ravens = new Defense(3, "DE", "Ravens", 1000);
        Defense Packers = new Defense(4, "DE", "Packers", 10000);
        Defense Patriots = new Defense(5, "DE", "Patriots", 200);
        Defense Chiefs = new Defense(6, "DE", "Chiefs", 13300);
        Kickers Gram_Gano = new Kickers(1, "K", "Gram Gano", 4300);
        Kickers Justin_Tucker = new Kickers(2, "K", "Justin Tucker", 4500);
        Kickers Mason_Crosby = new Kickers(3, "K", "Mason Crosby", 1000);
        Kickers Matt_Prater = new Kickers(4, "K", "Matt Prater", 10000);
        Kickers Nick_Folk = new Kickers(5, "K", "Nick Folk", 200);
        Kickers Dan_Bailey = new Kickers(6, "K", "Dan Bailey", 13300);

        //Putting all of our players(objects) to it's appropriate HashMap
        QB.put(1, Eli_Manning);
        QB.put(2, Peyton_Manning);
        QB.put(3, Tom_Brady);
        QB.put(4, Aaron_Rodgers);
        QB.put(5, Daniel_Jones);
        QB.put(6, Lamar_Jackson);
        RB.put(1, Derrick_Henry);
        RB.put(2, Nick_Chubb);
        RB.put(3, Saquon_Barkley);
        RB.put(4, Tiki_Barber);
        RB.put(5, Danielle_Jones);
        RB.put(6, Brandon_Jacobs);
        WR.put(1, Odell_Beckham);
        WR.put(2, Plaxico_Burress);
        WR.put(3, Amari_Toomer);
        WR.put(4, Julio_Jones);
        WR.put(5, Cooper_Kupp);
        WR.put(6, Jamarr_Chase);
        TE.put(1, Travis_Kelce);
        TE.put(2, Jeremy_Shockey);
        TE.put(3, Rob_Gronk);
        TE.put(4, Evan_Engram);
        TE.put(5, George_Kittle);
        TE.put(6, Jason_Witten);
        DE.put(1, Giants);
        DE.put(2, Jaguars);
        DE.put(3, Ravens);
        DE.put(4, Packers);
        DE.put(5, Patriots);
        DE.put(6, Chiefs);
        K.put(1, Gram_Gano);
        K.put(2, Justin_Tucker);
        K.put(3, Mason_Crosby);
        K.put(4, Matt_Prater);
        K.put(5, Nick_Folk);
        K.put(6, Dan_Bailey);

        Scanner scan_object = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int choice;

        //The NFL Fantasy Menu
        while (true) {

            System.out.println("______________________________________________________________________________________________________________________________________________________");
            System.out.println("Welcome to our NFL Fantasy app where you can draft the team of your dreams. Please enter the number that corresponds with the menu option. \nIMPORTANT: Your team will only be able to consist of 6 players, so choose wisely\n");
            System.out.println("1. My Fantasy Team");
            System.out.println("2. Pick From Quarter Backs Available");
            System.out.println("3. Pick From Running Backs Available");
            System.out.println("4. Pick From Wide Receivers Available");
            System.out.println("5. Pick From Tight Ends Available");
            System.out.println("6. Pick From Defences Available");
            System.out.println("7. Pick From Kickers Available");
            System.out.println("Type Option Number Here: ");
            choice = scan.nextInt();
            System.out.println("______________________________________________________________________________________________________________________________________________________");

            switch (choice) {
                case 1:
                    System.out.println("Here is your amazing team: \n");
                    my_team.forEach((key, value) -> System.out.println(value));

                    break;
                case 2:
                    if (my_team.size() < 6) {
                        System.out.println("Pick a QB from this list");
                        QB.forEach((key, value) -> System.out.println(value.toString()));
                        System.out.println("Pick by rank: ");
                        String player_option = scan_object.nextLine();
                        QB.get(Integer.parseInt(player_option));
                        my_team.put(my_team.size() + 1, QB.get(Integer.parseInt(player_option)));
                        QB.remove(Integer.parseInt(player_option));
                    }
                    else{
                        System.out.println("Sorry, your team already has 6 players so you can't choose anymore players");
                    }

                    break;
                case 3:

                    if (my_team.size() < 6) {
                        System.out.println("Pick a RB from this list");
                        RB.forEach((key, value) -> System.out.println(value.toString()));
                        System.out.println("Pick by rank: ");
                        String RB_option = scan_object.nextLine();
                        RB.get(Integer.parseInt(RB_option));
                        my_team.put(my_team.size() + 1, RB.get(Integer.parseInt(RB_option)));
                        RB.remove(Integer.parseInt(RB_option));
                    }
                    else{
                        System.out.println("Sorry, your team already has 6 players so you can't choose anymore players");
                    }
                    break;
                case 4:
                    if (my_team.size() < 6) {
                        System.out.println("Pick a WR from this list");
                        WR.forEach((key, value) -> System.out.println(value.toString()));
                        System.out.println("Pick by rank: ");
                        String WR_option = scan_object.nextLine();
                        WR.get(Integer.parseInt(WR_option));
                        my_team.put(my_team.size() + 1, WR.get(Integer.parseInt(WR_option)));
                        WR.remove(Integer.parseInt(WR_option));
                    }
                    else{
                        System.out.println("Sorry, your team already has 6 players so you can't choose anymore players");
                    }

                    break;
                case 5:
                    if (my_team.size() < 6) {
                        System.out.println("Pick a TE from this list");
                        TE.forEach((key, value) -> System.out.println(value.toString()));
                        System.out.println("Pick by rank: ");
                        String TE_option = scan_object.nextLine();
                        TE.get(Integer.parseInt(TE_option));
                        my_team.put(my_team.size() + 1, TE.get(Integer.parseInt(TE_option)));
                        TE.remove(Integer.parseInt(TE_option));
                    }
                    else{
                        System.out.println("Sorry, your team already has 6 players so you can't choose anymore players");
                    }

                    break;
                case 6:
                    if (my_team.size() < 6) {
                        System.out.println("Pick a DE from this list");
                        DE.forEach((key, value) -> System.out.println(value.toString()));
                        System.out.println("Pick by rank: ");
                        String DE_option = scan_object.nextLine();
                        DE.get(Integer.parseInt(DE_option));
                        my_team.put(my_team.size() + 1, DE.get(Integer.parseInt(DE_option)));
                        DE.remove(Integer.parseInt(DE_option));
                    }
                    else{
                        System.out.println("Sorry, your team already has 6 players so you can't choose anymore players");
                    }

                    break;
                case 7:
                    if (my_team.size() < 6) {
                        System.out.println("Pick a K from this list");
                        K.forEach((key, value) -> System.out.println(value.toString()));
                        System.out.println("Pick by rank: ");
                        String K_option = scan_object.nextLine();
                        K.get(Integer.parseInt(K_option));
                        my_team.put(my_team.size() + 1, K.get(Integer.parseInt(K_option)));
                        K.remove(Integer.parseInt(K_option));
                    }
                    else{
                        System.out.println("Sorry, your team already has 6 players so you can't choose anymore players");
                    }

                    break;
            }

        }
    }

}