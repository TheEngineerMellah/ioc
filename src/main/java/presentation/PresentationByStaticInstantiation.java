package presentation;

import dao.DaoImp;
import metier.MetierImpl;


public class PresentationByStaticInstantiation {
    public static void main(String[] args) throws Exception {
        DaoImp daoImp = new DaoImp();
        MetierImpl metier = new MetierImpl();
        metier.setDao(daoImp);

        metier.calculate();
    }
}











