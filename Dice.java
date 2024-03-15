package dice;

public class Dice {
    int MIN = 1;
    int MAX = 6;
    public int diceRoll(){
        double d = (Math.random() * (MAX) + MIN);
        //Or can also write this to generate more 6's --> double d = (Math.random() * (MAX) + MIN);
        //this generates less 6's --> double d = (Math.random() * (MAX-MIN) + MIN);
        return (int)d;
    }
}
