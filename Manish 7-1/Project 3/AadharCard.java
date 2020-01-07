package com.deloitte.secondmvn.hibthird.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import org.hibernate.annotations.Entity;
@Entity
public class AadharCard 
{
	@Id
	int aid;
	@Column(name="issue_auth")
	String issueAuth;
	@Column(name="issue_date")
	java.sql.Date issueDate;
	public AadharCard(){}
	public AadharCard(int aid, String issueAuth, Date issueDate)
	{
		this.aid = aid;
		this.issueAuth = issueAuth;
		this.issueDate = issueDate;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getIssueAuth() {
		return issueAuth;
	}
	public void setIssueAuth(String issueAuth) {
		this.issueAuth = issueAuth;
	}
	public java.sql.Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(java.sql.Date issueDate) {
		this.issueDate = issueDate;
	}
	
	

}
