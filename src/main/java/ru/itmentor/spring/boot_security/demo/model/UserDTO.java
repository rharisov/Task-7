package ru.itmentor.spring.boot_security.demo.model;

public class UserDTO {

    private Long id;

    private String name;

    private String lastName;

    private Integer salary;

    private String email;

    private String password;

    public UserDTO(Long id, String name, String lastName, Integer salary, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
