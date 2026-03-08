package de.Roboter007.radioactiveskulls.mixin;

import de.Roboter007.radioactiveskulls.RadioactiveConfig;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderTypes.class)
public abstract class MixinRenderType {

    @Shadow
    public static RenderType textSeeThrough(Identifier location) {
        return null;
    }

    @Inject(method = "armorCutoutNoCull", at = @At("HEAD"), cancellable = true)
    private static void armorCutoutNoCull(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("armorCutoutNoCull")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }


    @Inject(method = "outline", at = @At("HEAD"), cancellable = true)
    private static void outline(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("outline")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "crumbling", at = @At("HEAD"), cancellable = true)
    private static void crumbling(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("crumbling")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "armorTranslucent", at = @At("HEAD"), cancellable = true)
    private static void armorTranslucent(Identifier id, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("armorTranslucent")) {
            cir.setReturnValue(textSeeThrough(id));
            cir.cancel();
        }
    }

    @Inject(method = "entitySolid", at = @At("HEAD"), cancellable = true)
    private static void entitySolid(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entitySolid")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entitySolidZOffsetForward", at = @At("HEAD"), cancellable = true)
    private static void entitySolidZOffsetForward(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entitySolidZOffsetForward")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityCutout", at = @At("HEAD"), cancellable = true)
    private static void entityCutout(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityCutout")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityCutoutNoCull*", at = @At("HEAD"), cancellable = true)
    private static void entityCutoutNoCull(Identifier id, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityCutoutNoCull")) {
            cir.setReturnValue(textSeeThrough(id));
            cir.cancel();
        }
    }

    @Inject(method = "entityCutoutNoCullZOffset*", at = @At("HEAD"), cancellable = true)
    private static void entityCutoutNoCullZOffset(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityCutoutNoCullZOffset")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "itemEntityTranslucentCull", at = @At("HEAD"), cancellable = true)
    private static void itemEntityTranslucentCull(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("itemEntityTranslucentCull")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityTranslucent*", at = @At("HEAD"), cancellable = true)
    private static void entityTranslucent(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityTranslucent")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityTranslucentEmissive*", at = @At("HEAD"), cancellable = true)
    private static void entityTranslucentEmissive(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityTranslucentEmissive")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entitySmoothCutout", at = @At("HEAD"), cancellable = true)
    private static void entitySmoothCutout(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entitySmoothCutout")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "beaconBeam", at = @At("HEAD"), cancellable = true)
    private static void beaconBeam(Identifier location, boolean colorFlag, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("beaconBeam")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityDecal", at = @At("HEAD"), cancellable = true)
    private static void entityDecal(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityDecal")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityNoOutline", at = @At("HEAD"), cancellable = true)
    private static void entityNoOutline(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityNoOutline")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityShadow", at = @At("HEAD"), cancellable = true)
    private static void entityShadow(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityShadow")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "dragonExplosionAlpha", at = @At("HEAD"), cancellable = true)
    private static void dragonExplosionAlpha(Identifier id, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("dragonExplosionAlpha")) {
            cir.setReturnValue(textSeeThrough(id));
            cir.cancel();
        }
    }

    @Inject(method = "eyes", at = @At("HEAD"), cancellable = true)
    private static void eyes(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("eyes")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "breezeEyes", at = @At("HEAD"), cancellable = true)
    private static void breezeEyes(Identifier location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("breezeEyes")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "breezeWind", at = @At("HEAD"), cancellable = true)
    private static void breezeWind(Identifier location, float u, float v, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("breezeWind")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "energySwirl", at = @At("HEAD"), cancellable = true)
    private static void energySwirl(Identifier location, float u, float v, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("energySwirl")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "weather", at = @At("HEAD"), cancellable = true)
    private static void weather(Identifier texture, boolean depthWrite, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("weather")) {
            cir.setReturnValue(textSeeThrough(texture));
            cir.cancel();
        }
    }

    @Inject(method = "blockScreenEffect", at = @At("HEAD"), cancellable = true)
    private static void blockScreenEffect(Identifier texture, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("blockScreenEffect")) {
            cir.setReturnValue(textSeeThrough(texture));
            cir.cancel();
        }
    }


}
