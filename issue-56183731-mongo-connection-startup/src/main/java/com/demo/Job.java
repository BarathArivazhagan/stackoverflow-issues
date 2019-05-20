package com.demo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Document(collection = "Jobs")
public class Job {
    @Id
    private String id = null;
    private String field;
}