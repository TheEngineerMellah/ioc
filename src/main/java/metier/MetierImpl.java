package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{

    @Autowired
    @Qualifier("ext")
    private IDao dao;
    @Override
    public void calculate() {
        System.out.println(dao.getData());
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
