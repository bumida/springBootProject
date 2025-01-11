package jpabook.jpashop.mapper;

import javax.annotation.processing.Generated;
import jpabook.jpashop.command.UserCommand;
import jpabook.jpashop.entity.UserRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-12T00:32:12+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand toCommand(UserRequest UserRequest, String request, String msg) {
        if ( UserRequest == null && request == null && msg == null ) {
            return null;
        }

        UserCommand.UserCommandBuilder userCommand = UserCommand.builder();

        if ( UserRequest != null ) {
            userCommand.email( UserRequest.getEmail() );
            userCommand.role( UserRequest.getRole() );
            userCommand.firstName( UserRequest.getFirstName() );
            userCommand.lastName( UserRequest.getLastName() );
            userCommand.respTime( UserRequest.getRespTime() );
            userCommand.respDate( UserRequest.getRespDate() );
        }

        setCurrentDateAndTime( userCommand );

        return userCommand.build();
    }
}
