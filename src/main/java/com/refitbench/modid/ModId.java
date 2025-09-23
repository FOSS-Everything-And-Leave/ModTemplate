package com.refitbench.modid;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class ModId {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Logger logger = event.getModLog();
        logger.info("Hello from PreInit!");
    }
}
