package repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Book;



public interface BookRepositry extends JpaRepository<Book, Integer>{
	
	

}
