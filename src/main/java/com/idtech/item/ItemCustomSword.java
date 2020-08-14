package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemCustomSword extends ItemSword {
    public static final String name = "CustomSword";

    protected ItemCustomSword() {
        super(ToolMaterial.DIAMOND);

        this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("slowness"), 6120, 12));
        return true;
    }
}
