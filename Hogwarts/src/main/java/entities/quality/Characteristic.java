package entities.quality;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum Characteristic {
    NOBILITY(SkillNature.GRYFFINDOR), HONOR(SkillNature.GRYFFINDOR), COURAGE(SkillNature.GRYFFINDOR),
    DILIGENCE(SkillNature.HUFFLEPUFF), LOYALTY(SkillNature.HUFFLEPUFF), HONESTY(SkillNature.HUFFLEPUFF),
    INTELLIGENCE(SkillNature.RAVENCLAW), WISDOM(SkillNature.RAVENCLAW), WIT(SkillNature.RAVENCLAW), CREATIVITY(SkillNature.RAVENCLAW),
    CUNNING(SkillNature.SLYTHERIN), DETERMINATION(SkillNature.SLYTHERIN), AMBITION(SkillNature.SLYTHERIN),
    INGENUITY(SkillNature.SLYTHERIN), AUTHORITY(SkillNature.SLYTHERIN),
    POWER(SkillNature.MAGIC), TRANSGRESSION(SkillNature.MAGIC);
    private final SkillNature skillNature;

    public static List<Characteristic> getAllSkills() {
        return Arrays.stream(values()).toList();
    }
    public static List<Characteristic> getAllSkills(SkillNature skillNature) {
        List<Characteristic> result = new ArrayList<>();

        for (Characteristic characteristic : values()){
            if (characteristic.skillNature == skillNature) {
                result.add(characteristic);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
}
