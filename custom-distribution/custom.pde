void setup() {
size(200, 200);
background(255);
}

void draw() {

color col;
  for (int j = 0; j < 200; j = j+20) {
    for (int i = 0; i < 200; i = i+20) {
      
      float r1 = random(0, 100);
      float r2 = random(0, 100);
      
      if (r1 < r2) {
        col = 255;
      } else {
        col = 140;     
      }
      noStroke();
      fill(99, 126, col);
      rect(i, j, 20, 20);
  
    }
  }
}