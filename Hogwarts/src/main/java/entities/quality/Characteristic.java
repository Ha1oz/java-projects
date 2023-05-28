package entities.quality;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Characteristic {
    NOBILITY, HONOR, COURAGE, DILIGENCE, LOYALTY, HONESTY, INTELLIGENCE,
    WISDOM, WIT, CREATIVITY,CUNNING, DETERMINATION, AMBITION, INGENUITY, AUTHORITY;
    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
}
