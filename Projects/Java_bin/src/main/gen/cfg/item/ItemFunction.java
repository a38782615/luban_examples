//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.item;

import bright.serialization.*;



public final class ItemFunction {
    public ItemFunction(ByteBuf _buf) { 
        minorType = _buf.readInt();
        funcType = _buf.readInt();
        method = _buf.readString();
        closeBagUi = _buf.readBool();
    }

    public ItemFunction(int minor_type, int func_type, String method, boolean close_bag_ui ) {
        this.minorType = minor_type;
        this.funcType = func_type;
        this.method = method;
        this.closeBagUi = close_bag_ui;
    }


    public final int minorType;
    public final int funcType;
    public final String method;
    public final boolean closeBagUi;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "minorType:" + minorType + ","
        + "funcType:" + funcType + ","
        + "method:" + method + ","
        + "closeBagUi:" + closeBagUi + ","
        + "}";
    }
}
