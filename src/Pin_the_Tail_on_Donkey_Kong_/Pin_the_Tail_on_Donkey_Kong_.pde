PImage donkey;
PImage tail;
void setup(){
  donkey = loadImage("donkey.png");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
  size(420, 420);
    tail.resize(120, 120);     //replace width, height with your tail's dimensions
}
void draw(){
  if(dist(0, 0, mouseX, mouseY) < 30){
  background (donkey);
  }
  else{background (#FF0900);
  }
image(tail, mouseX-60, mouseY);
rect(0, 0, 30, 30);
fill(#5BCB2B);
rect(454, 75, 40, 40);
  if(mousePressed){
    if(mouseX<39 && mouseX>15 && mouseY>211 && mouseY<251){
      println("Good job! You pinned the tail on Donkey Kong!");
    }else{ println("Try again, loser!" );   }
}


}