package com.cn.hnust.pojo;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private Integer age;
    
    private Integer isOpen;
    
    private Integer isAva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	public Integer getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	public Integer getIsAva() {
		return isAva;
	}

	public void setIsAva(Integer isAva) {
		this.isAva = isAva;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", age=" + age + ", isOpen=" + isOpen + ", isAva="
				+ isAva + "]";
	}
	
}