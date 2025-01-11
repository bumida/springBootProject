package jpabook.jpashop.mapper;

import jpabook.jpashop.command.UserCommand;
import jpabook.jpashop.entity.UserRequest;
import org.mapstruct.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Mapper(builder = @Builder(disableBuilder = false))
public interface UserMapper {


    //@Mapping(target = "respDate", ignore = true) //AfterMapping에서 처리
    //@Mapping(target = "respTime", ignore = true) //AfterMapping에서 처리
    //pullRequest 내용도 수정이 되는지 확인
    //
    @Mapping(target = "email")
    @Mapping(target = "role")
    UserCommand toCommand(UserRequest UserRequest, String request, String msg);

    @AfterMapping
    default void setCurrentDateAndTime(@MappingTarget UserCommand.UserCommandBuilder builder){
        builder.respDate(getCurrentDate());
        builder.respTime(getCurrentTime());
    }

    default  String getCurrentDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    default  String getCurrentTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

}
