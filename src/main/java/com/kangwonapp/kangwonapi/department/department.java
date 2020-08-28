package com.kangwonapp.kangwonapi.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="knuape_department")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class department {

    @Id
    private String id;
    private String college;
    private String department;
    private String callnumber;
    private String location;

    @Column(name="map_address")
    private String mapAddress;

}
