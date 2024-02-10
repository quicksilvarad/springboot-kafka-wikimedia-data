package com.quicksilvarad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="wiki_change_data")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Lob
    @Column(name="wikiEventData", length=6555)
    private String wikiEventData;

}
