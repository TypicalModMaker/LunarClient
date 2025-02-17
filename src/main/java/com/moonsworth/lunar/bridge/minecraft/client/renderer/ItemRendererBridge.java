package com.moonsworth.lunar.bridge.minecraft.client.renderer;

import com.moonsworth.lunar.bridge.minecraft.client.entity.EntityLivingBaseBridge;
import com.moonsworth.lunar.bridge.minecraft.client.renderer.block.model.ItemCameraTransformsBridge;
import com.moonsworth.lunar.bridge.minecraft.client.resources.model.BuiltInModelBridge;
import com.moonsworth.lunar.bridge.current.MatrixStackBridge;
import com.moonsworth.lunar.bridge.minecraft.item.ItemStackBridge;
import com.moonsworth.lunar.bridge.minecraft.world.WorldBridge;

public interface ItemRendererBridge {
    default public void lIlIlIlIlIIlIIlIIllIIIIIl(ItemStackBridge itemStackBridge, ItemCameraTransformsBridge.lIlIlIlIlIIlIIlIIllIIIIIl lIlIlIlIlIIlIIlIIllIIIIIl2, boolean bl, MatrixStackBridge matrixStackBridge, Object object, int n, int n2, BuiltInModelBridge builtInModelBridge) {
        throw new UnsupportedOperationException("Incorrect renderItem call for a legacy version!");
    }

    public void bridge$renderItem(EntityLivingBaseBridge var1, ItemStackBridge var2, ItemCameraTransformsBridge.lIlIlIlIlIIlIIlIIllIIIIIl var3);

    default public BuiltInModelBridge lIlIlIlIlIIlIIlIIllIIIIIl(ItemStackBridge itemStackBridge, WorldBridge worldBridge, Object object) {
        throw new UnsupportedOperationException("getModel operation called in Legacy!");
    }
}