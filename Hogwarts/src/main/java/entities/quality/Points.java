package entities.quality;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Points<T> {
    T quality;
    private int points;

    @Override
    public String toString() {
        return "Points{" +
                "quality=" + quality +
                ", points=" + points +
                '}';
    }
}
