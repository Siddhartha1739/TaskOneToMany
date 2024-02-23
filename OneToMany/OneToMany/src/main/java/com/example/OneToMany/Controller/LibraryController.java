package com.example.OneToMany.Controller;

import ch.qos.logback.core.model.Model;
import com.example.OneToMany.Entity.Books;
import com.example.OneToMany.Entity.Library;
import com.example.OneToMany.Models.BooksModel;
import com.example.OneToMany.Models.LibraryModel;
import com.example.OneToMany.Repository.BooksRepository;
import com.example.OneToMany.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    public int libId=0;
    @RequestMapping("/first")
    public String first(){
        return "first";
    }
    @RequestMapping("/addLibrary")
    public String addLibrary(ModelMap model, LibraryModel libraryModel){
        model.addAttribute("libraryModel",libraryModel);
        return "addLib";
    }
    @RequestMapping("/addedLib")
    public String addedLib(LibraryModel libraryModel,ModelMap model,Library library){
        libraryService.addLibrary(libraryModel);
        List<LibraryModel> library1= libraryService.getAll();
        model.addAttribute("libraryList",library1);
        return "viewLib";
    }


    @RequestMapping("/viewLib")
    public String viewLib(ModelMap model){
        List<LibraryModel> library= libraryService.getAll();
        model.addAttribute("libraryList",library);
        return "viewLib";
    }

    @RequestMapping("/updateLibrary")
    public String updateLibrary(int LibraryID,ModelMap model ){
        Library library= libraryService.getLibraryBYId(LibraryID);
        String Name=library.getName();
        String Location=library.getLocation();
        long ContactInformation=library.getContactInformation();
        model.addAttribute("Id",LibraryID);
        model.addAttribute("Name",Name);
        model.addAttribute("Location",Location);
        model.addAttribute("ContactInformation",ContactInformation);
        return "updating";
    }
    @RequestMapping("/updatedLibrary")
    public String updated(int LibraryID,String Name,String Location,long ContactInformation,ModelMap model){
        libraryService.updateLibrary(LibraryID,Name,Location,ContactInformation);
        List<LibraryModel> library= libraryService.getAll();
        model.addAttribute("libraryList",library);
        return "viewLib";
    }


    @RequestMapping("/updateBooks")
    public String updateBooks(int BookId,ModelMap model ){
        Books books= libraryService.getBooksBYId(BookId);
        String Name=books.getBookName();
        String Author=books.getAuthor();
        int NumberOfPages=books.getNumberOfPages();
        model.addAttribute("BookId",BookId);
        model.addAttribute("BookName",Name);
        model.addAttribute("Author",Author);
        model.addAttribute("NumberOfPages",NumberOfPages);
        return "updatingBooks";
    }


    @RequestMapping("/viewBooks")
    public String viewBooks(ModelMap model,int LibraryID){
        List<BooksModel> books= libraryService.getbooksByLibrary(LibraryID);
        model.addAttribute("booksList",books);
        return "viewBooks";
    }

    @RequestMapping("/deleteLib")
    public String deleteLib(@RequestParam("LibraryID") int LibraryID,ModelMap model){
        libraryService.delLibrary(LibraryID);
        List<LibraryModel> library= libraryService.getAll();
        model.addAttribute("libraryList",library);
        return "viewLib";
    }


    @RequestMapping("/addBooks")
    public String addBooks(@RequestParam("LibraryID") int LibraryID, ModelMap model,BooksModel booksModel){
        libId=LibraryID;
        model.addAttribute("booksModel",booksModel);
        return "addBooks";
    }
    @RequestMapping("/addedBooks")
    public String addedBooks( BooksModel booksModel, ModelMap model){
        libraryService.addBooks(booksModel,libId);
        List<LibraryModel> library= libraryService.getAll();
        model.addAttribute("libraryList",library);
        return "viewLib";
    }

    @RequestMapping("/updatedBooks")
    public String updatedBooks(int BookId,String BookName,String Author,int NumberOfPages,ModelMap model){
        libraryService.updateBooks(BookId,BookName,Author,NumberOfPages);
        List<BooksModel> books= libraryService.getbooksByLibrary(libId);
        model.addAttribute("booksList",books);
        return "viewBooks";
    }

    @RequestMapping("/deleteBooks")
    public String deleteBooks(@RequestParam("BookId") int BookId,ModelMap model){
        libraryService.delBooks(BookId);
        List<BooksModel> books= libraryService.getbooksByLibrary(libId);
        model.addAttribute("booksList",books);
        return "viewBooks";
    }
}
