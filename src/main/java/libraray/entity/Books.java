package libraray.entity;

import javax.persistence.*;

@Entity
@Table(name="BookTable")
public class Books {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="book_id")
	private int book_id;
	
	@Column(name="Book_Name")
	private String book_name;		
	
	@Column(name="avail_status")
	private String avail_status;
	
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="book_id")
	private Members member;
	
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="book_id")
	private Author author;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}	

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAvail_status() {
		return avail_status;
	}

	public void setAvail_status(String avail_status) {
		this.avail_status = avail_status;
	}

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
