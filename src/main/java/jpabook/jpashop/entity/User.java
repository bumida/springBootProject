package jpabook.jpashop.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String role;


}
