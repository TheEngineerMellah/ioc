package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao{
    @Override
    public Double getData() {
        return Math.random()*40;
    }
}
