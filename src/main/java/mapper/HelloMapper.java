package mapper;

import entity.User;

import java.util.List;
import java.util.Map;

public interface HelloMapper {

    void insert(User user);

    void delete(List<String> ids);

    void update(User user);

    List<User> query(Map<String,Object> map);

}
