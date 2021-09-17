package com.moonsworth.lunar.client.ui.component.type.setting;

import com.moonsworth.lunar.bridge.lunar.input.KeyType;
import com.moonsworth.lunar.client.bridge.Bridge;
import com.moonsworth.lunar.client.registry.FontRegistry;
import com.moonsworth.lunar.client.setting.EnumSetting;
import com.moonsworth.lunar.client.ui.component.UIComponent;

/**
 * @author Decencies
 * @since 10/07/2021 18:26
 */
public class EnumSettingUIComponent extends AbstractDescritiveSettingUIComponent {
    public final IllllllllllIlIIIlllIlllll lIlIlIlIlIIlIIlIIllIIIIIl = new IllllllllllIlIIIlllIlllll(this, Bridge.llIlllIIIllllIIlllIllIIIl().initResourceLocation("lunar", "icons/settings/arrow-left-18x18.png"), 4.5f);
    public final IllllllllllIlIIIlllIlllll llIlIIIllIIlIllIllIllllIl = new IllllllllllIlIIIlllIlllll(this, Bridge.llIlllIIIllllIIlllIllIIIl().initResourceLocation("lunar", "icons/settings/arrow-right-18x18.png"), 4.5f);

    public EnumSettingUIComponent(EnumSetting enumSetting, UIComponent uIComponent) {
        super(enumSetting, uIComponent);
        Class<?> clazz = ((Enum)enumSetting.llIlllIIIllllIIlllIllIIIl()).getClass();
        Enum[] enumArray = (Enum[])clazz.getEnumConstants();
        int length = enumArray.length;
        this.lIlIlIlIlIIlIIlIIllIIIIIl.lIlIlIlIlIIlIIlIIllIIIIIl((float f, float f2, int n2) -> {
            int n3 = ((Enum)enumSetting.llIlllIIIllllIIlllIllIIIl()).ordinal();
            if (n3 - 1 < 0) {
                enumSetting.lIlIlIlIlIIlIIlIIllIIIIIl(enumArray[length - 1]);
            } else {
                enumSetting.lIlIlIlIlIIlIIlIIllIIIIIl(enumArray[n3 - 1]);
            }
            return true;
        });
        this.llIlIIIllIIlIllIllIllllIl.lIlIlIlIlIIlIIlIIllIIIIIl((float f, float f2, int n2) -> {
            int n3 = ((Enum)enumSetting.llIlllIIIllllIIlllIllIIIl()).ordinal();
            if (n3 + 1 >= length) {
                enumSetting.lIlIlIlIlIIlIIlIIllIIIIIl(enumArray[0]);
            } else {
                enumSetting.lIlIlIlIlIIlIIlIIllIIIIIl(enumArray[n3 + 1]);
            }
            return true;
        });
        this.lIlIlIlIlIIlIIlIIllIIIIIl((float f, float f2, int n) -> {
            if (this.lIlIlIlIlIIlIIlIIllIIIIIl.IlllIIIIIIlllIlIIlllIlIIl(f, f2)) {
                return this.lIlIlIlIlIIlIIlIIllIIIIIl.lIlIlIlIlIIlIIlIIllIIIIIl(f, f2, n);
            }
            if (this.llIlIIIllIIlIllIllIllllIl.IlllIIIIIIlllIlIIlllIlIIl(f, f2)) {
                return this.llIlIIIllIIlIllIllIllllIl.lIlIlIlIlIIlIIlIIllIIIIIl(f, f2, n);
            }
            return false;
        });
    }

    @Override
    public void lIlIlIlIlIIlIIlIIllIIIIIl(float f, float f2, float f3) {
        super.lIlIlIlIlIIlIIlIIllIIIIIl(f, f2, f3, this.IllIllIIIllIIIlIlIlIIIIll());
        this.lIlIlIlIlIIlIIlIIllIIIIIl.lIlIlIlIlIIlIIlIIllIIIIIl(f + f3 - 115.0f, f2);
        this.llIlIIIllIIlIllIllIllllIl.lIlIlIlIlIIlIIlIIllIIIIIl(f + f3 - 30.0f, f2);
    }

    @Override
    public float IllIllIIIllIIIlIlIlIIIIll() {
        return ((EnumSetting)this.llIIIIIIIllIIllIlIllIIIIl()).llIllIlIllIlllIllIIIIllII().getAsBoolean() ? 0.0f : 14.0f;
    }

    @Override
    public boolean lIllIlIIIlIIIIIIIlllIlIll() {
        return false;
    }

    @Override
    public void lIlIlIlIlIIlIIlIIllIIIIIl() {
    }

    @Override
    public void lIlIlIlIlIIlIIlIIllIIIIIl(float f, float f2, boolean bl) {
        FontRegistry.llIIIIIIIllIIllIlIllIIIIl().lIlIlIlIlIIlIIlIIllIIIIIl(((EnumSetting)this.IlllIIIIIIlllIlIIlllIlIIl).f_(), this.x, this.y + 1.5f, -4079426);
        this.lIlIlIlIlIIlIIlIIllIIIIIl.lIlIlIlIlIIlIIlIIllIIIIIl(f, f2, bl);
        this.llIlIIIllIIlIllIllIllllIl.lIlIlIlIlIIlIIlIIllIIIIIl(f, f2, bl);
        FontRegistry.llIIlIlIIIllIlIlIlIIlIIll().IlllIIIIIIlllIlIIlllIlIIl(((Enum)((EnumSetting)this.IlllIIIIIIlllIlIIlllIlIIl).llIlllIIIllllIIlllIllIIIl()).toString(), this.x + this.width - 64.0f, this.y + 2.5f, -1346256706);
    }

    @Override
    public void lIlIlIlIlIIlIIlIIllIIIIIl(char c, KeyType keyType) {
    }

    @Override
    public void IlllIIIIIIlllIlIIlllIlIIl() {
    }

    @Override
    public boolean lIlIlIlIlIIlIIlIIllIIIIIl(float f, float f2) {
        return this.IlllIIIIIIlllIlIIlllIlIIl(f, f2) && f < this.lIlIlIlIlIIlIIlIIllIIIIIl.lllIIIIIlllIIlIllIIlIIIlI() - 5.0f;
    }
}