package io.teibidh.spiritio;

import io.teibidh.spiritio.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SpiritIO.MODID, name = SpiritIO.MODNAME, version = SpiritIO.MODVERSION, useMetadata = true, certificateFingerprint = "e157e8b293e545725d6a067ee1a46664f173e8d8", updateJSON = "https://github.com/teibidhio/spiritio/update_manifest.json")
public class SpiritIO
{

    public static final String MODID = "spiritio";
    public static final String MODNAME = "SpiritIO";
    public static final String MODVERSION= "0.0.03";

    @SidedProxy(clientSide = "io.teibidh.spiritio.proxy.ClientProxy", serverSide = "io.teibidh.spiritio.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SpiritIO instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
