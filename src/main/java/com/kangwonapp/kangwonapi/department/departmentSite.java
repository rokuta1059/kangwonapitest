package com.kangwonapp.kangwonapi.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="knuapi_department_site")
public class departmentSite extends department{

    private String site;
    @Column(name="site_append")
    private String siteAppend;
    private String crf;
}
