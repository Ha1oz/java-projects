package entities.quality;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum Characteristic {
    NOBILITY(SkillNature.SOCIAL), HONOR(SkillNature.SOCIAL), COURAGE(SkillNature.SOCIAL),
    DILIGENCE(SkillNature.SOCIAL), LOYALTY(SkillNature.SOCIAL), HONESTY(SkillNature.SOCIAL),
    INTELLIGENCE(SkillNature.SOCIAL), WISDOM(SkillNature.SOCIAL), WIT(SkillNature.SOCIAL), CREATIVITY(SkillNature.SOCIAL),
    CUNNING(SkillNature.SOCIAL), DETERMINATION(SkillNature.SOCIAL), AMBITION(SkillNature.SOCIAL),
    INGENUITY(SkillNature.SOCIAL), AUTHORITY(SkillNature.SOCIAL),
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
