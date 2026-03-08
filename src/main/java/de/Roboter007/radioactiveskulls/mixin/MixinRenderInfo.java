package de.Roboter007.radioactiveskulls.mixin;

import de.Roboter007.radioactiveskulls.RadioactiveConfig;
import net.minecraft.client.renderer.PlayerSkinRenderCache;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.world.entity.player.PlayerSkin;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerSkinRenderCache.RenderInfo.class)
public class MixinRenderInfo {

    @Shadow
    @Final
    private PlayerSkin playerSkin;

    // fixes the rendering of custom heads
    @Inject(method = "renderType", at = @At("HEAD"), cancellable = true)
    public void renderType(CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("skulls")) {
            cir.setReturnValue(RenderTypes.textSeeThrough(playerSkin.body().texturePath()));
            cir.cancel();
        }
    }
}
