package utils;

import java.util.Random;

public class RandomSkillScore {
    public static int setSkillScore(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }
}
