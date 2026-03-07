package de.Roboter007.radioactiveskulls;

import java.util.HashMap;

import de.Roboter007.radioactiveskulls.util.RadioactiveCategory;
import de.Roboter007.radioactiveskulls.util.RadioactiveConfigOption;
import de.Roboter007.radioactiveskulls.util.RadioactiveUtils;
import net.neoforged.neoforge.common.ModConfigSpec;

public class RadioactiveConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final HashMap<String, ModConfigSpec.BooleanValue> CONFIG_VALUES = new HashMap<>();

    public static boolean shouldRenderTypeBeChanged(String rendered) {
        return CONFIG_VALUES.get(rendered).get();
    }

    public static void loadConfig() {
        RadioactiveUtils radioactiveUtils = new RadioactiveUtils();

        for(RadioactiveConfigOption radioactiveConfigOption : radioactiveUtils.changedRenderTypes) {
            String changedRenderType = radioactiveConfigOption.renderType();
            RadioactiveCategory radioactiveCategory = radioactiveConfigOption.radioactiveCategory();

            ModConfigSpec.BooleanValue renderedOption = BUILDER
                    .comment(radioactiveCategory.name() + ": " + "Changes the RenderType of " + changedRenderType + " to textSeeThrough()")
                    .define("render_" + changedRenderType, radioactiveCategory.isEnabled());

            CONFIG_VALUES.put(changedRenderType, renderedOption);
        }

        SPEC = BUILDER.build();
    }

    public static ModConfigSpec SPEC = BUILDER.build();


}