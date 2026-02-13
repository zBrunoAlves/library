package com.library.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_book")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Integer releaseYear;
	private Integer quantity;
	private BigDecimal price;

	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	public Book() {
		super();
	}

	public Book(Long id, String title, Integer releaseYear, Integer quantity, BigDecimal price, Genre genre,
			Author author) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.quantity = quantity;
		this.price = price;
		this.genre = genre;
		this.author = author;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public Genre getGenre() {
		return genre;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", releaseYear=" + releaseYear + ", quantity=" + quantity
				+ ", price=" + price + ", genre=" + genre + ", author=" + author + "]";
	}
	
	
}
