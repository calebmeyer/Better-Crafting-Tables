package com.calebmeyer.bettercrafting.initialization;

import com.calebmeyer.bettercrafting.items.ItemBCT;
import com.calebmeyer.bettercrafting.items.ItemCraftingPanel;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 *
 */
public class ModItems {
    public static final ItemBCT craftingPanel = new ItemCraftingPanel();

    public static void initializeItems() {
        GameRegistry.registerItem(craftingPanel, "craftingPanel");
    }


}
