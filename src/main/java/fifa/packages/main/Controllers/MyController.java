package fifa.packages.main.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public Fifa findByPlayername(@PathVariable String N){
	return repo.findByPlayername(N);
}
@GetMapping("/findrating/{m11}")
public ArrayList<Fifa> anondept2(@PathVariable int m11){
	return repo.findByRatingGreaterThan(m11);
}
@GetMapping("findByPriceBetween/{m11}/{m22}")	
public ArrayList<Fifa> findByPriceBetween(@PathVariable int m11,@PathVariable int m22){
	return repo.findByPriceBetween(m11,m22);
}
@PostMapping("/CreatePlayer")
	public String Savedata(@RequestBody Fifa newPlayer) {
		repo.save(newPlayer);
		return null;
}
//}
@DeleteMapping("/deleteByPlayername/{playername}")
public String deleteByPlayername(@PathVariable String playername) {
	Fifa temp = (repo.findByPlayername(playername));
	
repo.delete(temp);
//	Fifa file = repo.deleteByPlayername(id);

//	repo.delete(file);
//}
//else {
//	return "Record does not exist";
//}
//	return "file deleted";
	return null;
}


@PutMapping("/UpdatePlayer/{playername}")
public String updatePlayer(@PathVariable String playername, @RequestBody Fifa playername1) {
	Fifa updated = (repo.findByPlayername(playername));
	updated.setClub(playername1.getClub());
	updated.setPlayername(playername1.getPlayername());
	updated.setRating(playername1.getRating());
	updated.setLeague(playername1.getLeague());
	updated.setPosition(playername1.getPosition());
	updated.setPrice(playername1.getPrice());
	updated.setQuality(playername1.getQuality());
	updated.setNationality(playername1.getNationality());
	repo.save(updated);
	return null;
}

}







