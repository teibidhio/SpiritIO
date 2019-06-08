package io.teibidh.spiritio.furnace;

import io.teibidh.spiritio.SpiritIO;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockFurnace extends Block {
    public BlockFurnace() {
        super(Material.IRON);
        String name = "furnace";
        setRegistryName(name);
        setTranslationKey(SpiritIO.MODID + "." + name);
    }
}

