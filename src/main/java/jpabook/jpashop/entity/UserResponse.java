package jpabook.jpashop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class UserResponse {
    private String fullName;
    private String email;
    private boolean isAdmin;
    private String createdAt;
}
