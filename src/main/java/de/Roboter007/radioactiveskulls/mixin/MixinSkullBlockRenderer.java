package de.Roboter007.radioactiveskulls.mixin;

import de.Roboter007.radioactiveskulls.RadioactiveConfig;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
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
    public static Map<SkullBlock.Type, Identifier> SKIN_BY_TYPE;

    @Inject(method = "getSkullRenderType", at = @At("HEAD"), cancellable = true)
    private static void getSkullRenderType(SkullBlock.Type type, Identifier textureLocation, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("skulls")) {
            cir.setReturnValue(RenderTypes.textSeeThrough(textureLocation != null ? textureLocation : SKIN_BY_TYPE.get(type)));
            cir.cancel();
        }
    }

    @Inject(method = "getPlayerSkinRenderType", at = @At("HEAD"), cancellable = true)
    private static void getPlayerSkinRenderType(Identifier textureLocation, CallbackInfoReturnable<RenderType> cir) {
        if(RadioactiveConfig.shouldRenderTypeBeChanged("skulls")) {
            cir.setReturnValue(RenderTypes.textSeeThrough(textureLocation));
            cir.cancel();
        }
    }

}
