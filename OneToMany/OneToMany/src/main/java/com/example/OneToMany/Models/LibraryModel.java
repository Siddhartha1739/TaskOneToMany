package com.example.OneToMany.Models;


import com.example.OneToMany.Entity.Books;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LibraryModel {
    private int LibraryID;
    private String Name;
    private String Location;
    private long ContactInformation;
    private List<Books> books=new ArrayList<>();

    public int getLibraryID() {
        return LibraryID;
    }

    public void setLibraryID(int libraryID) {
        LibraryID = libraryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public long getContactInformation() {
        return ContactInformation;
    }

    public void setContactInformation(long contactInformation) {
        ContactInformation = contactInformation;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
