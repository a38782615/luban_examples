//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.bonus;

import bright.serialization.*;



public final class Items extends cfg.bonus.Bonus {
    public Items(ByteBuf _buf) { 
        super(_buf);
        {int n = Math.min(_buf.readSize(), _buf.size());itemList = new cfg.bonus.Item[n];for(int i = 0 ; i < n ; i++) { cfg.bonus.Item _e;_e = new cfg.bonus.Item(_buf); itemList[i] = _e;}}
    }

    public Items(cfg.bonus.Item[] item_list ) {
        super();
        this.itemList = item_list;
    }


    public final cfg.bonus.Item[] itemList;

    public static final int __ID__ = 819736849;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
        for(cfg.bonus.Item _e : itemList) { if (_e != null) _e.resolve(_tables); }
    }

    @Override
    public String toString() {
        return "{ "
        + "itemList:" + itemList + ","
        + "}";
    }
}
