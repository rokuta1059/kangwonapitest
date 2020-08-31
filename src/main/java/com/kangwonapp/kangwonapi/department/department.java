package com.kangwonapp.kangwonapi.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_backup")
public class department {

    @Id
    private String id;
    private String college;
    private String department;
    private String callnumber;
    private String location;
    @Column(name="map")
    private String mapAddress;
    private String site;
    @Column(name="site_append")
    private String siteAppend;
    private String crf;

}
