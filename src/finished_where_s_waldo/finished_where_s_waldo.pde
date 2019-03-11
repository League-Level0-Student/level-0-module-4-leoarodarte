import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {

  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
    waldo.resize(1000,800);
  size(1000, 800);
  image(waldo, 0, 0);
  
  
 
  doh = minim.loadSample("sad.wav"); //drag and drop from project onto sketch
 woohoo = minim.loadSample("woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
     if(mousePressed){
   
  
  if(mouseX<445 && mouseY<618 && mouseX>421 && mouseY>543){
    playWoohoo();
    
  } else {
  playDoh();  
  }
     }
      // If the mouse is on Waldo, print “Waldo found!”

      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}