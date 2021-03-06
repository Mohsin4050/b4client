package com.ehelpy.brihaspati4.authenticate;

//Lt Col Raja Vijit Dated 22 May 2018 ; 1230 Hrs
//This function ensures that only one instance of the package is running
//so that no duplicate entries are found

public class GlobalObject {
    
@SuppressWarnings("unused")
    private static GlobalObject GlobalObj;
    private boolean Certificate_Status = false;
    private boolean Generic_status = true; // generic services running
    private boolean Specific_status = false; //specific services not running
    private static boolean running_status = true;

    public static synchronized GlobalObject getGlobalObject()
    {
        if (GlobalObj == null) GlobalObj = new GlobalObject();
        return GlobalObj;
    }

    public static void setRunStatus(boolean flag)
    {
        running_status = flag;
    }

    public static boolean getRunStatus()
    {
        return running_status ;
    }

}

