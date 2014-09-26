package com.calebmeyer.bettercrafting.utilities;

import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Logger;

/**
 * This class provides a single logger for the project. Embed it in any class needing logging using a static import.
 */
public class LoggingHelper {
    public static Logger logger = FMLLog.getLogger();
}
