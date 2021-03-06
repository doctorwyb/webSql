package stock.bean;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @ClassName User
 * @Author wuyanbing
 * @DATE 2021/8/10 17:36
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
}
