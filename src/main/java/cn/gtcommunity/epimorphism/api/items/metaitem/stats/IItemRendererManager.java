package cn.gtcommunity.epimorphism.api.items.metaitem.stats;

import gregtech.api.items.metaitem.stats.IItemComponent;
import net.minecraft.util.ResourceLocation;

public interface IItemRendererManager extends IItemComponent {
    void onRendererRegistry(ResourceLocation location);

}
