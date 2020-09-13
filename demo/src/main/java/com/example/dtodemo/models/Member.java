package com.example.dtodemo.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

// @Data: A annotation class for lombok project.It bundles the features of @ToString, @EqualsAndHashCode, 
// @Getter / @Setter and @RequiredArgsConstructor together
@Data
// @Entity: simplifies Java persistence api(JPA). it provides an Object Relational Mapping approach to map java object 
// to Relational Database Table. it will persist all the fields of relational database, except transient field.
@Entity
// @Table: this annotation specifies the primary table for the annotated entity.
@Table(name= "members")
public class Member {

    // @Id: specifies database table primary key of an mapped entity.
    @Id
    // @GeneratedValue: specification of generation strategies for the values of primary keys. 
    // It takes IDENTITY and AUTO as value.
    @GeneratedValue(strategy= GenerationType.AUTO)
    // @Column: specifies database table mapped column for a persistent property or field.
    @Column(name="member_id")
    private Long id;

    @Column(name="first_name")
    // @NotEmpty, The annotated element must not be null nor empty. 
    // Supported types are: CharSequence, Collection, Map and Array
    @NotEmpty(message="* Please Enter First Name")
    private String firstName;

    @Column(name="last_name")
    @NotEmpty(message="* Please Enter Last Name")
    private String lastName;

    // @Email The string has to be a well-formed email address.
    @Email(message="* Please Enter Valid Email Address")
    @NotEmpty(message=" * Please Provide Email Address")
    @Column(name="email")
    private String email;

}