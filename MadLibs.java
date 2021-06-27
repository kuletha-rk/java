
public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author : Rishabh
    Date : 27th July 2021
    */
    public static void main(String[] args){
        String name1 = "Ashley";
        String adjective1 = "good";
        String adjective2 = "bad";
        String adjective3 = "ugly";
        String verb1 = "run";
        String noun1 = "table";
        String noun2 = "coffee";
        String noun3 = "pen";
        String noun4 = "car";
        String noun5 = "television";
        String noun6 = "book";
        String name2 = "John Wick!";
        int number = 2045;
        String place1 = "Seattle";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
