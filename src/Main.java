import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner//
        //array with questions//
        String[] EandIquestions = new String[]{"Are you impulsive or more thoughtful?", "Do you like to seek breadth or depth of knowledge?", "Do you prefer frequent or substantial interaction?", "Do you get more energy with people or alone?", "Is your energy directed towards outward people and objects, or inward towards concepts and ideas?"};

        String[] SandNquestions = new String[]{"Are you focused on the present or on the future?", "Do you pay more attention to details or to patterns and meanings?", "Are you more practical or more imaginative?", "Are you more interested in observable facts and straightforward facts or do you read between the lines and are more conceptual?", "Do you prefer practical work or theoretical work?"};
        //create a counter//
        String[] TandFquestions = new String[]{"Are you more rational or more emotional?", "Are you interested in logical analysis or in people and feelings?", "Do you value truth and logic or tact and diplomacy?", "Are you driven by dispassionate objectivity or passionate subjectivity?", "Do you make decisions with your head or your heart?"};

        String[] JandPquestions = new String[]{"Do you dislike leaving questions unanswered or do you need freedom from your obligations?", "Do you prefer following rules and protocols or are you more flexible and spontaneous?", "Do you work systematically or in bursts of energy?", "Are you usually set once you make a decision or do you enjoy a fresh look at things?", "Do you like to plan and act first, or explore and then respond?"};
        int Ecounter = 0;
        int Icounter = 0;
        int Scounter = 0;
        int Ncounter = 0;
        int Tcounter = 0;
        int Fcounter = 0;
        int Jcounter = 0;
        int Pcounter = 0;

        System.out.println("Hi! Welcome to the Audrey Wu MBTI Test. Here, you'll be able to answer questions to determine your personality type! \n\nWhen answering, please enter either 1 or 2 as your response towards the two choices. If not, the program won't work.\n\nEnjoy!!");

        System.out.println("\n\nWe'll begin with extroversion versus introversion. \nRemember, if you agree more with the first choice, enter 1, and if you agree more with the second choice, enter 2!");


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < EandIquestions.length; i++) {

            System.out.println(EandIquestions[i]);
            String EandIanswer = scanner.nextLine();

            if (EandIanswer.equals("1")) {
                Ecounter++;
            } else if (EandIanswer.equals("2")) {
                Icounter++;
            } else {

                System.out.println("Sorry, we can't accept that answer! Please retype your answer: 1 or 2!");
                i--;
            }


        }
        System.out.println("\nGreat job!!! I'm reading through your responses as we speak, and they look promising!\nNow, we'll start questions about: Sensing and iNtuition!\n");

        Scanner secondscanner = new Scanner(System.in);

        for (int p = 0; p < EandIquestions.length; p++) {

            System.out.println(SandNquestions[p]);
            String SandNanswer = secondscanner.nextLine();

            if (SandNanswer.equals("1")) {
                Scounter++;
            } else if (SandNanswer.equals("2")) {
                Ncounter++;
            } else {

                System.out.println("Sorry, we can't accept that answer! Please retype your answer: 1 or 2!");
                p--;
            }


        }


        System.out.println("\nWow, halfway done!!! Kudos to you!!! Wowzers!!!\nNow, we'll ask questions about Thinking versus Feeling!\n");

        Scanner thirdscanner = new Scanner(System.in);

        for (int j = 0; j < TandFquestions.length; j++) {

            System.out.println(TandFquestions[j]);
            String TandFanswer = thirdscanner.nextLine();

            if (TandFanswer.equals("1")) {
                Tcounter++;
            } else if (TandFanswer.equals("2")) {
                Fcounter++;
            } else {

                System.out.println("Sorry, we can't accept that answer! Please retype your answer: 1 or 2!");
                j--;
            }




        }

        System.out.println("\nYou're in the final stretch now, great job!\nNow, for our grand finale, we'll quiz you on Judging and Perceiving!\n");

        Scanner fourthscanner = new Scanner(System.in);

        for (int k = 0; k < JandPquestions.length; k++) {

            System.out.println(JandPquestions[k]);
            String JandPanswer = fourthscanner.nextLine();

            if (JandPanswer.equals("1")) {
                Jcounter++;
            } else if (JandPanswer.equals("2")) {
                Pcounter++;
            } else {

                System.out.println("Sorry, we can't accept that answer! Please retype your answer: 1 or 2!");
                k--;
            }
        }


        //okay, and now the conclusion! yay!//
        String result = "";
        if (Ecounter > Icounter) {
            result = result + "E";
        } else {
            result = result + "I";
        }
        if (Scounter > Ncounter) {
            result = result + "S";
        } else {
            result = result + "N";
        }
        if (Tcounter > Fcounter) {
            result = result + "T";
        } else {
            result = result + "F";
        }
        if (Jcounter > Pcounter) {
            result = result + "J";
        } else {
            result = result + "P";
        }


        System.out.println("\nCongrats! You just finished the official Audrey Wu MBTi Test!\nYour final result is: " + result + "\nWe hope you had a great time! Feel free to retake the quiz if you'd like, and have a great day!");


        //take in input and then get a counter//
        //at the end, return your personality;
    }
}