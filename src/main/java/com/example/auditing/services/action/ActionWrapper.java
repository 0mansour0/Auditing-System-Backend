package com.example.auditing.services.action;

import java.util.List;
import java.util.Map;

public class ActionWrapper {
    private String applicationName;
    private String userName;
    private String beName;
    private String actionType;

    private List<Map<String,Map<String,String>>> params;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBeName() {
        return beName;
    }

    public void setBeName(String beName) {
        this.beName = beName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public List<Map<String, Map<String, String>>> getParams() {
        return params;
    }

    public void setParams(List<Map<String, Map<String, String>>> params) {
        this.params = params;
    }
}
