package com.dsk.repository.primary;

import com.dsk.bean.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author dsk
 * @version 1.0.0
 */
public interface BlogRepository extends JpaRepository<User, Long> {


}