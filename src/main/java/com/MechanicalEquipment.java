package com;

import java.util.HashMap;
import java.util.Map;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MechanicalEquipment implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    private String packageName;
    private String id;
    Map<Object, Object> data = new HashMap <Object, Object>();

    public MechanicalEquipment() {
       
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
         this.id = id;
    } 

    public String getPackageName(){
        return this.packageName;
    }

    public void setPackageName(String packageName){
         this.packageName = packageName;
    }
    public void setData(Map<Object, Object> map)
    {
        this.data = map;
    }
    public Map<Object, Object> getData()
    {
    return this.data;
    }
 
}