package de.Roboter007.radioactiveskulls.mixin;

import de.Roboter007.radioactiveskulls.RadioactiveConfig;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderType.class)
public abstract class MixinRenderType {

    @Shadow
    public static RenderType textSeeThrough(ResourceLocation location) {
        return null;
    }

    @Inject(method = "armorCutoutNoCull", at = @At("HEAD"), cancellable = true)
    private static void armorCutoutNoCull(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("armorCutoutNoCull")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }


    @Inject(method = "outline(Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/client/renderer/RenderType;", at = @At("HEAD"), cancellable = true)
    private static void outline(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("outline")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "crumbling", at = @At("HEAD"), cancellable = true)
    private static void crumbling(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("crumbling")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "armorTranslucent", at = @At("HEAD"), cancellable = true)
    private static void armorTranslucent(ResourceLocation id, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("armorTranslucent")) {
            cir.setReturnValue(textSeeThrough(id));
            cir.cancel();
        }
    }

    @Inject(method = "entitySolid", at = @At("HEAD"), cancellable = true)
    private static void entitySolid(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entitySolid")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entitySolidZOffsetForward", at = @At("HEAD"), cancellable = true)
    private static void entitySolidZOffsetForward(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entitySolidZOffsetForward")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityCutout", at = @At("HEAD"), cancellable = true)
    private static void entityCutout(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityCutout")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityCutoutNoCull*", at = @At("HEAD"), cancellable = true)
    private static void entityCutoutNoCull(ResourceLocation id, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityCutoutNoCull")) {
            cir.setReturnValue(textSeeThrough(id));
            cir.cancel();
        }
    }

    @Inject(method = "entityCutoutNoCullZOffset*", at = @At("HEAD"), cancellable = true)
    private static void entityCutoutNoCullZOffset(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityCutoutNoCullZOffset")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "itemEntityTranslucentCull", at = @At("HEAD"), cancellable = true)
    private static void itemEntityTranslucentCull(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("itemEntityTranslucentCull")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityTranslucent*", at = @At("HEAD"), cancellable = true)
    private static void entityTranslucent(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityTranslucent")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityTranslucentEmissive*", at = @At("HEAD"), cancellable = true)
    private static void entityTranslucentEmissive(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityTranslucentEmissive")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entitySmoothCutout", at = @At("HEAD"), cancellable = true)
    private static void entitySmoothCutout(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entitySmoothCutout")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "beaconBeam", at = @At("HEAD"), cancellable = true)
    private static void beaconBeam(ResourceLocation location, boolean colorFlag, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("beaconBeam")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityDecal", at = @At("HEAD"), cancellable = true)
    private static void entityDecal(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityDecal")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityNoOutline", at = @At("HEAD"), cancellable = true)
    private static void entityNoOutline(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityNoOutline")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "entityShadow", at = @At("HEAD"), cancellable = true)
    private static void entityShadow(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("entityShadow")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "dragonExplosionAlpha", at = @At("HEAD"), cancellable = true)
    private static void dragonExplosionAlpha(ResourceLocation id, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("dragonExplosionAlpha")) {
            cir.setReturnValue(textSeeThrough(id));
            cir.cancel();
        }
    }

    @Inject(method = "eyes", at = @At("HEAD"), cancellable = true)
    private static void eyes(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("eyes")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "breezeEyes", at = @At("HEAD"), cancellable = true)
    private static void breezeEyes(ResourceLocation location, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("breezeEyes")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "breezeWind", at = @At("HEAD"), cancellable = true)
    private static void breezeWind(ResourceLocation location, float u, float v, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("breezeWind")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "energySwirl", at = @At("HEAD"), cancellable = true)
    private static void energySwirl(ResourceLocation location, float u, float v, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("energySwirl")) {
            cir.setReturnValue(textSeeThrough(location));
            cir.cancel();
        }
    }

    @Inject(method = "weather", at = @At("HEAD"), cancellable = true)
    private static void weather(ResourceLocation texture, boolean depthWrite, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("weather")) {
            cir.setReturnValue(textSeeThrough(texture));
            cir.cancel();
        }
    }

    @Inject(method = "blockScreenEffect", at = @At("HEAD"), cancellable = true)
    private static void blockScreenEffect(ResourceLocation texture, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("blockScreenEffect")) {
            cir.setReturnValue(textSeeThrough(texture));
            cir.cancel();
        }
    }


}
