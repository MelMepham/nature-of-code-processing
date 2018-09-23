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


float r1 = random(0, 100);
float r2 = random(0, 100);


public void setup() {

background(255);
}

public void draw() {
float opac = 100;

  for (int i = 0; i < 200; i = i+20) {
    if (r1 < r2) {
      opac = 0;
    } else {
      opac = 1;     
    }

    noStroke();
    fill(99, 126, 255, opac);
    rect(i, 0, 20, 20);
  
    }
}
class Walker {
    int x,y;
    int r = 0;
    int b = 0;
    int g = 0;
    
    Walker() {
        x = width/2;
        y = height/2;
    };

    public void walk() {
        int choice = PApplet.parseInt(random(4));
        
        if(choice == 0) {
            x = x  + 2;
            if (r < 255) { r++; } else {g--; }
        } else if (choice == 1) {
            x = x - 2;
            if (g < 255) { g++; } else {b--; }
        } else if (choice == 2) {
            y = y + 2;
            if (b < 255) { b++; } else {r--; }
        } else {
            y = y - 2;
        }

        x = constrain(x, 0, width -20);
        y = constrain(y, 0, height -20);
    }

    public void display() {
      
     
        int r = PApplet.parseInt(random(255));
        int g = PApplet.parseInt(random(255));
        int b = PApplet.parseInt(random(255));
        
        ellipse(x, y, 20, 20);
        fill(r, g, b);
        noStroke();
     }
}
  public void settings() { 
size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "processingSketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
