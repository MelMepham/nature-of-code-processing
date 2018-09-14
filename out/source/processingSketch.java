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

w = new Walker();

background(255);
}

public void draw() {
w.walk();
w.display();
}
class Walker {
    int x,y;

    Walker() {
        x = width/2;
        y = height/2;
    };

    public void walk() {
        int choice = PApplet.parseInt(random(4));
        int r = PApplet.parseInt(random(255));
        int g = PApplet.parseInt(random(255));
        int b = PApplet.parseInt(random(255));


        if(choice == 0) {
            x++;
        } else if (choice == 1) {
            x--;
        } else if (choice == 2) {
            y++;
        } else {
            y--;
        }

        x = constrain(x, 0, width -1);
        x = constrain(y, o, height -1);
    }

    public void display() {
        point(x, y);
        stroke(r, g, b);
     }
}

  public void settings() { 
size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "processingSketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
