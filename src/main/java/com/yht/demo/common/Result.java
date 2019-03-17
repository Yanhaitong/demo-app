package com.yht.demo.common;
/**
 * 请求结果格式化处理实体类
 * @author yangrenzhi
 *
 */
public class Result<T>{
	/*错误码*/
	private Integer code;
	/*提示信息*/
	private String msg;
	/*具体的内容*/
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static Result success(String msg) {
		Result result = new Result();
		result.setCode(200);
		result.setMsg(msg);
		return result;
	}

	public static<T> Result success(T data) {
		Result result = new Result();
		result.setCode(200);
		result.setMsg("成功");
		result.setData(data);
		return result;
	}

	public static Result error(Integer code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
 		return result;
	}

}