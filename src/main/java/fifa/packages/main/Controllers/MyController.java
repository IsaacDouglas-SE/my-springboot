package fifa.packages.main.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import fifa.packages.main.Data.Fifa;
import fifa.packages.main.Services.FifaRepo;


@RestController
public class MyController {
	
@Autowired
private FifaRepo repo;

@GetMapping("/ShowAll")
public ArrayList<Fifa> ShowAll(){
	System.out.println("reached ");
	return repo.findAll();

}

	@GetMapping("/findByPosition/{R}")
	public ArrayList<Fifa> findByPosition(@PathVariable String R) {
		return repo.findByPosition(R);
}
@GetMapping("/findByPlayername/{N}")
public ArrayList<Fifa> findByPlayername(@PathVariable String N){
	return repo.findByPlayername(N);
//	
}
//@GetMapping("/filterBydept1/{department}/{subject}")
//public ArrayList<Fifa> anondept(@PathVariable String department,@PathVariable String subject ){
//	return repo.findByDeptAndSubject(department,subject);
//}
@GetMapping("/findrating/{m11}")
public ArrayList<Fifa> anondept2(@PathVariable int m11){
	return repo.findByRatingGreaterThan(m11);
}
@GetMapping("findByPriceBetween/{m11}/{m22}")	
public ArrayList<Fifa> findByPriceBetween(@PathVariable int m11,@PathVariable int m22){
	return repo.findByPriceBetween(m11,m22);
}
//@GetMapping("/marksgreaterthan/{number1}")
//public ArrayList<Fifa> anything(@PathVariable int number1){
//	return repo.findByMarksGreaterThanEqual(number1);
//}
//@PostMapping("/CreatePlayer")
//	public String Savedata(@RequestBody Fifa newPlayer) {
//		repo.save(newPlayer);
//		return null;
//	
//}
//		
//}
//@DeleteMapping("/deleteByPlayername/{playername}")
//public String deleteByPlayername(@PathVariable String playername) {
//	Fifa file = repo.deleteByPlayername(playername);
//if(file != null){
//	repo.delete(file);
//}
//else {
//	return "Record does not exist";
//}
//	return "file deleted";
//}
//@PostMapping("/Save3")
//public String SaveData(@RequestBody Fifa Ref) {
//if(Ref.getRegno()==15){
//	return "Sorry Isaac";
//}
//else{
//	repo.save(Ref);
//}
//return null;
}
//Jon code
//@Service
//public class TrainerService {
//
//	@Autowired
//	private TrainerRepository trainerRepo;
//
//	public TrainerService() {
//
//	}
//
//	public List<Trainer> getAllTrainer() {
//		if (trainerRepo.findAll().isEmpty()) {
//			setUpTrainers();
//		}
//		return trainerRepo.findAll();
//	}
//
//	public Trainer addNewTrainer(Trainer trainer) {
//		return trainerRepo.save(trainer);
//	}
//
//	public Trainer updateTrainer(Trainer trainer) {
//		return trainerRepo.save(trainer);
//	}
//
//	public String deleteTrainer(Long id) {
//		trainerRepo.deleteById(id);
//		return "Trainer succesfully deleted";
//	}
//	
//	private void setUpTrainers() {
//		Trainer john = new Trainer("John", "Gordon");
//		Trainer chris = new Trainer("Chris", "Perrins");
//		trainerRepo.save(john);
//		trainerRepo.save(chris);
//	}
//}
// new code
//@PostMapping("/AddNewPlayer")
//public Trainer addNewTrainer(@RequestBody Trainer trainer) {
//	return trainerService.addNewTrainer(trainer);
//}
//
//@PutMapping("/UpdatePlayer")
//public Trainer updateTrainer(@RequestBody Trainer trainer) {
//	return trainerService.updateTrainer(trainer);
//}
//
//@DeleteMapping("/DeletePlayer/{id}")
//public String deleteTrainer(@PathVariable(value = "id") Long id) {
//	return trainerService.deleteTrainer(id);
//






