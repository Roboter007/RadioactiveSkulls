package de.Roboter007.radioactiveskulls.util;

import java.util.*;

public class RadioactiveUtils {

    public List<RadioactiveConfigOption> changedRenderTypes= new ArrayList<>();

    public RadioactiveUtils() {
        changedRenderTypes.add(new RadioactiveConfigOption("skulls", RadioactiveCategory.SKULLS));
        changedRenderTypes.add(new RadioactiveConfigOption("armorCutoutNoCull", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("outline", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("crumbling", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("armorTranslucent", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entitySolid", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entitySolidZOffsetForward", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityCutout", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityCutoutNoCull", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityCutoutNoCullZOffset", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("itemEntityTranslucentCull", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityTranslucent", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityTranslucentEmissive", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entitySmoothCutout", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("beaconBeam", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityDecal", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityNoOutline", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("entityShadow", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("dragonExplosionAlpha", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("eyes", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("breezeEyes", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("breezeWind", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("energySwirl", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("weather", RadioactiveCategory.EXPERIMENTAL));
        changedRenderTypes.add(new RadioactiveConfigOption("blockScreenEffect", RadioactiveCategory.EXPERIMENTAL));
    }

}
