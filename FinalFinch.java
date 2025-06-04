package com.pf;
import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    public static void main(String[] args)  { 
        Finch bird = new Finch();

        // What do you want your finch to do?
         for(int i=0; i < 2; i++) {
        bird.setMove("F",5,50);
        bird.setMove("B", 5, 50);
        bird.setMotors(100,100);
        bird.setBeak(0,0,100);
        bird.setTurn("R",45,100);
        bird.setBeak(0,0,0);
        bird.setBeak(0,0,100);
        bird.setTurn("L",45,100);
        bird.setBeak(0,0,0);
        bird.setBeak(0,0,100);
        bird.setTurn("L",45,100);
        bird.setBeak(0,0,0);
        bird.setBeak(0,0,100);
        bird.setTurn("R",45,100);
        bird.setBeak(0,0,0);
        bird.setMotors(50,50);
        bird.setMove("F",10,50);
        bird.setTurn("R",360,100);
    }
         bird.print("Bye!");
          bird.playNote(60,1);
        bird.pause(1);
         bird.playNote(67,1);
         bird.setBeak(0,0,100);
         bird.setTail(1,50,0,50);
          bird.setTail(2,50,0,50);
               bird.setTail(3,50,0,50);
                    bird.setTail(4,50,0,50);
          bird.pause(2);
 





           


        bird.stopAll();
        bird.disconnect();
    }

}
