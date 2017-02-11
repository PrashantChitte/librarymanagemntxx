package libraray.entity;

import javax.persistence.*;

@Entity
@Table(name="AuthorTable")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="auth_id")
	private int auth_id;
	
	@Column(name="auth_name")
	private String auth_name;
	
	@OneToOne
	@JoinColumn(name="auth_id")
	private Books book;

	public int getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}
	
	
}
