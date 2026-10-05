import javax.swing.*;





public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
       // storyline begins aqui
       String a = this.askForInput("What is the powerhouse of the cell?");
       if (a.equals("mitochondria")){
            vp.correct();
       } else {
            vp.incorrect();
       }
       waitABeat(1000);
       String b = this.askForInput("What is 8+8/8?");
       if (b.equals("9")){
            vp.correct();
       } else {
            vp.incorrect();
       }
       waitABeat(1000);
       String c = this.askForInput("What is Mr. Morris' first name?");
       if (c.equals("sean")) {
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            }
       }
       waitABeat(1000);
       String d = this.askForInput("What is the capital of Peru?");
       if (d.equals("lima")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String e = this.askForInput("Who was the second president of the United States");
       if (e.equals("john adams")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String f = this.askForInput("What is the largest US state?");
       if (f.equals("alaska")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String g = this.askForInput("What is the fastest land animal?");
       if (g.equals("cheetah")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String h = this.askForInput("What is the name of the airline that recently closed down?");
       if (h.equals("spirit")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String j = this.askForInput("What is the name of Mr. Morris' son?");
       if (j.equals("kaelin")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String k = this.askForInput("How many days are there in a leap year?");
       if (k.equals("366")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String l = this.askForInput("What state is Chicago Bears quarterback Case Keenum from?");
       if (l.equals("texas")){
            vp.correct();
            waitABeat(1000);
            vp.extraLife();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String m = this.askForInput("What university has the mascot of the Golden Gopher?");
       if (m.equals("minnesota")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String n = this.askForInput("What is Orin's grade in US history?");
       if (n.equals("b")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String o = this.askForInput("What sport does Eli Denny play");
       if (o.equals("ultimate frisbee")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String p = this.askForInput("What is the US territory in the Pacific that has a national park?");
       if (p.equals("american samoa")){
            vp.correct();
            waitABeat(1000);
            vp.extraLife();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String q = this.askForInput("What is Ethan Owen's favorite country?");
       if (q.equals("federated states of micronesia")){
            vp.correct();
            waitABeat(1000);
            vp.extraLife();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String r = this.askForInput("What is the state capitol of Vermont?");
       if (r.equals("montpelier")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String s = this.askForInput("What material are the lightest bikes made of?");
       if (s.equals("carbon fiber")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String t = this.askForInput("What was the old mascot of Amherst College?");
       if (t.equals("lord jeffs")){
            vp.correct();
            waitABeat(1000);
            vp.extraLife();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String u = this.askForInput("What does ROUS stand for?");
       if (u.equals("rodents of unusual size")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String v = this.askForInput("What is Mr. Morris' last name?");
       if (v.equals("morris")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String w = this.askForInput("What is the largest fih in the world?");
       if (w.equals("whale shark")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String x = this.askForInput("What is the name of the most famous glacier on Mount Everest?");
       if (x.equals("khumbu icefall")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String y = this.askForInput("What is the name of the last image that appears on the pet's death sequence?");
       if (y.equals("pushingdaisies")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String z = this.askForInput("The inside of the Sonoma State concert hall is constructed mostly out of ____");
       if (z.equals("wood")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String a1 = this.askForInput("What is the first name of Scottie Pippen's son who plays basketball at Cal?");
       if (a1.equals("justin")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String b1 = this.askForInput("What is the name of the Creedence Clearwater Revival song with the line 'don't go out tonight, for it's bound to take your life'?");
       if (b1.equals("bad moon rising")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String c1 = this.askForInput("Is this the last question?");
       if (c1.equals("no")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String d1 = this.askForInput("Name the shorter owner (height) of Wrexham Football Club");
       if (d1.equals("rob mcelhenney")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String e1 = this.askForInput("What is the last name of a US president that is also the name of a cartoon cat?");
       if (e1.equals("garfield")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String f1 = this.askForInput("What is the largest species of crab");
       if (f1.equals("japanese spider crab")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String g1 = this.askForInput("What club team does Kai Creed play for");
       if (g1.equals("ann arbor hybrid")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String h1 = this.askForInput("Is Finland technicallly part of Scandinavia?");
       if (h1.equals("no")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String i1 = this.askForInput("What is the musical artist that released the song 'one tree hill'?");
       if (i1.equals("u2")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String j1 = this.askForInput("What is on the back of Ethan Owen's phone case? (no punctuation)");
       if (j1.equals("semifreddis frequent freddi card")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String k1 = this.askForInput("What football team has a name that is a color?");
       if (k1.equals("cleveland browns")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String l1 = this.askForInput("What is Ryan Trahan's candy brand?");
       if (l1.equals("joyride")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String m1 = this.askForInput("Galapagos tortoises routinely live past _______ years");
       if (m1.equals("100")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String n1 = this.askForInput("What college is sometimes called the 'Harvard' of Canada?");
       if (n1.equals("mcgill")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String o1 = this.askForInput("What is the name of the war that happened between Finland and the USSR?");
       if (o1.equals("winter war")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       String p1 = this.askForInput("Is this the last question?");
       if (p1.equals("no")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
        String q1 = this.askForInput("What is the first word that Lightning McQueen says in the first cars?");
       if (q1.equals("speed")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000); 
       String r1 = this.askForInput("Name the host of premier league on NBC Sports");
       if (r1.equals("rebecca lowe")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000); 
       String s1 = this.askForInput("What is the name of the forest with all of the ents in lord of the rings?");
       if (s1.equals("fangorn")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000); 
       String t1 = this.askForInput("Who is the best road cyclist in the pro peleton");
       if (t1.equals("tadej pogacar")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000); 
       String u1 = this.askForInput("What country is Sydney Lopez Cabral from?");
       if (u1.equals("cape verde")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000); 
       String v1 = this.askForInput("What musical artist has the nickname of 'the boss'?");
       if (v1.equals("bruce springsteen")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000); 
       String w1 = this.askForInput("Is this the last question?");
       if (w1.equals("yes")){
            vp.correct();
       } else {
            vp.incorrect();
            if (vp.lives < 1){
                vp.dead();
                waitABeat(1000);
                vp.decay();
                waitABeat(1000);
                vp.heGawn();
                waitABeat(5000);
                System.exit(0);
            } 
       }
       waitABeat(1000);
       vp.youWin();
       waitABeat(3000);
       System.exit(0);

    }


    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPMain();    
    }
}

