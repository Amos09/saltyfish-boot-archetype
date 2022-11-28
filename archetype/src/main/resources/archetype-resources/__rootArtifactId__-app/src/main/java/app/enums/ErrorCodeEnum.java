#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.enums;


import ${groupId}.framework.common.exception.IResultCode;
import lombok.AllArgsConstructor;

/**
 * System 错误码枚举类
 *
 * system 系统，使用 1-004-000-000 段
 */
@AllArgsConstructor
public enum ErrorCodeEnum implements IResultCode {
    
    DATA_NOT_EXISTS(1004001000, "数据不存在"),

    ;

    private Integer code;
    private String message;

    @Override
    public Integer getCode() {
        return this.code;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
