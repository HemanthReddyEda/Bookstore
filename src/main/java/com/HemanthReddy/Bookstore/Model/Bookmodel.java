package com.HemanthReddy.Bookstore.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BookDetails")
@AllArgsConstructor
@NoArgsConstructor
public class Bookmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BookId")
    public int bookId;
    @Column(name="BookName")
    public String bookName;
    @Column(name="AuthorName")
    public String AuthorName;
    @Column(name="BookPrice")
    public int bookPrice;
    @Column(name="Category")
    public String category;
}
