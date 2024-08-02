package com.example.UserRest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserMapperTest {

    public void shouldMapUserToCustomer(){
        //given
        User testUser = new User("TestUser", "testUser@gmail.com");
        testUser.setId(23);

        //when
        Customer testCustomer = UserMapper.INSANCE.userToCustomer(testUser);

        //then
        assertThat(testCustomer).isNotNull();
        assertThat( testCustomer.getIdentification() ).isEqualTo( 23 );
        assertThat( testCustomer.getName() ).isEqualTo( "TestUser" );
        assertThat( testCustomer.getEmail() ).isEqualTo( "testUser@gmail.com" );
    }

}