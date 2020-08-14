package com.idtech.item;

import net.minecraft.util.math.BlockPos;

public class ItemLightningHammer extends QuickItem {
    {
        name = "Lightning Hammer";
        texture = "lightninghammer";
    }
    public void onRightClick(){
        BlockPos block = findBlockAtCursor(20);
        createLightningBolt(block);

        float explosionSize = 20;
        boolean destroysBlocks = true;
        createExplosion(block, explosionSize, destroysBlocks);
    }
}
