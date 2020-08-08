package com.patientcare.admin.entity;

public class Pillbox {

	private Integer pillboxid;
	private Integer userid;
	private String status;
	private Integer consumed;
	private Integer remaining;
	private String frequency;
	private String time;

	public Integer getPillboxid() {
		return pillboxid;
	}

	public void setPillboxid(Integer pillboxid) {
		this.pillboxid = pillboxid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getConsumed() {
		return consumed;
	}

	public void setConsumed(Integer consumed) {
		this.consumed = consumed;
	}

	public Integer getRemaining() {
		return remaining;
	}

	public void setRemaining(Integer remaining) {
		this.remaining = remaining;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
