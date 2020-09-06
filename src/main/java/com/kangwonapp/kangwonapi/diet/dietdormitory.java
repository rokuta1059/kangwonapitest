package com.kangwonapp.kangwonapi.diet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(DietDormitoryCompositeKey.class)
public class dietdormitory {

    @Id
    private String date;
    @Id
    private String dormitory;
    @Id
    private String week;
    private String breakfast;
    private String lunch;
    private String dinner;

}
