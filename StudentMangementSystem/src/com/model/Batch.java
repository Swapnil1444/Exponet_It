package com.model;

public class Batch {

	private int bid;
	private String batchName;
	private Faculty faculty;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", batchName=" + batchName + ", faculty=" + faculty + "]";
	}

}
