package com.dsk.repository.primary;

import com.dsk.bean.primary.User;
import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * @author dsk
 * @version 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Long> {


}