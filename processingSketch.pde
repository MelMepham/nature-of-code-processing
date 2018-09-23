
float r1 = random(0, 100);
float r2 = random(0, 100);


void setup() {
size(200, 200);
background(255);
}

void draw() {
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