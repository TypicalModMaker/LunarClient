package com.moonsworth.lunar.bridge.lunar;

import com.moonsworth.lunar.bridge.current.MatrixStackBridge;
import com.moonsworth.lunar.bridge.current.lIllIlIIIlIIIIIIIlllIlIll;
import com.moonsworth.lunar.bridge.minecraft.util.ResourceLocationBridge;

import java.util.Optional;

public interface SkeletalWings {
    default public void renderLegacy(float f, float f2, ResourceLocationBridge resourceLocationBridge) {
    }

    default public void lIlIlIlIlIIlIIlIIllIIIIIl(lIllIlIIIlIIIIIIIlllIlIll lIllIlIIIlIIIIIIIlllIlIll2, MatrixStackBridge matrixStackBridge, int n, float f, float f2, ResourceLocationBridge resourceLocationBridge) {
    }

    default public Optional lIlIlIlIlIIlIIlIIllIIIIIl(ResourceLocationBridge resourceLocationBridge) {
        return Optional.empty();
    }
}
 