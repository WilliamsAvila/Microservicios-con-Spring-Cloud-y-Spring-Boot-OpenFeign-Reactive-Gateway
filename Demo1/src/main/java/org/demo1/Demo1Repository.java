package org.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Demo1Repository extends JpaRepository <Demo1Model, Integer> {


    Demo1Model findByName (String name);
}
