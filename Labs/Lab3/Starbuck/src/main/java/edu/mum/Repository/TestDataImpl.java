package edu.mum.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDataImpl implements DataFacade {

   @Autowired
   Database data;

   // Private constructor. Prevents instantiation from other classes.
   private TestDataImpl() {

   }

   public String findPassword (String name ) {
        String expectedPassword = data.getPassword(name);
       return expectedPassword;
   }
   public List<String> getAdvice(String roast) {
       return data.getAdvice(roast);
   }
}



