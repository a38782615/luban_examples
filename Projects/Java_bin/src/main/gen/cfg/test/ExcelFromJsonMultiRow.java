//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;



public final class ExcelFromJsonMultiRow {
    public ExcelFromJsonMultiRow(ByteBuf _buf) { 
        id = _buf.readInt();
        x = _buf.readInt();
        {int n = Math.min(_buf.readSize(), _buf.size());items = new java.util.ArrayList<cfg.test.TestRow>(n);for(int i = 0 ; i < n ; i++) { cfg.test.TestRow _e;  _e = new cfg.test.TestRow(_buf); items.add(_e);}}
    }

    public ExcelFromJsonMultiRow(int id, int x, java.util.ArrayList<cfg.test.TestRow> items ) {
        this.id = id;
        this.x = x;
        this.items = items;
    }


    public final int id;
    public final int x;
    public final java.util.ArrayList<cfg.test.TestRow> items;


    public void resolve(java.util.HashMap<String, Object> _tables) {
        for(cfg.test.TestRow _e : items) { if (_e != null) _e.resolve(_tables); }
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "x:" + x + ","
        + "items:" + items + ","
        + "}";
    }
}
