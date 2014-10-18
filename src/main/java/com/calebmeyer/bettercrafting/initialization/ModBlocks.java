package com.calebmeyer.bettercrafting.initialization;

import com.calebmeyer.bettercrafting.blocks.BlockBCT;
import com.calebmeyer.bettercrafting.blocks.BlockBasicCrafter;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * This class is responsible for loading up all the blocks in the mod
 */
public class ModBlocks {
    public static final BlockBCT basicCraftingTable = new BlockBasicCrafter();

    public static void initializeBlocks() {
        GameRegistry.registerBlock(basicCraftingTable, "basicCraftingTable");
    }
}
