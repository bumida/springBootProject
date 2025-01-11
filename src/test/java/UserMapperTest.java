import jpabook.jpashop.command.UserCommand;
import jpabook.jpashop.entity.UserRequest;
import jpabook.jpashop.mapper.UserMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
                "als",
                "ddd",
                "ddddd",
                "ADMIN",
                null,
                null
        );

        String request = "testRequest";
        String msg = "testMsg";

        UserCommand userCommand = userMapper.toCommand(userRequest, request, msg);

        String expectedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String expectedTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(userCommand);
        assertEquals(expectedDate, userCommand.getRespDate());
        assertEquals("ADMIN", userCommand.getRole());
        assertEquals(expectedTime, userCommand.getRespTime());

    }
}
