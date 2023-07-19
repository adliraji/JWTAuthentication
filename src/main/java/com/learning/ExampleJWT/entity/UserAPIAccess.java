package com.learning.ExampleJWT.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "userapiaccess")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAPIAccess {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "usercode", nullable = false)
    private String userCode;

    @Column(name = "username", nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "isactive")
    private String isActive;

    @Column(name = "createddate")
    private Date createdDate;

    @Column(name = "modifieddate")
    private Date modifiedDate;



}
