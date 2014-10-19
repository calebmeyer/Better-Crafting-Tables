package com.calebmeyer.bettercrafting.blocks;

import com.calebmeyer.bettercrafting.constants.Project;
import com.calebmeyer.bettercrafting.creativetab.CreativeTabBCT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 *
 */
public class BlockBCT extends Block {
    public BlockBCT() {
        super(Material.wood);
        this.setCreativeTab(CreativeTabBCT.BETTER_CRAFTING_TABLES_TAB);
    }

    public BlockBCT(Material material) {
        super(material);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Project.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
