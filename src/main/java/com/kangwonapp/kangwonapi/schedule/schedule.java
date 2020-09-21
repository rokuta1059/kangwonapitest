package com.kangwonapp.kangwonapi.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class schedule {

    @Id
    private Integer id;
    private Date startdate;
    private Date enddate;
    private String description;
}
