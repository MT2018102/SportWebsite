package com.test.product.beans;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class User {

    @Id
    private int id;

    //JSR 380 Annotation
    @Size(min=6, message ="{username.can.not.be.less.than.six.character}")
    private String username;

    @Pattern(regexp = "((?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,12})",
             message = "{password.should.range.between.eightToTen}")
    private String password;

    /*To save Gender as String in Database. Default is EnumType.Ordinal*/
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull(message = "{activity.can.not.be.null}")
    private String activity;

    @NotEmpty(message = "{firstname.can.not.be.empty}")
    private String firstName;

    @NotEmpty(message = "{lastname.can.not.be.empty}")
    private String lastName;

    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public String getActivity() {
        return activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
