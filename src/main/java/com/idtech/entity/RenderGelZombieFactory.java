package com.idtech.entity;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGelZombieFactory implements IRenderFactory<EntityLiving> {

    public static final RenderGelZombieFactory INSTANCE = new RenderGelZombieFactory();

    @Override
    public Render<? super EntityLiving> createRenderFor (RenderManager manager) {
        return new RenderGelZombie(manager, new ModelZombie(), 0.5f);
    }
}
