package com.jennymod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("jenny_mod_enhanced")
public class EnhancedCore {
    public static final Logger LOGGER = LogManager.getLogger();

    public EnhancedCore() {
        LOGGER.info("Initializing Jenny Mod Enhanced Edition...");
    }
}
