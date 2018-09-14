    import java.util.Random;

    
    class Walker {
      
        int x,y;
        int r = 0;
        int b = 0;
        int g = 0;
        
        Walker() {
            x = width/2;
            y = height/2;
        };

        void walk() {
            int choice = int(random(4));
            
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

        void display() {
          
          float xloc = (float) generator.nextGaussian();
          float sd = 2; //standard deviation 
          float mean = 20;
          xloc = ( xloc * sd ) + mean;
        
            int r = int(random(255));
            int g = int(random(255));
            int b = int(random(255));
            
            ellipse(x, y, xloc, xloc);
            fill(r, g, b);
            noStroke();
        }
    }
