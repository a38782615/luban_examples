//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.blueprint;

import bright.serialization.*;


public final class TbClazz {
    private final java.util.HashMap<String, cfg.blueprint.Clazz> _dataMap;
    private final java.util.ArrayList<cfg.blueprint.Clazz> _dataList;
    
    public TbClazz(ByteBuf _buf) {
        _dataMap = new java.util.HashMap<String, cfg.blueprint.Clazz>();
        _dataList = new java.util.ArrayList<cfg.blueprint.Clazz>();
        
        for(int n = _buf.readSize() ; n > 0 ; --n) {
            cfg.blueprint.Clazz _v;
            _v = cfg.blueprint.Clazz.deserializeClazz(_buf);
            _dataList.add(_v);
            _dataMap.put(_v.name, _v);
        }
    }

    public java.util.HashMap<String, cfg.blueprint.Clazz> getDataMap() { return _dataMap; }
    public java.util.ArrayList<cfg.blueprint.Clazz> getDataList() { return _dataList; }

    @SuppressWarnings("unchecked")
    public <T extends cfg.blueprint.Clazz> T getAs(String key) { return (T)_dataMap.get(key); }
    public cfg.blueprint.Clazz get(String key) { return _dataMap.get(key); }

    public void resolve(java.util.HashMap<String, Object> _tables) {
        for(cfg.blueprint.Clazz v : _dataList) {
            v.resolve(_tables);
        }
    }
}