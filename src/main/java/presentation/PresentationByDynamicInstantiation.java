package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PresentationByDynamicInstantiation {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao daoInstance = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metierInstance = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        Method calculate = cMetier.getMethod("calculate");

        method.invoke(metierInstance, daoInstance);
        calculate.invoke(metierInstance);

    }
}











