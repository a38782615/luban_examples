//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.bonus;

import bright.serialization.*;



public final class ShowItemInfo {
    public ShowItemInfo(ByteBuf _buf) { 
        itemId = _buf.readInt();
        itemNum = _buf.readLong();
    }

    public ShowItemInfo(int item_id, long item_num ) {
        this.itemId = item_id;
        this.itemNum = item_num;
    }


    public final int itemId;
    public cfg.item.Item itemId_Ref;
    public final long itemNum;


    public void resolve(java.util.HashMap<String, Object> _tables) {
        this.itemId_Ref = ((cfg.item.TbItem)_tables.get("item.TbItem")).get(itemId);
    }

    @Override
    public String toString() {
        return "{ "
        + "itemId:" + itemId + ","
        + "itemNum:" + itemNum + ","
        + "}";
    }
}
