package de.Roboter007.radioactiveskulls;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(RadioactiveSkulls.MOD_ID)
public class RadioactiveSkulls {

    public static final String MOD_ID = "radioactiveskulls";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RadioactiveSkulls(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);

        RadioactiveConfig.loadConfig();
        modContainer.registerConfig(ModConfig.Type.COMMON, RadioactiveConfig.SPEC);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
