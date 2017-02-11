package libraray.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Table(name="MemberTable")
public class Members {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="member_id")
	private int member_id;
	
	@Column(name="member_name")
	private String member_name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="member_id") 
	private Books book;

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	} 
	
}
