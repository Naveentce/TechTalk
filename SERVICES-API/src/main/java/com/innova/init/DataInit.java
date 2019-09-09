/*
 * package com.innova.init;
 * 
 * import java.text.DateFormat; import java.text.SimpleDateFormat; import
 * java.util.Date;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.ApplicationArguments; import
 * org.springframework.boot.ApplicationRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.innova.dao.TeamDetailsDAO; import
 * com.innova.entity.TeamDetailsEntity;
 * 
 * import java.text.DateFormat; import java.text.SimpleDateFormat; import
 * java.util.Date;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.ApplicationArguments; import
 * org.springframework.boot.ApplicationRunner; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class DataInit implements ApplicationRunner {
 * 
 * private TeamDetailsDAO personDAO;
 * 
 * // private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 * 
 * @Autowired public DataInit(TeamDetailsDAO personDAO) { this.personDAO =
 * personDAO; }
 * 
 * @Override public void run(ApplicationArguments args) throws Exception { long
 * count = personDAO.count();
 * 
 * if (count == 0) { TeamDetailsEntity p1 = new TeamDetailsEntity();
 * 
 * p1.setFullName("vignesh");
 * 
 * // Date d1 = df.parse("1980-12-20"); // p1.setDateOfBirth(d1); //
 * TeamDetailsEntity p2 = new TeamDetailsEntity();
 * 
 * p2.setFullName("naveen"); // Date d2 = df.parse("1985-11-11"); //
 * p2.setDateOfBirth(d2);
 * 
 * personDAO.save(p1); personDAO.save(p2); }
 * 
 * }
 * 
 * }
 */