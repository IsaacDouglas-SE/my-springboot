package fifa.packages.main.Services;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fifa.packages.main.Data.Fifa;

@Repository
public interface FifaRepo extends JpaRepository<Fifa,String>{
	public ArrayList<Fifa> findAll();
	public ArrayList<Fifa> findByPlayername(String x);
	public ArrayList<Fifa> findByPosition(String Deptanon);
//	public ArrayList<Fifa> findByDeptAndSubject(String Deptanon, String Subject);
	public ArrayList<Fifa> findByRatingGreaterThan(int m);
	public ArrayList<Fifa> findByPriceBetween(int m1,int m2);
//	public ArrayList<Fifa> findByMarksGreaterThanEqual(int number1);
//	public Fifa deleteByPlayername(String playername);

}

