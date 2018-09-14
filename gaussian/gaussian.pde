import java.util.Random;


Random generator;
void setup() {
  size(800, 600);
  generator = new Random();
}


void draw() {
  background(255);

  float xloc = (float) generator.nextGaussian();
  float sd = 40; //standard deviation 
  float mean = width/2;
  xloc = ( xloc * sd ) + mean;

  
  
  fill(0);
  ellipse(width/2, height/2, xloc, xloc);
  
}