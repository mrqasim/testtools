package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.account;
/**
*  @author author
*/
public interface accountBaseMapper {

    int insertaccount(account object);

    int updateaccount(account object);

    int update(account.UpdateBuilder object);

    List<account> queryaccount(account object);

    account queryaccountLimit1(account object);

}