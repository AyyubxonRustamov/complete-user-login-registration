package ayyubxon.rustamov.completeuserloginregistration.repository;

import ayyubxon.rustamov.completeuserloginregistration.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository {

    Optional<User> findByEmail(String email);
}
