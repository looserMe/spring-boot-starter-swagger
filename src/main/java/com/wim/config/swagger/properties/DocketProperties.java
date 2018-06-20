package com.wim.config.swagger.properties;

/**
 * @author wim
 * @version 1.0
 * @since 2018年06月08日
 */
public class DocketProperties implements java.io.Serializable {

    private static final long serialVersionUID = 3342663558680329645L;

    private String groupName;
    private String basePackage;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }
}
