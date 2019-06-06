package io.teibidh.spiritio;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SpiritIO.modId, name = SpiritIO.name, version = SpiritIO.version)
public class SpiritIO
{
    public static final String modId = "spiritio";
    public static final String name = "SpiritIO";
    public static final String version = "@VERSION@";

    private static Logger logger;

    @Mod.Instance(modId)
    public static SpiritIO instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Initialize logger and declare ourselves aware of preInit.
        logger = event.getModLog();
        logger.info("Tearing open a Vivara... <Warming up for init>");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
       // Declare ourselves initializing.
        logger.info("Vivara is fully dialated, step through to The Akasha... <Initializing>");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Declare our initialization finished, hopefully successfully.
        logger.info("Your body melts in to the mists of The Akasha. Good luck! <Init done>");
    }

}
