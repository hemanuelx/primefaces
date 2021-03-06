/*
 * Copyright 2009 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.examples.bookstore.view;

import javax.faces.event.ActionEvent;

import org.primefaces.examples.bookstore.domain.Book;
import org.primefaces.examples.bookstore.repository.BookRepository;
import org.primefaces.optimus.application.FacesMessages;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;

import com.google.inject.Inject;

@Controller(name="createBookController", scope=Scope.REQUEST)
public class CreateBookController {

	private Book book = new Book();
	
	private BookRepository bookRepository;
	
	@Inject 
	private FacesMessages messages;
	
	@Inject
	public CreateBookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void save(ActionEvent actionEvent) {
		bookRepository.createNew(book);
		
		messages.addInfo("Completed", book.getTitle() + " is saved");
		
		book = new Book();
	}
}
