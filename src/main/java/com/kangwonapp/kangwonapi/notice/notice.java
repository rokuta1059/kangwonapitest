package com.kangwonapp.kangwonapi.notice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class notice {

    @Id
    @Column(name="notice_id")
    private String id;

    @Column(name="department_id")
    private String department;
    private String announce;
    private String name;
    private String date;
    private String url;

}
