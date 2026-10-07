import java.util.Scanner;

public class Helper {
    public static void main(String[] args){
        String[] lines = {
            "Oh, the wonderful things mr.brown can do!",
"he can go like a cow. he can go moo moo",
"mr.brown can do it, man, how bout you?",

"he can go like a bee, mr.brown can buzz",
"how bout you can you?",
"can you go buzz buzz",

"he can go like a cork, pop pop pop pop", 
"he can go like horse feet Klopp Klopp Klopp",

"he can go eek eek, like a sqeaky shoe",
"he can go like a rooster, cock a doodle do", 
"he can go like an  owl hoo hoo hoo hoo",

"eek eek eek eek", 
"cock-a-doodle-doo",
"hoo hoo hoo hoo",
"how about you",

"he can go like the rain",
"dibble dibble dibble dopp",
"dibble dibble dopp dopp dopp",

"he can go like a train",
"choo choo",
"choo choo",

"oh the wonderful things mr.brown can do",
"moo moo",
"buzz buzz",
"pop pop pop",
"eek eek",
"hoo hoo",
"Klopp Klopp Klopp",
"dibble dibble",
"dopp dopp", 
"cock-a-doodle-do", 
"mr.brown can do it, man",
"how bout you?",

"mr.brow can whisper whisper", 
"very soft, very high", 
"like the soft whisper of a butterfly",
"maybe you can too,", 
"i think you ought to try", 

"he can go like a horn", 
"blurp blurp blurp blurp",
"like a big cat drinking",
"slurp slurp slurp", 

"he can go like a clock", 
"he can tick",
"he can tock", 
"he can go like a hand on a door", 
"knock knock", 
"tick tock",
"tick tock", 
"knock knock knock", 

"oh the wonderful things", 
"mr.brown can do", 
"blurp blurp", 
"slurp slurp",
"cock-a-doodle-doo",
"knock knock knock", 
"and hoo hoo hoo",

"he can even sizzle sizzle",
"he can do that, too",
"like an egg in a frying pan",
"how about you?", 

"mr.brown is smart as they come",
"he can do a hippopotoamus",
"chewing gum!",
"grum grum",
"grum grum",
"grum grum grum", 

"mr.brown is so smart",
"he can even do this",
"he can even make a noise",
"like a goldfish kiss!",

"boom boom boom",
"mr.brown is a wonder",
"boom boom boom", 
"mr.brown makes thunder", 

"he makes lightning",
"splatt splatt splatt",
"and its very very hard to make a noise like that", 

"oh the wonderful things mr.brown can do!",
"moo moo",
"buzz buzz", 
"pop pop pop", 

"eek eek", 
"hoo hoo", 
"Klopp Klopp Klopp",

"dibble dibble", 
"dopp dopp",
"cock-a-doodle-doo",

"grum grum",
"grum grum",
"choo choo choo", 

"boom boom", 
"splatt splatt",
"tick tick tock", 

"sizzle sizzle", 
"blurp blurp",
"knock knock knock",

"a slurp and a whisper",
"and a fish kiss, too",

"mr.brown can do it",
"how about you."
};
        System.out.println("==========================================");
        System.out.println("=        Flowtica Scribe Demo            =");
        System.out.println("==========================================");
        System.out.println("  Press the transcribe button to begin    ");
        Scanner input = new Scanner(System.in);
        String ans = input.nextLine(); 

        for (int i = 0; i < lines.length; i++){
            ans = input.nextLine();
            System.out.print(lines[i]);
        }
        System.out.println("\nTranscription ended....");

        for (int i = 0; i < 5; i++){
            System.out.println();
        }

        System.out.println("==========================================");
        System.out.println("=        Flowtica Scribe Demo            =");
        System.out.println("==========================================");
        System.out.println("  Would you like to summarize transcript?  ");
        System.out.println("summary by Flowtica Scribe This is an audio transcript of the book “Mr. Brown Can Moo! Can You?” by Dr. Seuss. It celebrates the joy of sound and imagination through the character Mr. Brown, who can imitate all sorts of noises—from a cow’s “moo” to a buzzing bee. The book invites children to join in, encouraging playful participation and listening skills. Its rhythmic, repetitive style makes it both fun to read aloud and a gentle introduction to phonetic awareness. ");
}
}

