package com.example.OneToMany.Models;

import  lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BooksModel {
        private int BookId;
        private String BookName;
        private String Author;
        private int NumberOfPages;
}
