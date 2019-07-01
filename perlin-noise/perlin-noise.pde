float time = 0;

void setup() {
  size(600, 400);
  //frameRate(10);
}

void draw() {
  background(0);
  fill(255);

  //float x = random(width);

  time = time + 0.01;
  float x = noise(time);
  x = map(x, 0, 1, 0, width);
  ellipse(x, height/2, 40, 40);

}
