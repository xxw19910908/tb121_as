package cn.bdqn.as.bo;

import java.util.List;

import cn.bdqn.as.entity.User;

public class UserDg {
	private Integer total;
	private List<User> rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<User> getRows() {
		return rows;
	}
	public void setRows(List<User> rows) {
		this.rows = rows;
	}
	
	
}
