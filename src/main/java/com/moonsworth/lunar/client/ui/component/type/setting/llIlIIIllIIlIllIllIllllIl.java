package com.moonsworth.lunar.client.ui.component.type.setting;

import com.moonsworth.lunar.bridge.lunar.input.KeyType;
import com.moonsworth.lunar.client.registry.FontRegistry;
import com.moonsworth.lunar.client.setting.SettingLabel;
import com.moonsworth.lunar.client.ui.component.UIComponent;

public class llIlIIIllIIlIllIllIllllIl
extends AbstractDescritiveSettingUIComponent {
    public llIlIIIllIIlIllIllIllllIl(SettingLabel settingLabel, UIComponent uIComponent) {
        super(settingLabel, uIComponent);
    }

    @Override
    public float IllIllIIIllIIIlIlIlIIIIll() {
        return ((SettingLabel)this.llIIIIIIIllIIllIlIllIIIIl()).llIllIlIllIlllIllIIIIllII().getAsBoolean() ? 0.0f : 12.0f;
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
        FontRegistry.lIlIIIIIIlIIIllllIllIIlII().lIlIlIlIlIIlIIlIIllIIIIIl(((SettingLabel)this.IlllIIIIIIlllIlIIlllIlIIl).IlllIIIIIIlllIlIIlllIlIIl().toUpperCase(), this.x + 8.0f, this.y + 3.0f, 1356059603);
    }

    @Override
    public void lIlIlIlIlIIlIIlIIllIIIIIl(char c, KeyType keyType) {
    }

    @Override
    public void IlllIIIIIIlllIlIIlllIlIIl() {
    }
}
 