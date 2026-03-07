package de.Roboter007.radioactiveskulls;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = RadioactiveSkulls.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = RadioactiveSkulls.MOD_ID, value = Dist.CLIENT)
public class RadioactiveClient {

    public RadioactiveClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

}
