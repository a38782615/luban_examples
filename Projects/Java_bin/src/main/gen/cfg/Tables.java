//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg;

import bright.serialization.*;

public final class Tables
{
    public  static interface  IByteBufLoader {
        ByteBuf load(String file) throws java.io.IOException;
    }

    private final cfg.ai.TbBlackboard _TbBlackboard;
    public cfg.ai.TbBlackboard getTbBlackboard() { return _TbBlackboard; }
    private final cfg.ai.TbBehaviorTree _TbBehaviorTree;
    public cfg.ai.TbBehaviorTree getTbBehaviorTree() { return _TbBehaviorTree; }
    private final cfg.blueprint.TbClazz _TbClazz;
    public cfg.blueprint.TbClazz getTbClazz() { return _TbClazz; }
    private final cfg.bonus.TbDrop _TbDrop;
    public cfg.bonus.TbDrop getTbDrop() { return _TbDrop; }
    private final cfg.common.TbGlobalConfig _TbGlobalConfig;
    public cfg.common.TbGlobalConfig getTbGlobalConfig() { return _TbGlobalConfig; }
    private final cfg.error.TbErrorInfo _TbErrorInfo;
    public cfg.error.TbErrorInfo getTbErrorInfo() { return _TbErrorInfo; }
    private final cfg.error.TbCodeInfo _TbCodeInfo;
    public cfg.error.TbCodeInfo getTbCodeInfo() { return _TbCodeInfo; }
    /**
     * 道具表
     */
    private final cfg.item.TbItem _TbItem;
    public cfg.item.TbItem getTbItem() { return _TbItem; }
    private final cfg.item.TbItemFunc _TbItemFunc;
    public cfg.item.TbItemFunc getTbItemFunc() { return _TbItemFunc; }
    private final cfg.item.TbItemExtra _TbItemExtra;
    public cfg.item.TbItemExtra getTbItemExtra() { return _TbItemExtra; }
    private final cfg.l10n.TbL10NDemo _TbL10NDemo;
    public cfg.l10n.TbL10NDemo getTbL10NDemo() { return _TbL10NDemo; }
    private final cfg.l10n.TbPatchDemo _TbPatchDemo;
    public cfg.l10n.TbPatchDemo getTbPatchDemo() { return _TbPatchDemo; }
    private final cfg.mail.TbSystemMail _TbSystemMail;
    public cfg.mail.TbSystemMail getTbSystemMail() { return _TbSystemMail; }
    private final cfg.mail.TbGlobalMail _TbGlobalMail;
    public cfg.mail.TbGlobalMail getTbGlobalMail() { return _TbGlobalMail; }
    private final cfg.role.TbRoleLevelExpAttr _TbRoleLevelExpAttr;
    public cfg.role.TbRoleLevelExpAttr getTbRoleLevelExpAttr() { return _TbRoleLevelExpAttr; }
    private final cfg.role.TbRoleLevelBonusCoefficient _TbRoleLevelBonusCoefficient;
    public cfg.role.TbRoleLevelBonusCoefficient getTbRoleLevelBonusCoefficient() { return _TbRoleLevelBonusCoefficient; }
    private final cfg.tag.TbTestTag _TbTestTag;
    public cfg.tag.TbTestTag getTbTestTag() { return _TbTestTag; }
    private final cfg.test.TbFullTypes _TbFullTypes;
    public cfg.test.TbFullTypes getTbFullTypes() { return _TbFullTypes; }
    private final cfg.test.TbSingleton _TbSingleton;
    public cfg.test.TbSingleton getTbSingleton() { return _TbSingleton; }
    private final cfg.test.TbNotIndexList _TbNotIndexList;
    public cfg.test.TbNotIndexList getTbNotIndexList() { return _TbNotIndexList; }
    private final cfg.test.TbMultiUnionIndexList _TbMultiUnionIndexList;
    public cfg.test.TbMultiUnionIndexList getTbMultiUnionIndexList() { return _TbMultiUnionIndexList; }
    private final cfg.test.TbMultiIndexList _TbMultiIndexList;
    public cfg.test.TbMultiIndexList getTbMultiIndexList() { return _TbMultiIndexList; }
    private final cfg.test.TbDataFromMisc _TbDataFromMisc;
    public cfg.test.TbDataFromMisc getTbDataFromMisc() { return _TbDataFromMisc; }
    private final cfg.test.TbMultiRowRecord _TbMultiRowRecord;
    public cfg.test.TbMultiRowRecord getTbMultiRowRecord() { return _TbMultiRowRecord; }
    private final cfg.test.TbTestMultiColumn _TbTestMultiColumn;
    public cfg.test.TbTestMultiColumn getTbTestMultiColumn() { return _TbTestMultiColumn; }
    private final cfg.test.TbMultiRowTitle _TbMultiRowTitle;
    public cfg.test.TbMultiRowTitle getTbMultiRowTitle() { return _TbMultiRowTitle; }
    private final cfg.test.TbTestNull _TbTestNull;
    public cfg.test.TbTestNull getTbTestNull() { return _TbTestNull; }
    private final cfg.test.TbDemoPrimitive _TbDemoPrimitive;
    public cfg.test.TbDemoPrimitive getTbDemoPrimitive() { return _TbDemoPrimitive; }
    private final cfg.test.TbTestString _TbTestString;
    public cfg.test.TbTestString getTbTestString() { return _TbTestString; }
    private final cfg.test.TbDemoGroup _TbDemoGroup;
    public cfg.test.TbDemoGroup getTbDemoGroup() { return _TbDemoGroup; }
    private final cfg.test.TbDemoGroup_C _TbDemoGroup_C;
    public cfg.test.TbDemoGroup_C getTbDemoGroup_C() { return _TbDemoGroup_C; }
    private final cfg.test.TbDemoGroup_S _TbDemoGroup_S;
    public cfg.test.TbDemoGroup_S getTbDemoGroup_S() { return _TbDemoGroup_S; }
    private final cfg.test.TbDemoGroup_E _TbDemoGroup_E;
    public cfg.test.TbDemoGroup_E getTbDemoGroup_E() { return _TbDemoGroup_E; }
    private final cfg.test.TbTestGlobal _TbTestGlobal;
    public cfg.test.TbTestGlobal getTbTestGlobal() { return _TbTestGlobal; }
    private final cfg.test.TbTestBeRef _TbTestBeRef;
    public cfg.test.TbTestBeRef getTbTestBeRef() { return _TbTestBeRef; }
    private final cfg.test.TbTestBeRef2 _TbTestBeRef2;
    public cfg.test.TbTestBeRef2 getTbTestBeRef2() { return _TbTestBeRef2; }
    private final cfg.test.TbTestRef _TbTestRef;
    public cfg.test.TbTestRef getTbTestRef() { return _TbTestRef; }
    private final cfg.test.TbTestSize _TbTestSize;
    public cfg.test.TbTestSize getTbTestSize() { return _TbTestSize; }
    private final cfg.test.TbTestSet _TbTestSet;
    public cfg.test.TbTestSet getTbTestSet() { return _TbTestSet; }
    private final cfg.test.TbDetectCsvEncoding _TbDetectCsvEncoding;
    public cfg.test.TbDetectCsvEncoding getTbDetectCsvEncoding() { return _TbDetectCsvEncoding; }
    private final cfg.test.TbItem2 _TbItem2;
    public cfg.test.TbItem2 getTbItem2() { return _TbItem2; }
    private final cfg.test.TbDefineFromExcel _TbDefineFromExcel;
    public cfg.test.TbDefineFromExcel getTbDefineFromExcel() { return _TbDefineFromExcel; }
    private final cfg.test.TbDefineFromExcelOne _TbDefineFromExcelOne;
    public cfg.test.TbDefineFromExcelOne getTbDefineFromExcelOne() { return _TbDefineFromExcelOne; }
    private final cfg.test.TbTestIndex _TbTestIndex;
    public cfg.test.TbTestIndex getTbTestIndex() { return _TbTestIndex; }
    private final cfg.test.TbTestMap _TbTestMap;
    public cfg.test.TbTestMap getTbTestMap() { return _TbTestMap; }
    private final cfg.test.TbExcelFromJson _TbExcelFromJson;
    public cfg.test.TbExcelFromJson getTbExcelFromJson() { return _TbExcelFromJson; }
    private final cfg.test.TbCompositeJsonTable1 _TbCompositeJsonTable1;
    public cfg.test.TbCompositeJsonTable1 getTbCompositeJsonTable1() { return _TbCompositeJsonTable1; }
    private final cfg.test.TbCompositeJsonTable2 _TbCompositeJsonTable2;
    public cfg.test.TbCompositeJsonTable2 getTbCompositeJsonTable2() { return _TbCompositeJsonTable2; }
    private final cfg.test.TbCompositeJsonTable3 _TbCompositeJsonTable3;
    public cfg.test.TbCompositeJsonTable3 getTbCompositeJsonTable3() { return _TbCompositeJsonTable3; }
    private final cfg.test.TbExcelFromJsonMultiRow _TbExcelFromJsonMultiRow;
    public cfg.test.TbExcelFromJsonMultiRow getTbExcelFromJsonMultiRow() { return _TbExcelFromJsonMultiRow; }
    private final cfg.test.TbTestSep _TbTestSep;
    public cfg.test.TbTestSep getTbTestSep() { return _TbTestSep; }
    private final cfg.test.TbTestScriptableObject _TbTestScriptableObject;
    public cfg.test.TbTestScriptableObject getTbTestScriptableObject() { return _TbTestScriptableObject; }
    private final cfg.test.TbTestExternalType _TbTestExternalType;
    public cfg.test.TbTestExternalType getTbTestExternalType() { return _TbTestExternalType; }
    private final cfg.test.TbDemoGroupDefineFromExcel _TbDemoGroupDefineFromExcel;
    public cfg.test.TbDemoGroupDefineFromExcel getTbDemoGroupDefineFromExcel() { return _TbDemoGroupDefineFromExcel; }
    private final cfg.test.TbDefineFromExcel2 _TbDefineFromExcel2;
    public cfg.test.TbDefineFromExcel2 getTbDefineFromExcel2() { return _TbDefineFromExcel2; }
    private final cfg.test.TbTestExcelBean _TbTestExcelBean;
    public cfg.test.TbTestExcelBean getTbTestExcelBean() { return _TbTestExcelBean; }
    private final cfg.test.TbTestDesc _TbTestDesc;
    public cfg.test.TbTestDesc getTbTestDesc() { return _TbTestDesc; }

