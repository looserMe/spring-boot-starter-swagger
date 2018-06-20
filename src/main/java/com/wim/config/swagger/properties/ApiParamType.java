package com.wim.config.swagger.properties;

/**
 * 方便Swagger 中 @ApiImplicitParam(paramType = ApiParamType.HEADER)
 *
 * @author wim
 * @version 1.0
 * @since 2018年06月08日
 */
public final class ApiParamType {

    public final static String QUERY = "query";
    public final static String HEADER = "header";
    public final static String PATH = "path";
    public final static String BODY = "body";
    public final static String FORM = "form";
}
