package com.calebmeyer.bettercrafting.items;

import com.calebmeyer.bettercrafting.constants.Project;
import com.calebmeyer.bettercrafting.creativetab.CreativeTabBCT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 *
 */
public class ItemBCT extends Item {
    public ItemBCT() {
        super();
        this.maxStackSize = 1;
        this.setNoRepair();
        this.setCreativeTab(CreativeTabBCT.BETTER_CRAFTING_TABLES_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Project.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return getUnlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(
                // substring off the "item." at the beginning of the name
                this.getUnlocalizedName().substring(
                        this.getUnlocalizedName().indexOf(".") + 1
                )
        );
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
