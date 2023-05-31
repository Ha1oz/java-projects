package entities.quality;

import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return characteristic == skill.characteristic;
    }
    @Override
    public int hashCode() {
        return Objects.hash(characteristic);
    }
}
