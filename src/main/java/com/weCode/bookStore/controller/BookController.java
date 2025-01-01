package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDto;
import com.weCode.bookStore.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Operation(
            summary = "Get list of books",
            description = "Retrieve a list of all books in the system",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved list of books"),
                    @ApiResponse(responseCode = "403", description = "Access to the resource is forbidden"),
                    @ApiResponse(responseCode = "404", description = "Resource not found")
            }
    )
    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        List<BookDto> books = bookService.getBooks();

        return ResponseEntity.ok(books);
    }
}
