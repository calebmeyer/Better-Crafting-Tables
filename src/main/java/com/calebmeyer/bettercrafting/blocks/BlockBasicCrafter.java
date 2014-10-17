package com.calebmeyer.bettercrafting.blocks;

import com.calebmeyer.bettercrafting.constants.Project;

/**
 * This is the most basic crafting table in this pack. It should exactly emulate a vanilla table
 * <p/>
 * TODO: Remove this in favor of better crafting tables
 */
public class BlockBasicCrafter extends BlockBCT {

    public BlockBasicCrafter() {
        super();
        this.setBlockName("basicCraftingTable");
        this.setBlockTextureName(Project.RESOURCE_PREFIX + "basic");
    }

}
