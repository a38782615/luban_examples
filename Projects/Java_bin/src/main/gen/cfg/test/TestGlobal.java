//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;



public final class TestGlobal {
    public TestGlobal(ByteBuf _buf) { 
        unlockEquip = _buf.readInt();
        unlockHero = _buf.readInt();
    }

    public TestGlobal(int unlock_equip, int unlock_hero ) {
        this.unlockEquip = unlock_equip;
        this.unlockHero = unlock_hero;
    }


    public final int unlockEquip;
    public final int unlockHero;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "unlockEquip:" + unlockEquip + ","
        + "unlockHero:" + unlockHero + ","
        + "}";
    }
}
