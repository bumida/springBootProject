import jpabook.jpashop.command.UserCommand;
import jpabook.jpashop.entity.UserRequest;
import jpabook.jpashop.mapper.UserMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserMapperTest {

    private UserMapper userMapper;

    @BeforeEach
    public void setup(){
        userMapper = Mappers.getMapper(UserMapper.class);


    }

    @Test
    public void testCommandWithAfterMapping() {
        // UserRequest 객체 생성
        UserRequest userRequest = new UserRequest(
                "als","ddd","ddddd","ADMIN","2025-01-11","222"
        );

        String request = "testRequest";
        String msg = "testMsg";


        UserCommand userCommand = userMapper.toCommand(userRequest, request, msg);

        System.out.println(userCommand);
        assertEquals("2025-01-12", userCommand.getRespDate());
        assertEquals("ADMIN", userCommand.getRole());

    }
}
