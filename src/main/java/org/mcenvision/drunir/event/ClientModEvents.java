package org.mcenvision.drunir.event;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.mcenvision.drunir.CollectionCreatures;
import org.mcenvision.drunir.DrunirCollection;
import org.mcenvision.drunir.entity.client.deer.DeerRenderer;

@EventBusSubscriber(modid = DrunirCollection.ID, value = Dist.CLIENT)
public class ClientModEvents
{
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        EntityRenderers.register(CollectionCreatures.DEER.get(), DeerRenderer::new);
    }
}
