package io.teibidh.spiritio.block;

import io.teibidh.spiritio.SpiritIO;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockAkashicFocus extends Block {
    public BlockAkashicFocus() {
        super(Material.ROCK);
        String name = "blockakashicfocus";
        setTranslationKey(SpiritIO.MODID + "." + name);
        setRegistryName(name);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}