package jpabook.jpashop.command;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserCommand {
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String respTime;
    private String respDate;



}
