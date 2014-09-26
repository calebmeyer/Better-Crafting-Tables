package com.calebmeyer.bettercrafting;

import com.calebmeyer.bettercrafting.constants.Project;
import com.calebmeyer.bettercrafting.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * This is the main class for this mod. The @Mod annotation tells Forge that this is a mod, and to load it.
 */
@Mod(modid = Project.MOD_ID, name = Project.MOD_NAME, version = Project.VERSION)
public class BetterCraftingTables {

    // An instance of this mod for forge to use
    @Mod.Instance(Project.MOD_ID)
    public static BetterCraftingTables instance;

    // TODO Properly comment this, and the below methods
    @SidedProxy(clientSide = "com.calebmeyer.bettercrafting.proxy.ClientProxy",
            serverSide = "com.calebmeyer.bettercrafting.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void initialization(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInitialization(FMLPostInitializationEvent event) {

    }
}
