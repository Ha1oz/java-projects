package entities.quality;

public class Skill {
    private final Characteristic characteristic;
    private int score;
    
    public Skill(Characteristic characteristic, int score) {
        this.characteristic = characteristic;
        this.score = score;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "{" + characteristic +
                ", " + score +
                '}';
    }
}