    public Tables(IByteBufLoader loader) throws java.io.IOException {
        java.util.HashMap<String, Object> tables = new java.util.HashMap<>();
        _TbBlackboard = new cfg.ai.TbBlackboard(loader.load("ai_tbblackboard")); 
        tables.put("ai.TbBlackboard", _TbBlackboard);
        _TbBehaviorTree = new cfg.ai.TbBehaviorTree(loader.load("ai_tbbehaviortree")); 
        tables.put("ai.TbBehaviorTree", _TbBehaviorTree);
        _TbClazz = new cfg.blueprint.TbClazz(loader.load("blueprint_tbclazz")); 
        tables.put("blueprint.TbClazz", _TbClazz);
        _TbDrop = new cfg.bonus.TbDrop(loader.load("bonus_tbdrop")); 
        tables.put("bonus.TbDrop", _TbDrop);
        _TbGlobalConfig = new cfg.common.TbGlobalConfig(loader.load("common_tbglobalconfig")); 
        tables.put("common.TbGlobalConfig", _TbGlobalConfig);
        _TbErrorInfo = new cfg.error.TbErrorInfo(loader.load("error_tberrorinfo")); 
        tables.put("error.TbErrorInfo", _TbErrorInfo);
        _TbCodeInfo = new cfg.error.TbCodeInfo(loader.load("error_tbcodeinfo")); 
        tables.put("error.TbCodeInfo", _TbCodeInfo);
        _TbItem = new cfg.item.TbItem(loader.load("item_tbitem")); 
        tables.put("item.TbItem", _TbItem);
        _TbItemFunc = new cfg.item.TbItemFunc(loader.load("item_tbitemfunc")); 
        tables.put("item.TbItemFunc", _TbItemFunc);
        _TbItemExtra = new cfg.item.TbItemExtra(loader.load("item_tbitemextra")); 
        tables.put("item.TbItemExtra", _TbItemExtra);
        _TbL10NDemo = new cfg.l10n.TbL10NDemo(loader.load("l10n_tbl10ndemo")); 
        tables.put("l10n.TbL10NDemo", _TbL10NDemo);
        _TbPatchDemo = new cfg.l10n.TbPatchDemo(loader.load("l10n_tbpatchdemo")); 
        tables.put("l10n.TbPatchDemo", _TbPatchDemo);
        _TbSystemMail = new cfg.mail.TbSystemMail(loader.load("mail_tbsystemmail")); 
        tables.put("mail.TbSystemMail", _TbSystemMail);
        _TbGlobalMail = new cfg.mail.TbGlobalMail(loader.load("mail_tbglobalmail")); 
        tables.put("mail.TbGlobalMail", _TbGlobalMail);
        _TbRoleLevelExpAttr = new cfg.role.TbRoleLevelExpAttr(loader.load("role_tbrolelevelexpattr")); 
        tables.put("role.TbRoleLevelExpAttr", _TbRoleLevelExpAttr);
        _TbRoleLevelBonusCoefficient = new cfg.role.TbRoleLevelBonusCoefficient(loader.load("role_tbrolelevelbonuscoefficient")); 
        tables.put("role.TbRoleLevelBonusCoefficient", _TbRoleLevelBonusCoefficient);
        _TbTestTag = new cfg.tag.TbTestTag(loader.load("tag_tbtesttag")); 
        tables.put("tag.TbTestTag", _TbTestTag);
        _TbFullTypes = new cfg.test.TbFullTypes(loader.load("test_tbfulltypes")); 
        tables.put("test.TbFullTypes", _TbFullTypes);
        _TbSingleton = new cfg.test.TbSingleton(loader.load("test_tbsingleton")); 
        tables.put("test.TbSingleton", _TbSingleton);
        _TbNotIndexList = new cfg.test.TbNotIndexList(loader.load("test_tbnotindexlist")); 
        tables.put("test.TbNotIndexList", _TbNotIndexList);
        _TbMultiUnionIndexList = new cfg.test.TbMultiUnionIndexList(loader.load("test_tbmultiunionindexlist")); 
        tables.put("test.TbMultiUnionIndexList", _TbMultiUnionIndexList);
        _TbMultiIndexList = new cfg.test.TbMultiIndexList(loader.load("test_tbmultiindexlist")); 
        tables.put("test.TbMultiIndexList", _TbMultiIndexList);
        _TbDataFromMisc = new cfg.test.TbDataFromMisc(loader.load("test_tbdatafrommisc")); 
        tables.put("test.TbDataFromMisc", _TbDataFromMisc);
        _TbMultiRowRecord = new cfg.test.TbMultiRowRecord(loader.load("test_tbmultirowrecord")); 
        tables.put("test.TbMultiRowRecord", _TbMultiRowRecord);
        _TbTestMultiColumn = new cfg.test.TbTestMultiColumn(loader.load("test_tbtestmulticolumn")); 
        tables.put("test.TbTestMultiColumn", _TbTestMultiColumn);
        _TbMultiRowTitle = new cfg.test.TbMultiRowTitle(loader.load("test_tbmultirowtitle")); 
        tables.put("test.TbMultiRowTitle", _TbMultiRowTitle);
        _TbTestNull = new cfg.test.TbTestNull(loader.load("test_tbtestnull")); 
        tables.put("test.TbTestNull", _TbTestNull);
        _TbDemoPrimitive = new cfg.test.TbDemoPrimitive(loader.load("test_tbdemoprimitive")); 
        tables.put("test.TbDemoPrimitive", _TbDemoPrimitive);
        _TbTestString = new cfg.test.TbTestString(loader.load("test_tbteststring")); 
        tables.put("test.TbTestString", _TbTestString);
        _TbDemoGroup = new cfg.test.TbDemoGroup(loader.load("test_tbdemogroup")); 
        tables.put("test.TbDemoGroup", _TbDemoGroup);
        _TbDemoGroup_C = new cfg.test.TbDemoGroup_C(loader.load("test_tbdemogroup_c")); 
        tables.put("test.TbDemoGroup_C", _TbDemoGroup_C);
        _TbDemoGroup_S = new cfg.test.TbDemoGroup_S(loader.load("test_tbdemogroup_s")); 
        tables.put("test.TbDemoGroup_S", _TbDemoGroup_S);
        _TbDemoGroup_E = new cfg.test.TbDemoGroup_E(loader.load("test_tbdemogroup_e")); 
        tables.put("test.TbDemoGroup_E", _TbDemoGroup_E);
        _TbTestGlobal = new cfg.test.TbTestGlobal(loader.load("test_tbtestglobal")); 
        tables.put("test.TbTestGlobal", _TbTestGlobal);
        _TbTestBeRef = new cfg.test.TbTestBeRef(loader.load("test_tbtestberef")); 
        tables.put("test.TbTestBeRef", _TbTestBeRef);
        _TbTestBeRef2 = new cfg.test.TbTestBeRef2(loader.load("test_tbtestberef2")); 
        tables.put("test.TbTestBeRef2", _TbTestBeRef2);
        _TbTestRef = new cfg.test.TbTestRef(loader.load("test_tbtestref")); 
        tables.put("test.TbTestRef", _TbTestRef);
        _TbTestSize = new cfg.test.TbTestSize(loader.load("test_tbtestsize")); 
        tables.put("test.TbTestSize", _TbTestSize);
        _TbTestSet = new cfg.test.TbTestSet(loader.load("test_tbtestset")); 
        tables.put("test.TbTestSet", _TbTestSet);
        _TbDetectCsvEncoding = new cfg.test.TbDetectCsvEncoding(loader.load("test_tbdetectcsvencoding")); 
        tables.put("test.TbDetectCsvEncoding", _TbDetectCsvEncoding);
        _TbItem2 = new cfg.test.TbItem2(loader.load("test_tbitem2")); 
        tables.put("test.TbItem2", _TbItem2);
        _TbDefineFromExcel = new cfg.test.TbDefineFromExcel(loader.load("test_tbdefinefromexcel")); 
        tables.put("test.TbDefineFromExcel", _TbDefineFromExcel);
        _TbDefineFromExcelOne = new cfg.test.TbDefineFromExcelOne(loader.load("test_tbdefinefromexcelone")); 
        tables.put("test.TbDefineFromExcelOne", _TbDefineFromExcelOne);
        _TbTestIndex = new cfg.test.TbTestIndex(loader.load("test_tbtestindex")); 
        tables.put("test.TbTestIndex", _TbTestIndex);
        _TbTestMap = new cfg.test.TbTestMap(loader.load("test_tbtestmap")); 
        tables.put("test.TbTestMap", _TbTestMap);
        _TbExcelFromJson = new cfg.test.TbExcelFromJson(loader.load("test_tbexcelfromjson")); 
        tables.put("test.TbExcelFromJson", _TbExcelFromJson);
        _TbCompositeJsonTable1 = new cfg.test.TbCompositeJsonTable1(loader.load("test_tbcompositejsontable1")); 
        tables.put("test.TbCompositeJsonTable1", _TbCompositeJsonTable1);
        _TbCompositeJsonTable2 = new cfg.test.TbCompositeJsonTable2(loader.load("test_tbcompositejsontable2")); 
        tables.put("test.TbCompositeJsonTable2", _TbCompositeJsonTable2);
        _TbCompositeJsonTable3 = new cfg.test.TbCompositeJsonTable3(loader.load("test_tbcompositejsontable3")); 
        tables.put("test.TbCompositeJsonTable3", _TbCompositeJsonTable3);
        _TbExcelFromJsonMultiRow = new cfg.test.TbExcelFromJsonMultiRow(loader.load("test_tbexcelfromjsonmultirow")); 
        tables.put("test.TbExcelFromJsonMultiRow", _TbExcelFromJsonMultiRow);
        _TbTestSep = new cfg.test.TbTestSep(loader.load("test_tbtestsep")); 
        tables.put("test.TbTestSep", _TbTestSep);
        _TbTestScriptableObject = new cfg.test.TbTestScriptableObject(loader.load("test_tbtestscriptableobject")); 
        tables.put("test.TbTestScriptableObject", _TbTestScriptableObject);
        _TbTestExternalType = new cfg.test.TbTestExternalType(loader.load("test_tbtestexternaltype")); 
        tables.put("test.TbTestExternalType", _TbTestExternalType);
        _TbDemoGroupDefineFromExcel = new cfg.test.TbDemoGroupDefineFromExcel(loader.load("test_tbdemogroupdefinefromexcel")); 
        tables.put("test.TbDemoGroupDefineFromExcel", _TbDemoGroupDefineFromExcel);
        _TbDefineFromExcel2 = new cfg.test.TbDefineFromExcel2(loader.load("test_tbdefinefromexcel2")); 
        tables.put("test.TbDefineFromExcel2", _TbDefineFromExcel2);
        _TbTestExcelBean = new cfg.test.TbTestExcelBean(loader.load("test_tbtestexcelbean")); 
        tables.put("test.TbTestExcelBean", _TbTestExcelBean);
        _TbTestDesc = new cfg.test.TbTestDesc(loader.load("test_tbtestdesc")); 
        tables.put("test.TbTestDesc", _TbTestDesc);

        _TbBlackboard.resolve(tables); 
        _TbBehaviorTree.resolve(tables); 
        _TbClazz.resolve(tables); 
        _TbDrop.resolve(tables); 
        _TbGlobalConfig.resolve(tables); 
        _TbErrorInfo.resolve(tables); 
        _TbCodeInfo.resolve(tables); 
        _TbItem.resolve(tables); 
        _TbItemFunc.resolve(tables); 
        _TbItemExtra.resolve(tables); 
        _TbL10NDemo.resolve(tables); 
        _TbPatchDemo.resolve(tables); 
        _TbSystemMail.resolve(tables); 
        _TbGlobalMail.resolve(tables); 
        _TbRoleLevelExpAttr.resolve(tables); 
        _TbRoleLevelBonusCoefficient.resolve(tables); 
        _TbTestTag.resolve(tables); 
        _TbFullTypes.resolve(tables); 
        _TbSingleton.resolve(tables); 
        _TbNotIndexList.resolve(tables); 
        _TbMultiUnionIndexList.resolve(tables); 
        _TbMultiIndexList.resolve(tables); 
        _TbDataFromMisc.resolve(tables); 
        _TbMultiRowRecord.resolve(tables); 
        _TbTestMultiColumn.resolve(tables); 
        _TbMultiRowTitle.resolve(tables); 
        _TbTestNull.resolve(tables); 
        _TbDemoPrimitive.resolve(tables); 
        _TbTestString.resolve(tables); 
        _TbDemoGroup.resolve(tables); 
        _TbDemoGroup_C.resolve(tables); 
        _TbDemoGroup_S.resolve(tables); 
        _TbDemoGroup_E.resolve(tables); 
        _TbTestGlobal.resolve(tables); 
        _TbTestBeRef.resolve(tables); 
        _TbTestBeRef2.resolve(tables); 
        _TbTestRef.resolve(tables); 
        _TbTestSize.resolve(tables); 
        _TbTestSet.resolve(tables); 
        _TbDetectCsvEncoding.resolve(tables); 
        _TbItem2.resolve(tables); 
        _TbDefineFromExcel.resolve(tables); 
        _TbDefineFromExcelOne.resolve(tables); 
        _TbTestIndex.resolve(tables); 
        _TbTestMap.resolve(tables); 
        _TbExcelFromJson.resolve(tables); 
        _TbCompositeJsonTable1.resolve(tables); 
        _TbCompositeJsonTable2.resolve(tables); 
        _TbCompositeJsonTable3.resolve(tables); 
        _TbExcelFromJsonMultiRow.resolve(tables); 
        _TbTestSep.resolve(tables); 
        _TbTestScriptableObject.resolve(tables); 
        _TbTestExternalType.resolve(tables); 
        _TbDemoGroupDefineFromExcel.resolve(tables); 
        _TbDefineFromExcel2.resolve(tables); 
        _TbTestExcelBean.resolve(tables); 
        _TbTestDesc.resolve(tables); 
    }
}
