package com.Wk6Capstone.Week6Capstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Wk6Capstone.Week6Capstone.entity.Tasks;
import com.Wk6Capstone.Week6Capstone.entity.Users;
import com.Wk6Capstone.Week6Capstone.repo.TasksRepo;

@Controller
public class TaskController {
	
	@Autowired
	TasksRepo tasksRepo;
	
	@RequestMapping("/tasklist")
	public ModelAndView viewTaskList(@SessionAttribute(name="user", required=false) Users user, RedirectAttributes redir) {
			// For this URL, make sure there is a user on the session.
			if (user == null) {
				// if not, send them back to the login page with a message.
				redir.addFlashAttribute("message", "Wait! Please log in.");
				return new ModelAndView("redirect:/index");
			}
			
			// if the user is logged in, proceed as normal.
			ModelAndView mv = new ModelAndView("tasklist");
			mv.addObject("items", tasksRepo.findAllByUser(user));
			System.out.println(tasksRepo.findAll().toString());
			return mv;
		}
	
	@RequestMapping("/delete")
	public ModelAndView deleteTask(@RequestParam("taskid")Integer tId) {
		tasksRepo.deleteById(tId);
		return new ModelAndView("redirect:/tasklist");
	}
	
	@RequestMapping("/addtask")
	public ModelAndView showForm(@RequestParam("userid") Integer pId){
		
		ModelAndView mv =  new ModelAndView("addtask", "userid", pId);
	
		return mv ;
		
	}
	
	@RequestMapping("/addtaskone")
	public ModelAndView addingTask(Tasks addedTask) {
		
		tasksRepo.save(addedTask);
		return new ModelAndView ("redirect:/tasklist");
	}

}
