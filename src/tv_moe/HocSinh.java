package tv_moe;

import java.util.Scanner;

public class HocSinh {
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("Tên: "+this.getName() + ", tuổi: "+this.getAge());
	}


}
