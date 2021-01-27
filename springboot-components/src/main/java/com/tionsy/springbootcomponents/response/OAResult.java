package com.tionsy.springbootcomponents.response;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2020年06月05日 14:52
 * @since 1.0
 */
public final class OAResult<T> {

    private static final int SUCCESS = 20000;
    private static final int ERROR = 500;
    private static final OAResult<?> successResult = new OAResult<>();
    private static final OAResult<?> failedResult = new OAResult<>(500, "error");

    private int state;
    private String message;
    private T data;

    private OAResult() {
        this.state = 20000;
        this.message = "success";
    }

    private OAResult(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public boolean hasSucceeded() {
        return this.state == SUCCESS;
    }

    public static OAResult<?> ok() {
        return successResult;
    }

    public static <T> OAResult<T> ok(T data) {
        OAResult<T> respData = new OAResult<>();
        respData.setState(20000);
        respData.setData(data);
        return respData;
    }

    public static OAResult<?> fail(String message) {
        OAResult<?> respData = new OAResult<>();
        respData.setState(500);
        respData.setMessage(message);
        return respData;
    }

    public static OAResult<?> fail(int code, String message) {
        OAResult<?> respData = new OAResult<>();
        respData.setState(code);
        respData.setMessage(message);
        return respData;
    }

    public static OAResult<?> fail() {
        return failedResult;
    }

    public int getState() {
        return this.state;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

}
