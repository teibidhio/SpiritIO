package io.teibidh.spiritio.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("spiritio:itemakashicresonator")
    public static ItemAkashicResonator itemakashicresonator;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemakashicresonator.initModel();
    }
}
