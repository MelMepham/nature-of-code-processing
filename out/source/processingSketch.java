import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class processingSketch extends PApplet {

Walker w;

public void setup() {
  
  frameRate(30);

  // Create a walker object
  w = new Walker();

}

public void draw() {
  background(255);
  // Run the walker object
  w.walk();
  w.render();
}
class Walker {
  float x, y;

  Walker() {
    x = width/2;
    y = height/2;
  }

  public void render() {
    stroke(0);
    fill(175);
    rectMode(CENTER);
    rect(x, y, 40, 40);
  }

  // Randomly move up, down, left, right, or stay in one place
  public void walk() {
    float vx = random(-2, 2);
    float vy = random(-2, 2);
    x += vx;
    y += vy;

    // Stay on the screen
    x = constrain(x, 0, width-1);
    y = constrain(y, 0, height-1);
  }
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "processingSketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
