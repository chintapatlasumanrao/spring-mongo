package com.springmongo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="employee")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    String id;

    @Field("employeeId")
    private String employeeId;

    private String firstName;
    private String middleName;
    private String lastName;

    @DBRef
    private Address address;

}
