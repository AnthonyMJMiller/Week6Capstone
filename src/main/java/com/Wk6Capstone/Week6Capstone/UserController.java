package com.Wk6Capstone.Week6Capstone;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Wk6Capstone.Week6Capstone.entity.Users;
import com.Wk6Capstone.Week6Capstone.repo.UsersRepo;

public class UserController {
	
	@Autowired
	UsersRepo userRepo;
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login");
	}

	@PostMapping("/login")
	// get the username and password from the form after submission.
	public ModelAndView submitLoginForm(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		// Find the matching user.
		Users user = userRepo.findByEmail(email);
		if (user == null || !password.equals(user.getPassword())) {
			// If the user or password don't match, display an error message.
			return new ModelAndView("login","message", "Incorrect username or password.");
			
		}
		
		// On successful login, add the user to the session.
		session.setAttribute("user", user);
		
		// A flash message will only show on the very next page. Then it will go away.
		// It is useful with redirects since you can't add attributes to the mav.
		redir.addFlashAttribute("message", "Logged in.");
		return new ModelAndView("redirect:/showTasks");
	}
	
	@RequestMapping("/newuser")
	public ModelAndView newUserForm() {
		return new ModelAndView("useraddform");
		
	}
	
	@PostMapping("/adduser")
	public ModelAndView addUser(HttpSession session,RedirectAttributes redir,@RequestParam("email")String email, @RequestParam("password")String password) {
		Users user = new Users(null,email,password,null, null);
		userRepo.save(user);
		session.setAttribute("user", user);
		redir.addFlashAttribute("message", "Logged in.");
		return new ModelAndView("redirect:/tasklist");
		
	}

}
