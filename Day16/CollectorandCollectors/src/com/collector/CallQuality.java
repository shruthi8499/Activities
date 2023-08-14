package com.collector;

public class CallQuality {
	private int CallDuration;
	private int DropRate;
	private int callRate;
	private String mobileNo;
	public int getCallDuration() {
		return CallDuration;
	}
	public void setCallDuration(int callDuration) {
		CallDuration = callDuration;
	}
	public int getDropRate() {
		return DropRate;
	}
	public void setDropRate(int dropRate) {
		DropRate = dropRate;
	}
	public int getCallRate() {
		return callRate;
	}
	@Override
	public String toString() {
		return "CallQuality [CallDuration=" + CallDuration + ", DropRate=" + DropRate + ", callRate=" + callRate
				+ ", mobileNo=" + mobileNo + "]";
	}
	public void setCallRate(int callRate) {
		this.callRate = callRate;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public CallQuality() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CallQuality(int callDuration, int dropRate, int callRate, String mobileNo) {
		super();
		CallDuration = callDuration;
		DropRate = dropRate;
		this.callRate = callRate;
		this.mobileNo = mobileNo;
	}

}
