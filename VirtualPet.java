/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    boolean alive = true;
    int lives = 3;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello. All answers in lower case please.");
    }

    public void correct(){
        face.setImage("ecstatic");
        face.setMessage("Nice job!");
    }

    public void incorrect(){
        this.lives -= 1;
        if (lives == 2){
            face.setImage("sad");
        } else if (lives == 1) {
            face.setImage("verysad");
        } else {
            face.setImage("cry");
        }
        face.setMessage("Incorrect. " + lives + " lives remaining.");
    }

    public void dead() {
        this.alive = false;
        face.setImage("dead");
    }

    public void decay(){
        face.setImage("RIP");
    }

    public void heGawn(){
        face.setImage("pushingdaisies");
    }

    public void angel(){
        face.setImage("angel");
    }

    public void youWin(){
        face.setImage("joyful");
        face.setMessage("You Win!");
    }

    public void extraLife(){
        this.lives += 1;
        face.setImage("love");
        face.setMessage("You get an extra life!");
    }


} // end Virtual Pet
