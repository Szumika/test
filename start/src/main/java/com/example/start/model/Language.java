package com.example.start.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Language {
    @Id
    private Long languageId;
    private String name;
}
