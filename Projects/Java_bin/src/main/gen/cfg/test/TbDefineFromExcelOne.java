//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;


public final class TbDefineFromExcelOne {
    private final cfg.test.DefineFromExcelOne _data;

    public final cfg.test.DefineFromExcelOne data() { return _data; }

    public TbDefineFromExcelOne(ByteBuf _buf) {
        int n = _buf.readSize();
        if (n != 1) throw new SerializationException("table mode=one, but size != 1");
        _data = new cfg.test.DefineFromExcelOne(_buf);
    }


    /**
     * 装备解锁等级
     */
     public int getUnlockEquip() { return _data.unlockEquip; }
    /**
     * 英雄解锁等级
     */
     public int getUnlockHero() { return _data.unlockHero; }
     public String getDefaultAvatar() { return _data.defaultAvatar; }
     public String getDefaultItem() { return _data.defaultItem; }
     public cfg.test.DemoE2 getE2() { return _data.e2; }
     public java.util.ArrayList<String> getIcons() { return _data.icons; }

    public void resolve(java.util.HashMap<String, Object> _tables) {
        _data.resolve(_tables);
    }
}