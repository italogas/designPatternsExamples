package com.br.italogas.testproject.designpatterns.prototype;

public abstract class Shape implements Cloneable {
	
	protected String type;
	private String id;

	public abstract void draw();
	
	public String getType(){
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}

}
