package Ecommerce.IBuy.business.abstracts;

import Ecommerce.IBuy.core.entities.User;
import Ecommerce.IBuy.core.utilities.results.DataResult;
import Ecommerce.IBuy.core.utilities.results.Result;

public interface UserService{
    Result add(User user);
    DataResult<User> findByEmail(String email);

}
