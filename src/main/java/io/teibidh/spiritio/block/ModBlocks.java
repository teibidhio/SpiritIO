package io.teibidh.spiritio.block;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    @GameRegistry.ObjectHolder("spiritio:blockakashicfocus")
    public static BlockAkashicFocus blockakashicfocus;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockakashicfocus.initModel();
    }
}
