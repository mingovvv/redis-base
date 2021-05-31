package com.devyu.redis;

import com.devyu.redis.model.Person;
import com.devyu.redis.repository.RedisRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisRepository redisRepository;

    @Test
    @DisplayName("레디스 저장 테스트")
    void redisSave() {
        Person person = Person.builder()
                        .id("devyu")
                        .firstName("민")
                        .lastName("장").build();

//        Person person2 = Person.builder()
//                .id(null) // ID값을 null로 설정할 경우, redis KEY는 임의의 값이 들어간다.
//                .firstName("빈")
//                .lastName("임").build();

        Person saveedPerson = redisRepository.save(person);

        Optional<Person> findPerson = redisRepository.findById(saveedPerson.getId());

        Assertions.assertThat(findPerson.isPresent()).isEqualTo(Boolean.TRUE);
        Assertions.assertThat(findPerson.get().getFirstName()).isEqualTo(person.getFirstName());
    }

}
