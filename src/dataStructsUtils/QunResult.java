package dataStructsUtils;

import java.util.List;

public class QunResult {
	
	private String qunNumber;
	private String qunNickName;
	private String qunCreateTime;
	private String qunTotalMember;
	private String qunDescription;
	private List<QQResult> qqResults;
	
	
	
	
	public String getQunNumber() {
		return qunNumber;
	}
	public void setQunNumber(String qunNumber) {
		this.qunNumber = qunNumber;
	}
	public String getQunNickName() {
		return qunNickName;
	}
	public void setQunNickName(String qunNickName) {
		this.qunNickName = qunNickName;
	}
	public String getQunCreateTime() {
		return qunCreateTime;
	}
	public void setQunCreateTime(String qunCreateTime) {
		this.qunCreateTime = qunCreateTime;
	}
	public String getQunTotalMember() {
		return qunTotalMember;
	}
	public void setQunTotalMember(String qunTotalMember) {
		this.qunTotalMember = qunTotalMember;
	}
	public String getQunDescription() {
		return qunDescription;
	}
	public void setQunDescription(String qunDescription) {
		this.qunDescription = qunDescription;
	}
	public List<QQResult> getQqResults() {
		return qqResults;
	}
	public void setQqResults(List<QQResult> qqResults) {
		this.qqResults = qqResults;
	}
	
	
	

}
