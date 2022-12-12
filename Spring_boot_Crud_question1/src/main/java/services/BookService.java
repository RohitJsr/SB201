package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Book;
import repositry.BookRepositry;

@Service
public class BookService {

	@Autowired
	private BookRepositry repository;
	
	public Book  saveBook(Book book) {
		return repository.save(book);
		
	}
	
	public List<Book>  saveBooks(List<Book> books) {
		return repository.saveAll(books);
		
	}
	
	public List<Book> getBooks(){
		return repository.findAll();
	}
	
	public Book getBooksByID(int id){
		return repository.findById(id).orElse(null);
		
	}
	
	public String deleteBook(int id) {
		repository.deleteById(id);
		return "book removed || "+id;
		
		
	}
	public Book updateBook(Book book) {
		
		Book existingBook=repository.findById(book.getBook_id()).orElse(null);
		existingBook.setName(book.getName());
		existingBook.setAuthor(book.getAuthor());
		existingBook.setPublication(book.getPublication());
		existingBook.setCategory(book.getCategory());
		existingBook.setPages(book.getPages());
		existingBook.setPrice(book.getPrice());
		
		return repository.save(existingBook);
		
	}
}
