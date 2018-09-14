import java.util.Random;
Random generator;

Walker w;

void setup() {
  
generator = new Random();
w = new Walker();
size(800, 600);
background(255);
}

void draw() {
w.walk();
w.display();
}