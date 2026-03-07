package de.Roboter007.radioactiveskulls.mixin;

import de.Roboter007.radioactiveskulls.RadioactiveConfig;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SkullBlock;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(SkullBlockRenderer.class)
public abstract class MixinSkullBlockRenderer {

    @Shadow
    @Final
    public static Map<SkullBlock.Type, ResourceLocation> SKIN_BY_TYPE;

    @Inject(method = "getSkullRenderType", at = @At("HEAD"), cancellable = true)
    private static void getSkullRenderType(SkullBlock.Type type, ResourceLocation textureLocation, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("skulls")) {
            cir.setReturnValue(RenderType.textSeeThrough(textureLocation != null ? textureLocation : SKIN_BY_TYPE.get(type)));
            cir.cancel();
        }
    }

    @Inject(method = "getPlayerSkinRenderType", at = @At("HEAD"), cancellable = true)
    private static void getPlayerSkinRenderType(ResourceLocation textureLocation, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("skulls")) {
            cir.setReturnValue(RenderType.textSeeThrough(textureLocation));
            cir.cancel();
        }
    }



}
