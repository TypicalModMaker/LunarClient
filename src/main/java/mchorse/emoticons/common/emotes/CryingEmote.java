/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4f
 *  lunar.G.EntityLivingBaseBridge
 *  lunar.af.ParticleType
 */
package mchorse.emoticons.common.emotes;

import javax.vecmath.Vector4f;

import com.moonsworth.lunar.bridge.minecraft.client.entity.EntityLivingBaseBridge;
import com.moonsworth.lunar.bridge.minecraft.util.ParticleType;
import mchorse.emoticons.api.animation.model.AnimatorEmoticonsController;
import mchorse.emoticons.common.emotes.Emote;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJArmature;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJBone;

public class CryingEmote
extends Emote {
    public CryingEmote(String string, int n, boolean bl) {
        super(string, n, bl);
    }

    @Override
    public void progressAnimation(EntityLivingBaseBridge entityLivingBaseBridge, BOBJArmature bOBJArmature, AnimatorEmoticonsController animatorEmoticonsController, int n, float f) {
        if (n % 2 == 0) {
            BOBJBone bOBJBone = (BOBJBone)bOBJArmature.bones.get("head");
            Vector4f vector4f = animatorEmoticonsController.calcPosition(entityLivingBaseBridge, bOBJBone, 0.0f, 0.5f, 0.35f, f);
            entityLivingBaseBridge.bridge$getWorld().bridge$spawnParticle(ParticleType.lIIlIIlllIIIIlIlllIIIIlll, (double)vector4f.x, (double)vector4f.y, (double)vector4f.z, 1.0, -1.0, 1.0, new int[0]);
        }
    }
}

