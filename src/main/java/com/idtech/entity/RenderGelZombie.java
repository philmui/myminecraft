package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderGelZombie extends RenderBiped {

    public RenderGelZombie(RenderManager renderManagerIn, ModelBiped modelBipedIn, float shadowSize ) {
        super(renderManagerIn, modelBipedIn, shadowSize);
    }

    protected ResourceLocation getEntityTexture(EntityLiving entity) {

        return new ResourceLocation(BaseMod.MODID, "textures/entity/custom_biped.png");
    }
}
