package org.mcenvision.drunir.entity.client.deer;

import net.minecraft.resources.ResourceLocation;
import org.mcenvision.drunir.DrunirCollection;
import org.mcenvision.drunir.entity.util.MobVariant;

import java.util.List;

public class DeerVariants {
    public static final MobVariant BASIC =
            new MobVariant("cold",
                           ResourceLocation.fromNamespaceAndPath(DrunirCollection.ID,
                            "textures/entity/deer/deer.png"));
    public static final MobVariant FLORA =
            new MobVariant("warm",
                    ResourceLocation.fromNamespaceAndPath(DrunirCollection.ID,
                            "textures/entity/deer/flora_deer.png"));

    public static final List<MobVariant> ALL = List.of(BASIC, FLORA);
}
