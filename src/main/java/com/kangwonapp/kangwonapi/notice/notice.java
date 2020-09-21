package com.kangwonapp.kangwonapi.notice;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private String date;
    private String url;

}
