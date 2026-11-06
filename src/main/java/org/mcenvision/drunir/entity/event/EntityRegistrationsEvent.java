package org.mcenvision.drunir.entity.event;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import org.mcenvision.drunir.DrunirCollection;
import org.mcenvision.drunir.entity.client.deer.DeerModel;
import org.mcenvision.drunir.entity.client.deer.DeerSaddleModel;
import org.mcenvision.drunir.entity.server.custom.deer.Deer;

@EventBusSubscriber(modid = DrunirCollection.ID)
public class EntityRegistrationsEvent {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(DeerModel.LAYER_LOCATION, DeerModel::createBodyLayer);
        event.registerLayerDefinition(DeerSaddleModel.LAYER_LOCATION, DeerSaddleModel::createBodyLayer);
    }
}
