package me.entity;

/**
 * �û���
 * @author lihongyong
 *
 */
public class User {
      
	 //ʵ��������Ժͱ���ֶ�����һһ��Ӧ
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
