package me.entity;

/**
 * 用户表
 * @author lihongyong
 *
 */
public class User {
      
	 //实体类的属性和表的字段名称一一对应
	private String id;
	private String name;
	private String login_name;
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", login_name=" + login_name + "]";
    }
}
