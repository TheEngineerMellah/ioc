package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("ext")
public class Extension implements IDao {
    @Override
    public Double getData() {
        System.out.println("New extension");
        return 13.00;
    }
}
