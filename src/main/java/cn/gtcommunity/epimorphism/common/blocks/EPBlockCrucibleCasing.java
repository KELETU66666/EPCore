package cn.gtcommunity.epimorphism.common.blocks;

import gregtech.api.block.VariantBlock;
import gregtech.api.util.GTUtility;
import gregtech.api.util.TextFormattingUtil;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class EPBlockCrucibleCasing extends VariantBlock<EPBlockCrucibleCasing.CrucibleType> {
    public EPBlockCrucibleCasing() {
        super(Material.IRON);
        setTranslationKey("ep_crucible_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 1);
        setDefaultState(getState(CrucibleType.QUARTZ_CRUCIBLE));
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable World world, List<String> tooltip, @Nonnull ITooltipFlag advanced) {
        super.addInformation(stack, world, tooltip, advanced);
        tooltip.add(I18n.format("gregtech.multiblock.blast_furnace.max_temperature",
                TextFormatting.RED + TextFormattingUtil.formatNumbers(getState(stack).getTemperature()) + "K"));
    }

    public enum CrucibleType implements IStringSerializable {
        QUARTZ_CRUCIBLE("quartz", 2482),
        TUNGSTEN_CRUCIBLE("tungsten", 3695),
        GRAPHITE_CRUCIBLE("graphite", 4750),
        BORON_NITRIDE_CRUCIBLE("boron_nitride", 5328);

        private final String name;
        private final int temperature;

        @Nonnull
        @Override
        public String getName() {
            return name;
        }

        public int getTemperature() {
            return this.temperature;
        }

        CrucibleType(String name, int temperature) {
            this.name = name;
            this.temperature = temperature;
        }
    }
}
