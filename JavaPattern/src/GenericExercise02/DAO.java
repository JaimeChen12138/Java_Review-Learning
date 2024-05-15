package GenericExercise02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
  private Map<String, T> map = new HashMap<>();

  public void save(String id, T entity){
    map.put(id, entity);
  }
  public T get(String id){
    if (map.containsKey(id)){
      return map.get(id);
    }return null;
  }
  public void update(String id, T entity){
    if (map.containsKey(id)){
      map.put(id, entity);
    }
  }
  public List<T> list(){
    List<T> t = new ArrayList<>();
    for (String key : map.keySet()){
      t.add(map.get(key));
    }
    return t;
  }

  public void delete(String id){
    if (map.containsKey(id)){
      map.remove(id);
    }
  }
}
