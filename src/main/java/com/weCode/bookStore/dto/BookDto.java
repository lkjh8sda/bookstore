package com.weCode.bookStore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Details about the book")
public class BookDto {

    @Schema(description = "UUID", example = "f37e6521-6540-495b-9454-ef5dc7dc19f8")
    private UUID id;
    private String title;
    private String description;
    private int releaseYear;

}
