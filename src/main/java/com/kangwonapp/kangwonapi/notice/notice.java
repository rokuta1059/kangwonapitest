package com.kangwonapp.kangwonapi.notice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class notice {

    @Id
    private Long id;

    private String department;
    private String notice;
    private String name;
    private String date;
    private String url;

}
