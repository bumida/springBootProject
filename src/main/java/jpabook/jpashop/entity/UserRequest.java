package jpabook.jpashop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
//
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String respDate;
    private String respTime;


}
