PImage face;
void setup(){
  
  face = loadImage("elmo.jpg");
  size(800,600);
  face.resize(800,600);
  background(face);
}
void draw(){
  background(face);
  if(mousePressed){
    println(mouseX+" "+mouseY);
  }
  if(mouseX<351){
    mouseX=351;
  }
  if(mouseY<261){
  mouseY=261;
}
if(mouseX>389){
  mouseX=389;
}
if(mouseY>307){
  mouseY=307;
}
  fill(255,255,255);
  ellipse(370,285, 80,70);
  ellipse(445,285,80,70);
  
  fill(0,0,0);
  ellipse(mouseX,mouseY,30,30);
  ellipse(mouseX+75,mouseY,30,30);
}