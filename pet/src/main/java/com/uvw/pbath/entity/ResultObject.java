package com.uvw.pbath.entity;

	/**
	 * 服务器给前端返回数据的统一格式
	 */
public class ResultObject {
	/**返回数据的状态码*/
	private int status;
	/**返回数据的状态描述*/
	private String info;
	/**给前端返回的数据*/
	private Object data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResultObject [status=" + status + ", info=" + info + ", data=" + data + "]";
		}
	}

