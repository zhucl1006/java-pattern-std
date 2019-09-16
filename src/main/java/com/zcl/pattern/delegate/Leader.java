package com.zcl.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    private Map<String,IEmp> empList = new HashMap<String, IEmp>();

    public Leader(){
        empList.put("加密",new EmpA());
        empList.put("架构",new EmpB());
    }
    public  void doing(String command){
        empList.get(command).doing(command);
    }
}
