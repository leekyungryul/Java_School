package com.kopo.lkr;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
//		c드라이브의 tomcat디렉터리에 studentScore라는 이름의 db를 만들고 그 db안에 student 이름의 테이블을 생성한다.
		DBCommon <Student> db = new DBCommon <Student>("c:/tomcat/studentScore.db", "student");
		db.createTable(new Student());
//		message변수에 "테이블이 생성되었습니다."라는 내용을 대입한다.
		model.addAttribute("message", "테이블이 생성되었습니다.");
//		message veiw파일을 반환한다.
		return "message";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
//		insert view파일을 반환한다.
		return "insert";
	}
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
//			각 name에 따라 맵핑을 시켜준다.
			, @RequestParam("name") String name
			, @RequestParam("middleScore") String middlescore
			, @RequestParam("finalScore") String finalscore){
//		문자로 받은 점수는 정수로 변환시켜주고
		int finalScore = Integer.parseInt(finalscore);
		int middleScore = Integer.parseInt(middlescore);
//		student타입의 객체를 입력가능한 DBCommon형태의 db 생성하여 저장
		DBCommon <Student> db = new DBCommon<Student>("c:/tomcat/studentScore.db", "student");
//		생성한 db에 Student객체를 삽입(파라미터에는 위에서 입력받은 자료를 맵핑
		db.insertData(new Student(name, middleScore, finalScore));
//		view파일에 표시될 message변수를 "데이터가 삽입되었습니다."로 대입
		model.addAttribute("message", "데이터가 삽입되었습니다.");
//		insert view파일을 반환한다.
		return "message";
	}
}
