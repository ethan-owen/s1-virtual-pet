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
       String i = this.askForInput("What animal native to California has no native predators?");
       if (i.equals("banana slug")){
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
       String s = this.askForInput("What material are the lightest road bikes made out of?");
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

