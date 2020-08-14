package com.idtech.block;

public class BlockRubber extends QuickBlock {
    {
        name = "Rubber";
        texture = "rubber";
    }
    public void onEntityWalk(){
        entity.motionY += 1;
    }
}
