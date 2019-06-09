package io.teibidh.spiritio.item;

import io.teibidh.spiritio.SpiritIO;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAkashicResonator extends Item {
    public ItemAkashicResonator() {
        String name = "itemakashicresonator";
        setRegistryName(name);
        setTranslationKey(SpiritIO.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
