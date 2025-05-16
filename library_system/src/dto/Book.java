package dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishedYear;
    private String isbn;
    private boolean available;


}
