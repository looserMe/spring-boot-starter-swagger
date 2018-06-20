package com.wim.config.swagger;

import com.wim.config.swagger.properties.ApiInfoProperties;
import com.wim.config.swagger.properties.DocketProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author wim
 * @version 1.0
 * @since 2018年06月08日
 */
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties implements Serializable {

    private static final long serialVersionUID = 8471755917762607584L;
    private Boolean enable;
    private ApiInfoProperties apiInfo;
    private DocketProperties docket;

    public ApiInfoProperties getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(ApiInfoProperties apiInfo) {
        this.apiInfo = apiInfo;
    }

    public DocketProperties getDocket() {
        return docket;
    }

    public void setDocket(DocketProperties docket) {
        this.docket = docket;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
