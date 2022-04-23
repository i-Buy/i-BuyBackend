package Ecommerce.IBuy.business.concretes;

import Ecommerce.IBuy.business.abstracts.UserService;
import Ecommerce.IBuy.core.dataAccess.UserDao;
import Ecommerce.IBuy.core.entities.User;
import Ecommerce.IBuy.core.utilities.results.DataResult;
import Ecommerce.IBuy.core.utilities.results.Result;
import Ecommerce.IBuy.core.utilities.results.SuccessDataResult;
import Ecommerce.IBuy.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    @Autowired //nesnenin referansını bize verecek
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
    }
}
