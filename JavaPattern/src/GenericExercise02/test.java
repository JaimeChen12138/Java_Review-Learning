package GenericExercise02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class test {

  @Test
  public void save(){
    User user1 = new User(1, 21, "yujin");
    DAO<User> dao = new DAO<>();
    dao.save("2", user1);
    assertEquals(dao.get("2").getAge(), 21);
    assertEquals(dao.get("2").getName(), "yujin");


  }
}
