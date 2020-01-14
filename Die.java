public class Die implements Lockable{
  //These are the declarations for the attributes(instance variables) of a die
   private int face;
   private int lock;
   private int unlock;
   private int key;
   private boolean locked;


   private final int side1 = 1;
   private final int side2 = 2;
   private final int side3 = 3;
   private final int side4 = 4;
   private final int side5 = 5;
   private final int side6 = 6;



/*
The Die constructor that defines what happens when the die object is made
When a new die is made, it gets flipped
*/
   public Die(int key){
     this.key = key;
     locked = false;
     roll();
   }
public boolean locked()
return locked;
/*
This is the section of the class containing the methods(behaviors) of a die
*/
public void setKey(int keyInput, int newKey){
  if(keyInput == newKey){
    key = newKey;
  }
}

public void lock(keyInput){
  if(keyInput == key){
    locked = true;
  }
  }
public void unlock(keyInput){
  if(keyInput /= key){
    locked = false;
  }
}


/*
The accessor method for the face variable (a getter)
*/
public int getFace(){
 return face;
}

/*
The mutator/modifier for the face variable (a setter)
*/
public void setFace(int newFace){
 face = newFace;
}
/*
Assigns a randomly chosen value to a face
*/
   public void roll(){
     face = (int) (Math.random()*6);
   }

/*
The dieSide method tells us what number the die's face is
*/
public boolean dieSide1(){
 return (face == side1);
}
public boolean dieSide2(){
 return (face == side2);
}
public boolean dieSide3(){
 return (face == side3);
}
public boolean dieSide4(){
 return (face == side4);
}
public boolean dieSide5(){
 return (face == side5);
}
public boolean dieSide6(){
 return (face == side6);
}
/*
Prints out current state of a Die
*/
public String toString(){
 String result = "";
 if(face == side1){
   result = "1";
 }
 else if(face == side2){
   result = "2";
 }
 else if(face == side3){
   result = "3";
 }
 else if(face == side4){
   result = "4";
 }
 else if(face == side5){
   result = "5";
 }
 else{
   result = "6";
 }
 return result;
}

}
