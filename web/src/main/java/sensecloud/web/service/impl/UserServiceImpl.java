package sensecloud.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import sensecloud.web.entity.User;
import sensecloud.web.mapper.UserMapper;
import sensecloud.web.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ZhangQiang
 * @since 2020-12-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    public User createUserIfNotExist(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
        if (count(queryWrapper) == 0) {
            save(user);
        }
        return getOne(queryWrapper);
    }

}
