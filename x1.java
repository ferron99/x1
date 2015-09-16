
//////// x1
////////Nick Ferro  (CST 112; Sept 16 2015)
/////// WIP, Incomplete, more features planned/in-progress

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;
float gravity;
float treeX = 150;
float treeY = 250;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
  gravity = 0.1;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  noStroke();
  fill(139,69,19);
  rect(treeX-5, treeY-50, 10, 60);
  fill(34,139,34);
  quad(treeX-50, treeY-50, treeX-25, treeY-100, treeX+25, treeY-100, treeX+50, treeY-50);
  quad(treeX-40, treeY-100, treeX-15, treeY-150, treeX+15, treeY-150, treeX+40, treeY-100);
  triangle(treeX-30, treeY-150, treeX+30, treeY-150, treeX, treeY-210);
  
  fill(175);                                          // house
  rect(400,horizon+100,150,150);
  fill(150);
  triangle(400,horizon+100,550,horizon+100,475,horizon+50);
  fill(0);
  rect(465,horizon+210,20,40);
  fill(255,255,0);
  rect(430,horizon+140, 20,20);
  rect(500,horizon+140, 20,20);
 

  fill(0);
  text( "My name is Nick", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  dy = dy + gravity;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,0,255);
  noStroke();
  rect(x,y,20,10);
  rect(x,y+9,10,21);
  rect(x+9,y+20,32,10);
  rect(x+40,y+9,10,21);
  rect(x+30,y,20,10);
  rect(x+10,y+29,10,11);
  rect(x+30,y+29,10,11);
  rect(x+20,y+39,10,10);
  fill(0);
  text( "Ferron", x,y );
  if ((x>width-50) || (x<0)){
    dx = dx * -.95;
  }
 if (y < 0) {
   dy = dy * -1;
 }
   if (y>height-50) {
    dy = dy * -0.95;
  }

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -20, +20 );                  // random speed.
  dy=  random( -14, +14 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

